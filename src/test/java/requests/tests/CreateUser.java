package requests.tests;

import org.json.simple.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.*;

public class CreateUser {

    @Test
    public void testCreateUser(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "NEW NAME");
        jsonObject.put("job", "NEW JOB");

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toString()).
                when().
                post("https://reqres.in/api/users").
                then().
                assertThat().
                statusCode(201);
    }
}
