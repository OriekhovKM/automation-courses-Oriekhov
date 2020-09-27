package Infrastructure;

public class TestUrl {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String param;

    public static class Builder {
        private String protocol;
        private String domain;
        private String port;
        private String path;
        private String param;

        public Builder withProtocol (String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder withDomain (String domain) {
            this.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            this.port = port;
            return this;
        }

        public Builder withPath(String path) {
            this.path = path;
            return this;
        }

        public Builder withParam(String param) {
            this.param = param;
            return this;
        }

        public Builder withParam(String param, String param1) {
            this.param = param;
            this.param = param1;
            return this;
        }

        public TestUrl build(){
            TestUrl url = new TestUrl();
            url.protocol = this.protocol;
            url.domain = this.domain;
            url.port = this.port;
            url.path = this.path;
            url.param = this.param;

            return url;
        }


    }
    private TestUrl() {

    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public static void main(String[] args) {
        TestUrl url = new TestUrl.Builder()
                .withProtocol("https://")
                .withDomain("google")
                .withPort("[:8800]")
                .withParam("=search")
                .withParam("&123=true","|| false")
                .build();
        String s = String.valueOf(url);
        System.out.println(s);
    }
}
