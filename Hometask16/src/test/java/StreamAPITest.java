import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.example.PostmanGET;
import org.example.PostmanPOST;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.PrintStream;

import org.junit.Test;


import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;

public class StreamAPITest {

    @Test
    public void checkBodyGetRequest() {
        PostmanGET postmanGET = new PostmanGET("bar1", "bar2", "https", "postman-echo.com", "*/*",
                "gzip,deflate", "no-cache", "5c27cd7d-6b16-4e5a-a0ef-191c9a3a275f", "PostmanRuntime/7.6.1"
                , "443", "https://postman-echo.com/get?foo1=bar1&foo2=bar2");

        given()
                .baseUri("https://postman-echo.com").
                when()
                .log().all()
                .get("/get?foo1=bar1&foo2=bar2").
                then()
                .log().all().assertThat()
                .statusCode(200);

    }


    @Test
    public void checkBodyPostRequest() {
        PostmanPOST postmanPOST = new PostmanPOST("bar1", "bar2", "https", "443", "postman-echo.com", "Root=1-63e0c942-584c7dab4a1c52d34d581b03", "19", "PostmanRuntime/7.30.1", "*/*",
                "no-cache", "159c6495-8e5f-4ce0-bacd-ac399a86ec03", "gzip, deflate, br", "application/x-www-form-urlencoded");

        given()
                .log().all()
                .when()
                .contentType(ContentType.JSON)
                .body(postmanPOST)
                .post("https://postman-echo.com/post")
                .then()
                .log().all().assertThat()
                .statusCode(200);


    }
}
