package BaseJava.mkfile;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liuyong
 */
public class HttpClient {

    private Pattern P_STATUS_LINE;

    private Pattern P_HEADER_LINE;

    private Pattern P_EMPTY_LINE;

    {
        String HTTP_VERSION = "([Hh][Tt]{2}[Pp]/1\\.[01])";
        String STATUS_CODE = "([1-5]\\p{Digit}{2})";
        String REASON_PHRASE = "(.+)";
        String SPACE = "\\p{Space}+";
        String STATUS_LINE = "^" + HTTP_VERSION + SPACE + STATUS_CODE + SPACE + REASON_PHRASE + "$";

        P_STATUS_LINE = Pattern.compile(STATUS_LINE);

        P_HEADER_LINE = Pattern.compile("^([^:]+):\\p{Space}+(.+)$");

        P_EMPTY_LINE = Pattern.compile("^$");

    }

    private HttpClient() {
    }

    public static HttpClient getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {

        public static HttpClient instance = new HttpClient();
    }

    public ResponseEntity get(String resource) throws IOException {
        try {
            OutputStream os = null;
            BufferedReader reader = null;
            Socket client = null;
            try {
                // 1. 解析资源定位符
                URL url = new URL(resource);
                String host = url.getHost();
                int port = url.getPort() == -1 ? 80 : url.getPort();
                String path = url.getPath().isEmpty() ? "/" : url.getPath();

                // 2. 建立连接
                InetAddress ipAddress = InetAddress.getByName(host);
                SocketAddress socketAddress = new InetSocketAddress(ipAddress, port);
                client = new Socket();
                client.connect(socketAddress, 3000);// connect time out

                // 3. 发送请求
                String request = "GET " + path + " HTTP/1.1\r\n" + "Host:" + host + "\r\n" + "\r\n";
                os = client.getOutputStream();
                os.write(request.getBytes("UTF-8"));
                os.flush();

                // 4. 等待返回
                InputStream is = client.getInputStream();
                reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                String line;
                List<String> response = new ArrayList<String>();
                while ((line = reader.readLine()) != null) {
                    response.add(line);
                }
                if (response.size() == 0) {
                    throw new RuntimeException("Can not get response from " + resource);
                }
                // 5.格式化返回值
                return parseResponse(response);
            } finally {
                close(os, reader, client);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to download resource: " + resource, e);
        }

    }

    private void close(Closeable... resources) throws IOException {

        for (Closeable resource : resources) {
            if (resource != null) {
                resource.close();
            }
        }
    }

    private ResponseEntity parseResponse(List<String> response) {
        ResponseEntity entity = new ResponseEntity();

        Iterator<String> iter = response.iterator();
        String line;
        // 1.状态行
        line = iter.next();
        Matcher matcher = P_STATUS_LINE.matcher(line);
        if (!matcher.matches()) {
            throw new RuntimeException("Illegal format status line : " + line);
        }

        int statusCode = Integer.valueOf(matcher.group(2));
        String statusDesc = matcher.group(3);
        entity.setCode(statusCode);
        entity.setDesc(statusDesc);

        // 2.头信息
        Map<String, String> headers = new HashMap<String, String>();
        while (iter.hasNext()) {
            line = iter.next();
            Matcher emptyMatcher = P_EMPTY_LINE.matcher(line);
            if (emptyMatcher.matches()) {
                break;
            }
            Matcher headerMatcher = P_HEADER_LINE.matcher(line);

            if (!headerMatcher.matches()) {
                throw new RuntimeException("Illegal format header line : " + line);
            }
            String key = headerMatcher.group(1);
            String value = headerMatcher.group(2);
            headers.put(key, value);
        }
        entity.setHeaders(headers);

        // 3.消息体
        StringBuilder content = new StringBuilder();
        while (iter.hasNext()) {
            line = iter.next();
            content.append(line).append(System.lineSeparator());
        }
        if (content.length() > 0) {
            content.setLength(content.length() - System.lineSeparator().length());
        }
        entity.setContent(content.toString());
        return entity;

    }

    public static void main(String[] args) throws IOException {
        HttpClient util = HttpClient.getInstance();
        ResponseEntity entity = util.get("http://fresh.qunar.com/sites/task3_prop.txt");
    }

}
