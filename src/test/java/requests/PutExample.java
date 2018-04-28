package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Test;
import static org.junit.Assert.*;

public class PutExample {

    @Test
    public void putExample(){
        RequestSpecification requestSpecification = RestAssured.given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "lalala");
        jsonObject.put("job", "blablabla");
        requestSpecification.body(jsonObject.toString());
        requestSpecification.header("Content-Type", "application/json");


        Response response = requestSpecification.put("https://reqres.in/api/users/2");
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        assertEquals(200, response.getStatusCode());

    }
}
