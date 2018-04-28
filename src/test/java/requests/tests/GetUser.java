package requests.tests;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUser {


    @Test
    public void testGetUser(){
        expect().
                statusCode(200).
                body(
                "data.id", equalTo(2),
                "data.first_name", equalTo("Janet"),
                "data.last_name", equalTo("Weaver")).
                when().
                get("https://reqres.in/api/users/2");
    }

    @Test
    public void testGetNotExistedUser(){
        expect().
                statusCode(404).
                when().
                get("https://reqres.in/api/users/23");
    }
}
