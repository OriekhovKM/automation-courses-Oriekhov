package Infrastructure;

public class TestUrl {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private String param;


    private TestUrl (Builder builder) {
        this.protocol = builder.protocol;
        this.domain = builder.domain;
        this.port = builder.port;
        this.path = builder.path;
        this.param = builder.param;

    }

    @Override
    public String toString() {
        return this.protocol +this.domain +this.port +this.path + this.param;
    }

    public static class Builder {
        private String protocol = "";
        private String domain = "";
        private String port = "";
        private String path = "";
        private String param = "";


        public Builder withProtocol(String protocol) {
            if (protocol.endsWith("://")) {
                this.protocol = protocol;
            } else this.protocol = protocol + "://";
            return this;
        }

        public Builder withDomain(String domain) {
            if (domain.endsWith(".")) {
                this.domain = this.domain + domain;
            } else this.domain = this.domain + domain + ".";
            return this;
        }

        public Builder withPort(String port) {
            if (port.startsWith(":")) {
                this.port = port;
            } else this.port =  ":" + port;
            return this;
        }

        public Builder withPath(String path) {
            if (path.startsWith("/")) {
                this.path = this.path + path;
            } else this.path = this.path + "/" + path;
            return this;
        }

        public Builder withParam(String param) {
            if (param.startsWith("?")) {
                this.param = param;
            } else this.param = "?"  + param;
            return this;
        }

        public Builder withParam(String param1, String param2) {
            if (param1.contains("&")) {
                this.param = param + param1 + param2;
            } else this.param = param + param1 + "&" + param2;
            return this;
        }

        public TestUrl build() {
            if (this.domain.endsWith(".")){
               this.domain = this.domain.substring(0, this.domain.length()-1);
            }
            TestUrl url = new TestUrl(this);
            return url;
        }

        public static void main(String[] args) {
            TestUrl url = new TestUrl.Builder()
                    .withProtocol("https")
                    .withDomain("google")
                    .withDomain("com")
                    .withPort("8080")
                    .withPath("search")
                    .withPath("searchPicture")
                    .withParam("query")
                    .withParam("enabled", "false")
                    .build();

            System.out.println(url);
        }
    }
}
