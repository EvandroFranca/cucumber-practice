package practice.api.requests;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class UserRequest {

    private final String BASE_URL = "https://petstore.swagger.io/v2";
    private RequestSpecification spec;

    public UserRequest() {
        spec = RestAssured.with().baseUri(BASE_URL).header("Content-Type", "application/json");
    }

    public RequestSpecification getSpec() {
        return spec;
    }
}
