package org.example;

public class PostmanPOST {
    private String foo1;
    private String foo2;

    private String x_forwarded_proto;
    private String x_forwarded_port;
    private String host;
    private String x_amzn_trace_id;
    private String content_length;
    private String user_agent;
    private String accept;
    private String cache_control;
    private String postman_token;
    private String accept_encoding;
    private String content_type;

    public PostmanPOST() {
    }

    public PostmanPOST(String foo1,String foo2,String x_forwarded_proto, String x_forwarded_port, String host, String x_amzn_trace_id, String content_length, String user_agent, String accept, String cache_control, String postman_token, String accept_encoding, String content_type) {
        this.x_forwarded_proto = x_forwarded_proto;
        this.x_forwarded_port = x_forwarded_port;
        this.host = host;
        this.x_amzn_trace_id = x_amzn_trace_id;
        this.content_length = content_length;
        this.user_agent = user_agent;
        this.accept = accept;
        this.cache_control = cache_control;
        this.postman_token = postman_token;
        this.accept_encoding = accept_encoding;
        this.content_type = content_type;
    }

    public String getX_forwarded_proto() {
        return x_forwarded_proto;
    }

    public String getX_forwarded_port() {
        return x_forwarded_port;
    }

    public String getHost() {
        return host;
    }

    public String getX_amzn_trace_id() {
        return x_amzn_trace_id;
    }

    public String getContent_length() {
        return content_length;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public String getAccept() {
        return accept;
    }

    public String getCache_control() {
        return cache_control;
    }

    public String getPostman_token() {
        return postman_token;
    }

    public String getAccept_encoding() {
        return accept_encoding;
    }

    public String getContent_type() {
        return content_type;
    }
}
