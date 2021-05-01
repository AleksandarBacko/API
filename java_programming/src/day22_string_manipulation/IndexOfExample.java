package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven," +
                "cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf((",")));
        int indexOfJava =technologies.indexOf("java");
        System.out.println(indexOfJava);
        int indexOfHtml=technologies.indexOf("html");
        System.out.println("indexOfHtml = " + indexOfHtml);

        if (technologies.contains("maven")){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
        if(technologies.indexOf("maven")>=0){
            System.out.println("present");
        }else {
            System.out.println("not present");
        }
    }
}
