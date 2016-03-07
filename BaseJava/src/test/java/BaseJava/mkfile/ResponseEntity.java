package BaseJava.mkfile;

import java.util.Map;

/**
 * Created by liuyong on 15-11-5.
 */
public class ResponseEntity {
    private int code;

    private String desc;

    private Map<String, String> headers;

    private String content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" + "code=" + code + ", desc='" + desc + '\'' + ", content='" + content + '\'' + '}';
    }
}
