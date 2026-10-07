package APIAutomation.TestCases;

import APIAutomation.Utility.commons;
import APIAutomation.Utility.constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04_PathParams {
    String token="";

    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        token = com.generateBearerToken();
    }

    @Test
    public void pathParams(){
        RestAssured.baseURI = constants.baseURL;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization","Bearer "+token);
        Response response =spec.pathParam("id",2)
                .get("/items/{id}");
        System.out.println(response.asPrettyString());
        Assertions.assertThat(response.getStatusCode())
                .isEqualTo(200);

            }
}
