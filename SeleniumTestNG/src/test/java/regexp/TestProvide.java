package regexp;

import java.util.Arrays;

public class TestProvide {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до (может быть, а может и не быть)
        (x|y|z) - одна строка из множетва строк

        [a-Za-z] - все английские буквы (большие и маленькие)
        ^ - отрициние
         */

        String a = "-2423";
        String b = "2423";
        String c = "+2423";

        System.out.println(a.matches("-?\\d*"));
        System.out.println(b.matches("-?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "1m3ax28";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e = "hello";
        String e2 = "asdf";
        System.out.println(e.matches("[^abc]*"));
        System.out.println(e2.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://www.ukraine.ua";
        String url3 = "http://www.ukraine.!";
        System.out.println(url.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ua)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ua)"));

        String f = "123456";
        System.out.println(f.matches("\\d{7,}"));


        String q = "Hello432432there4234324hey432432ffwe";
        String[] words = q.split("\\d+");
        System.out.println(Arrays.toString(words));

        String l = "Hello4324324there432432423hey";
        System.out.println(l.replaceAll("\\d+", "-"));
        System.out.println(l.replaceFirst("\\d+", "-"));
    }
}
