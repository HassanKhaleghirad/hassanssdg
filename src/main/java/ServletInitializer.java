import org.json.JSONObject;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.nio.charset.StandardCharsets;


public class ServletInitializer extends SpringBootServletInitializer {
    public  ServletInitializer(){}

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(new Class[]{UssdcApplication.class});
    }

    public static void main(String[] args) {
        String test = "{\"HH\":\"to علی \\n you all\"}";
        JSONObject object = new JSONObject(test);
        String value = object.getString("HH");
        byte[] utf8 = value.getBytes();
        byte[] utf16 = value.getBytes(StandardCharsets.UTF_16BE);
        System.out.println(new String(utf16, StandardCharsets.UTF_8));
    }
}
