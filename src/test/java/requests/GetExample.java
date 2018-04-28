package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetExample {

    public String url = "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

    @Test
    public void testResponseCode(){
        Response response = RestAssured.get(url);
        System.out.println("Reponse code: " + response.getStatusCode());
        assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testBody(){
        Response response = RestAssured.get(url);

        String data = response.asString();
        System.out.println(response.getTime());
        System.out.println(data);

    }
}
