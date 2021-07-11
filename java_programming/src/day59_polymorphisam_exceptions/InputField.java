package day59_polymorphisam_exceptions;

public class InputField implements WebElement{
    public static final String TAG_NAME= "input";

    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input field -" +txt );
    }

    @Override
    public void click() {
        System.out.println("clicking on InputField");
    }

    @Override
    public void getText() {

    }
    public void getValue(){

        System.out.println("Getting value in the inputField");

    }
}
