package BaseJava.mkfile;

import java.io.*;

import org.apache.log4j.Logger;



/**
 * Created by lyong.liu on 2015/10/31.
 */
/**
 * Implement the interface from GetData
 */
public class GetDater {

    /**
     * @param domain is a URL used to make the Novel to ArrayList
     */
    static final String LOGGERNAME = "GetDataer";
    Logger logger = Logger.getLogger(LOGGERNAME);

    /**
     * @param domain is a URL used to make the Novel to String
     */
    public String getStrDataUrl(String domain, String charset) {
        StringBuffer sb = new StringBuffer();
        try {
            java.net.URL url = new java.net.URL(domain);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                if (!line.equals(""))
                    sb.append(line + System.lineSeparator());
                else {
                    sb.append(" " + System.lineSeparator());
                }
            }
            in.close();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return sb.toString();
    }

    /**
     * @param sFileName is a Filename this Function used to get Data from a file
     */
    public String getDataFile(String sFileName, String charset) {

        StringBuffer sb = new StringBuffer();
        File fName = new File(sFileName);
        BufferedReader brIn = null;
        InputStreamReader reader = null;
        try {
             reader = new InputStreamReader(
                    new FileInputStream(sFileName),charset);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + System.lineSeparator());
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    logger.error(e.getMessage());
                }
        }
        return sb.toString();
    }

    public String getStrSocket(String domain) {

        HttpClient util = HttpClient.getInstance();

        ResponseEntity entity = null;
        try {
            entity = util.get(domain);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        return entity.getContent();
    }

}
