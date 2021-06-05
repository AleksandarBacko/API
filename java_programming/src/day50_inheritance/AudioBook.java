package day50_inheritance;

public class AudioBook extends Book{
        int length;
        String narrator;
        public void listen(){
            System.out.println("listening to audoibook");
            System.out.println("title - "+title);
            System.out.println("author = " + author);
            System.out.println("price = " + price);
            System.out.println("length = " + length);
            System.out.println("narrator = " + narrator);
        }
}
