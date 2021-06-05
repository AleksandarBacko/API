package day50_inheritance;

public class Ebook extends Book{
    int size;
    int pages;

    public void readBook(){
        System.out.println("Read book");
        System.out.println("author: "+author);
        System.out.println("title: "+title);
        System.out.println("type = " + type);
    }
}
