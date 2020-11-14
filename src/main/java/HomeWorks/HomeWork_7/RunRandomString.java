package HomeWorks.HomeWork_7;

import Infrastructure.utils.RandomString;

public class RunRandomString {

    public static void main(String[] args) {
        RandomString.StringUtils mode = RandomString.StringUtils.ALPANUMERIC;
        RandomString stringGen = new RandomString();
        System.out.println(stringGen.stringGenerator( mode, 0));

    }
}
