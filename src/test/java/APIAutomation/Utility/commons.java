package APIAutomation.Utility;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;

public class commons {

    public String generateBearerToken(){
        RestAssured.baseURI = constants.baseURL;
        RequestSpecification spec = RestAssured.given();
        Response response = spec.post("/auth/token"); //sending request
        Assertions.assertThat(response.statusCode()).isEqualTo(201);
        JsonPath path = response.jsonPath();
        String token = path.get("token");
        System.out.println(token);
        return token;
    }
}
