package APIAutomation.TestCases;

import APIAutomation.Utility.commons;
import APIAutomation.Utility.constants;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03_QueryParams {
    String token="";

    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        token = com.generateBearerToken();
    }

    @Test
    public void queryParams(){
        RestAssured.baseURI = constants.baseURL;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization","Bearer "+token);
        Response response =spec.queryParam("name","Iphone")
                        .queryParam("quantity",1)
                .queryParam("price",100000)
                .get("/items/search");
        System.out.println(response.asPrettyString());
        Assertions.assertThat(response.getStatusCode())
                .isEqualTo(200);

            }
}
