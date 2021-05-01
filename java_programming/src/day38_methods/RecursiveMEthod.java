package day38_methods;

public class RecursiveMEthod {
    public static void main(String[] args) {
    printNum(1);
}
    public static void printNum(int num) {
        System.out.print(num+ " ");
        num++;

        printNum(num);

    }
}


/// no run infinite loop