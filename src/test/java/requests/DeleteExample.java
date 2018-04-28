package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteExample {

    @Test
    public void deleteExample(){
        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.delete("https://reqres.in/api/users/2");

        System.out.println(response.asString());
        System.out.println(response.getStatusCode());
        assertEquals(204, response.getStatusCode());
    }
}
