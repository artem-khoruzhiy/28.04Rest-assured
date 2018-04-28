package requests.tests;

import static io.restassured.RestAssured.*;
import org.junit.Test;

public class GetListOfUsers {

    @Test
    public void testGetListOfUsers(){
        expect().
                statusCode(200).
                when().
                get("https://reqres.in/api/users");
    }
}
