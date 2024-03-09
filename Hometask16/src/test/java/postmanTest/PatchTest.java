package postmanTest;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import postman.post.Root;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PatchTest {
    private static RequestSpecification specification;

    @BeforeAll
    static void setUp() {

        specification = RequestSpecificationCreator
                .getReqSpec("patch");
    }

    @Test
    public void patchMethod() {
        Root roots = given()
                .spec(specification)
                .when()
                .patch()
                .then().statusCode(HTTP_OK).log().all()
                .extract().body().as(Root.class);

        assertAll(

                () -> assertEquals("https", roots.getHeaders().getXForwardedProto(), "XForwardedProto не соответствует ожидаемому"),
                () -> assertEquals("443", roots.getHeaders().getXForwardedPort(), "XForwardedPort не соответствует ожидаемому"),
                () -> assertEquals("postman-echo.com", roots.getHeaders().getHost(), "Host не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getXAmznTraceId(), "XAmznTraceId не должен быть null"),
                () -> assertNotNull(roots.getHeaders().getContentLength(), "ContentLength не должен быть null"),
                () -> assertEquals("Apache-HttpClient/4.5.13 (Java/11.0.21)", roots.getHeaders().getUserAgent(), "UserAgent не соответствует ожидаемому"),
                () -> assertEquals("*/*", roots.getHeaders().getAccept(), "Accept не соответствует ожидаемому"),
                () -> assertNotNull(roots.getHeaders().getAcceptEncoding(), "AcceptEncoding не должен быть null"),
                () -> assertEquals("https://postman-echo.com/patch", roots.getUrl(), "url не соответствует ожидаемому")
        );
    }
}
