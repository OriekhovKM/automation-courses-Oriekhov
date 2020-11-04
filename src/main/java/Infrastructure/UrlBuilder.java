package Infrastructure;



import java.util.*;
import java.util.stream.Collectors;

public class UrlBuilder {
    private String protocol;
    private String domain;
    private String port;
    private String path;
    private HashMap<String, String> param;





    public static class Builder {
        private String protocol = "";
        private String domain = "";
        private String port = "";
        private String path = "";
        HashMap<String, String> param = new HashMap<String, String>();


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
            this.param.put("?"+param,"");
            return this;
        }

        public Builder withParam(String param1, String param2) {
            this.param.put(param1, param2);
            return this;
        }


        public Builder withParam(HashMap<String,String>param) {

           this.param.putAll(param);
           return this;
        }
        public String hashMapToString(HashMap<String, String> map) {

            String mapAsString = map.keySet().stream()
                    .map(key -> key + "=" + map.get(key))
                    .collect(Collectors.joining("&", "", ""));
            return mapAsString;
        }


        public String build() {
            if (this.domain.endsWith(".")){
                this.domain = this.domain.substring(0, this.domain.length()-1);
            }

            return new StringBuilder()
                    .append(this.protocol)
                    .append(this.domain)
                    .append(this.port)
                    .append(this.path)
                    .append(hashMapToString(this.param))
                    .toString();
        }

        public static void main(String[] args) {
            HashMap <String, String> param = new HashMap<String, String>();
            param.put ("q", "query");
            param.put ("oq", "123456789");
            param.put ("sq", "params+this");


            String url = new UrlBuilder.Builder()
                    .withProtocol("http")
                    .withDomain("google")
                    .withDomain("com")
                    .withPort("8080")
                    .withPath("search")
                    .withPath("searchPicture")
                    .withParam("param1")
                    .withParam("param2", "param3")
                    .withParam("param4", "param5")
                    .withParam("param6", "param7")
                    .withParam(param)
                    .build();

            System.out.println(url);
        }
    }
}
