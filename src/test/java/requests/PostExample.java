package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Test;
import static org.junit.Assert.*;

public class PostExample {

    @Test
    public void postExample(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "morpheus");
        jsonObject.put("job", "leader");

        requestSpecification.body(jsonObject.toString());

        Response response = requestSpecification.post("https://reqres.in/api/users");

        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        assertEquals(201, response.getStatusCode());
    }
}
