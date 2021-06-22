package day55_abstruction.interface_demo;

public class ChromeDriver implements WebDriver{
    public ChromeDriver() {
        super();
    }

    @Override
    public void get(String url) {
        System.out.println("url = " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("locator = " + locator);
    }

    @Override
    public void quit() {
        System.out.println("quit");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
