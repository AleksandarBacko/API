package day55_abstruction.interface_demo;

public interface WebDriver {
    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quit();//is automaticli public abstract
    String getTitle();

}
