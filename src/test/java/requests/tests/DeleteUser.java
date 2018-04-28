package requests.tests;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class DeleteUser {

    @Test
    public void testDeleteUser(){
        expect().
                statusCode(204).
                when().
                delete("https://reqres.in/api/users/2");
    }

    @Test
    public void testDeleteNotExistedUser(){
        expect().
                statusCode(204).
                when().
                delete("https://reqres.in/api/users/999");
    }
}
