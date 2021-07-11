package day59_polymorphisam_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link=new Link();
        link.click();
        link.getLinkHref();
        link.getLinkHref();
        link.getText();
        link.sendKeys("hi");
        WebElement loginLink=new Link();
        loginLink.click();
        loginLink.getText();
    }
}
