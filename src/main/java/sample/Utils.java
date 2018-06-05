package sample;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Utils {
    public static String makeRequest(String url) {
        StringBuilder content = new StringBuilder();
        try{
            HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
            InputStream inputStream = http.getInputStream();
            int oneLetter;
            while((oneLetter =  inputStream.read()) != -1){
                content.append((char) oneLetter);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return  content.toString();
    }
}
