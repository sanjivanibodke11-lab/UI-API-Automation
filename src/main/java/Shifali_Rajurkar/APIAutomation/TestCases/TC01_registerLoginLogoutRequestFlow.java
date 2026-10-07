package Shifali_Rajurkar.APIAutomation.TestCases;

import Shifali_Rajurkar.APIAutomation.Utility.constant;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class TC01_registerLoginLogoutRequestFlow{

    String token;

    //------- 1. REGISTER USER----------

    @Test(priority = 1)
    public void registerUser() {
        RestAssured.baseURI = constant.baseURL;
        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body("""
                        {
                            "first_name": "narendra",
                            "last_name": "modi",
                            "address": {
                                "street": "Street 1",
                                "house_number": "12",
                                "city": "City",
                                "state": "State",
                                "country": "Country",
                                "postal_code": "1234AA"
                            },
                            "phone": "0987654321",
                            "dob": "1970-01-01",
                            "password": "R7!qL2#vN9@xP4",
                            "email": "modi@example.com"
                        }
                        """)
                .when()
                .post("/users/register");
        System.out.println("REGISTER USER");
        System.out.println("Status Code : " + response.statusCode());
        System.out.println("Response    : " + response.asString());

        Assertions.assertThat(response.statusCode())
                .isEqualTo(201);
    }

    //---------- 2. LOGIN USER--------------
    @Test(priority = 2, dependsOnMethods = "registerUser")
    public void loginUser() {
        RestAssured.baseURI = constant.baseURL;
        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body("""
                        {
                            "email": "john12345678@example.com",
                            "password": "R7!qL2#vN9@xP4"
                        }
                        """)
                .when()
                .post("/users/login");
        System.out.println("LOGIN USER");
        System.out.println("Status Code : " + response.statusCode());
        System.out.println("Response    : " + response.asString());

        Assertions.assertThat(response.statusCode())
                .isEqualTo(200);


        // Extract access_token from Login Response

        JsonPath jsonPath = response.jsonPath();

        token = jsonPath.getString("access_token");

        System.out.println("Access Token : " + token);

        Assertions.assertThat(token)
                .isNotNull()
                .isNotEmpty();
    }

    // ---------3. LOGOUT USER---------------

    @Test(priority = 3, dependsOnMethods = "loginUser")
    public void logoutUser() {

        RestAssured.baseURI = constant.baseURL;
        System.out.println("Token used for Logout : " + token);
        Response response = RestAssured.given().header("Authorization", "Bearer " + token).when()
                .get("/users/logout");

        System.out.println("LOGOUT USER");
        System.out.println("Status Code : " + response.statusCode());
        System.out.println("Response    : " + response.asString());

        Assertions.assertThat(response.statusCode())
                .isEqualTo(200);
    }
}
