package APIAutomation.TestCases;

import APIAutomation.Utility.commons;
import APIAutomation.Utility.constants;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_HeadRequest {

    String token="";

    @BeforeMethod
    public void preCondition(){
        commons com = new commons();
        token = com.generateBearerToken();
    }

    //API Chaining
    @Test
    public void headReq(){
        RestAssured.baseURI = constants.baseURL;
        RequestSpecification spec = RestAssured.given();
        spec.header("Authorization","Bearer "+token);
        Response response = spec.head("/items");
        Assertions.assertThat(response.getStatusCode()).isEqualTo(200);
        System.out.println(response.getHeaders());
        Assertions.assertThat(response.getHeaders())
                .isNotEmpty();
        Logger log = LoggerFactory.getLogger(TC01_HeadRequest.class);
        log.info("Information Log");
        log.error("Error Log");
        log.warn("Warn Log");
        log.debug("Debug Log");
    }
}
