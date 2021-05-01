package day_20_string_manipulation;

public class StringReplacment {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.replace("v","z"));

        String word2="adsijasijdi  oaksdokasokd  askdpkaspdk";
        System.out.println(word2.replace("ads","zos"));
        System.out.println(word2.replace("adsijasijdi  oaksdokasokd  askdpkaspdk","java"));
        System.out.println(word2.replace(word2,"java"));
    }
}
