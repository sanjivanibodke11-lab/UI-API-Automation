package APIAutomation.TestCases;

import APIAutomation.Utility.commons;
import APIAutomation.Utility.constants;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TC02_PostRequest {
    String token="";

    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        token = com.generateBearerToken();
    }

    @Test
    public void postReq(){
        RestAssured.baseURI = constants.baseURL;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization","Bearer "+token);
        spec.header("Content-Type","application/json");
        HashMap<Object,Object> hm = new HashMap<>();
        hm.put("name","Iphone");
        hm.put("quantity",1);
        hm.put("price",100000);
        hm.put("category","Electronics");
        spec.body(hm);
        Response response = spec.post("/items");
        System.out.println(response.asPrettyString());
        Assertions.assertThat(response.getStatusCode())
                .isEqualTo(201);
        JsonPath path = response.jsonPath();
        String msg = path.get("message");
        Assertions.assertThat(msg.contains("Item created"))
                .isTrue();
    }
}
