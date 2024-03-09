package postman.post;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headers {
    @JsonProperty("x-forwarded-proto")
    private String xForwardedProto;

    @JsonProperty("x-forwarded-port")
    private String xForwardedPort;
    private String host;

    @JsonProperty("x-amzn-trace-id")
    private String xAmznTraceId;

    @JsonProperty("content-length")
    private String contentLength;

    @JsonProperty("user-agent")
    private String userAgent;

    private String accept;

    @JsonProperty("postman-token")
    private String postmanToken;

    @JsonProperty("accept-encoding")
    private String acceptEncoding;

    @JsonProperty("content-type")
    private String contentType;

    private String cookie;
}
