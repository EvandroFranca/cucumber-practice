package practice.contexto;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestContext {

    private ValidatableResponse userResponse;

}
