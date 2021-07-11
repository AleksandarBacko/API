package day59_polymorphisam_exceptions;

public class Link implements WebElement{

    public static final String TAG_NAME= "a";


    @Override
    public void sendKeys(String txt) {
        System.out.println("not supported");

    }

    @Override
    public void click() {
        System.out.println("Click on link");
    }

    @Override
    public void getText() {
        System.out.println("Getting link text");
    }

    public void getLinkHref(){
        System.out.println("https://java.com");

    }
}
