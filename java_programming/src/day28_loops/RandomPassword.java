package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random=new Random();
        String password= "";
        for (int i =1;i<=8;i++) {//anko stavimo -- imacemo infinit loop nikad nece da stane

            int index=random.nextInt(71);
            //System.out.println(random.nextInt(source.length()));
            char read=source.charAt(index);
            password+=read;
            System.out.println( read);

        }
        System.out.println(password);



    }
}
