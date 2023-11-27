package ch.zli.m223;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
@QuarkusTest
public class CalculatorResourceTest {
    @Test
    public void testaddNumber() {
        given()
        .when().get("/calculator/add/10/5")
          .then()
          .statusCode(200)
             .body(is("The Result is: 15"));

    }
    
}
