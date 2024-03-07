package org.example;

public class PostmanGET {
    private String foo1;
    private String foo2;

    private String xForwardedProto;
    private String host;
    private String accept;
    private String acceptEncoding;
    private String cacheControl;
    private String postmanToken;
    private String userAgent;
    private String xForwardedPort;
    private String url;

    public PostmanGET() {
    }

    public PostmanGET(String foo1, String foo2, String xForwardedProto, String host, String accept, String acceptEncoding, String cacheControl, String postmanToken, String userAgent, String xForwardedPort, String url) {
        this.foo1 = foo1;
        this.foo2 = foo2;
        this.xForwardedProto = xForwardedProto;
        this.host = host;
        this.accept = accept;
        this.acceptEncoding = acceptEncoding;
        this.cacheControl = cacheControl;
        this.postmanToken = postmanToken;
        this.userAgent = userAgent;
        this.xForwardedPort = xForwardedPort;
        this.url = url;
    }

    public String getFoo1() {
        return foo1;
    }

    public void setFoo1(String foo1) {
        this.foo1 = foo1;
    }

    public String getFoo2() {
        return foo2;
    }

    public void setFoo2(String foo2) {
        this.foo2 = foo2;
    }

    public String getxForwardedProto() {
        return xForwardedProto;
    }

    public void setxForwardedProto(String xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    public void setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
    }

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getPostmanToken() {
        return postmanToken;
    }

    public void setPostmanToken(String postmanToken) {
        this.postmanToken = postmanToken;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getxForwardedPort() {
        return xForwardedPort;
    }

    public void setxForwardedPort(String xForwardedPort) {
        this.xForwardedPort = xForwardedPort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static void main(String[] args) {
        PostmanGET response = new PostmanGET();
        response.setFoo1("bar1");
        response.setFoo2("bar2");
        response.setxForwardedProto("https");
        response.setHost("postman-echo.com");
        response.setAccept("*/*");
        response.setAcceptEncoding("gzip, deflate");
        response.setCacheControl("no-cache");
        response.setPostmanToken("5c27cd7d-6b16-4e5a-a0ef-191c9a3a275f");
        response.setUserAgent("PostmanRuntime/7.6.1");
        response.setxForwardedPort("443");
        response.setUrl("https://postman-echo.com/get?foo1=bar1&foo2=bar2");

        System.out.println("foo1: " + response.getFoo1());
        System.out.println("foo2: " + response.getFoo2());

        System.out.println("x-forwarded-proto: " + response.getxForwardedProto());
        System.out.println("host: " + response.getHost());

        System.out.println("accept: " + response.getAccept());
        System.out.println("accept-encoding: " + response.getAcceptEncoding());
        System.out.println("cache-control: " + response.getCacheControl());

        System.out.println("postman-token: " + response.getPostmanToken());
        System.out.println("user-agent: " + response.getUserAgent());

        System.out.println("x-forwarded-port: " + response.getxForwardedPort());
        System.out.println("url: " + response.getUrl());

    }
}



