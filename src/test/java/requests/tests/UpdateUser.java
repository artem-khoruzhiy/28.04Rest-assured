package requests.tests;

import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class UpdateUser {

    @Test
    public void testFullUpdate(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "new name");
        jsonObject.put("job", "new job");


        given().
                header("Content-Type", "application/json").
                body(jsonObject.toString()).
                when().
                put("https://reqres.in/api/users/2").
                then().
                assertThat().statusCode(200);
    }

    @Test
    public void testPartialUpdate(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("job", "updated job");

        given().
                header("Content-type", "application/json").
                body(jsonObject.toString()).
                patch("https://reqres.in/api/users/2").
                then().
                assertThat().statusCode(200);
    }
}
