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
        return "TestUrl: " +this.protocol +this.domain +this.port +this.path + this.param;
    }

    public static class Builder {
        private String protocol = "";
        private String domain = "";
        private String port = "";
        private String path = "";
        private String param = "";


        public Builder withProtocol(String protocol) {
            if (protocol.contains("://")) {
                this.protocol = protocol;
            } else this.protocol = protocol + "://";
            return this;
        }

        public Builder withDomain(String domain) {
            if (domain.contains(":")) {
                this.domain = domain;
            } else this.domain = domain + ":";
            return this;
        }

        public Builder withPort(String port) {
            if (port.contains("/")) {
                this.port = port;
            } else this.port = port + "/";
            return this;
        }

        public Builder withPath(String path) {
            if (path.contains("/")) {
                this.path = path;
            } else this.path = path + "/";
            return this;
        }

        public Builder withParam(String param) {
            if (param.contains("?")) {
                this.param = param;
            } else this.param = param + "?";
            return this;
        }

        public Builder withParam(String param1, String param2) {
            if (param1.contains("=")) {
                this.param = param + param1 + param2;
            } else this.param = param + param1 + "=" + param2;
            return this;
        }

        public String build() {
            String url = String.valueOf(new TestUrl(this));
            return url;
        }


        public static void main(String[] args) {
            String url = new TestUrl.Builder()
                    .withProtocol("https")
                    .withDomain("google")
                    .withPort("8080")
                    .withPath("search")
                    .withPath("searchPicture")
                    .withParam("query")
                    .withParam("enabled", "false")
                    .build();

            String url1 = new TestUrl.Builder()
                    .withParam("query")
                    .withPath("search")
                    .withParam("enabled", "false")
                    .withProtocol("https://")
                    .withDomain("google")
                    .withPort("8080")
                    .withPath("searchPicture")
                    .build();

            String url2 = new TestUrl.Builder()
                    .withPath("search")
                    .withParam("enabled", "false")
                    .withProtocol("https://")
                    .withDomain("google")
                    .withPort("8080")
                    .withPath("searchPicture")
                    .build();

            System.out.println(url);
            System.out.println(url1);
            System.out.println(url2);
        }
    }
}
