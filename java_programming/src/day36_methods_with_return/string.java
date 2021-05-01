package day36_methods_with_return;

public class string {
    public static void main(String[] args) {
//        String sr = "ame of";
////        System.out.println(sr.indexOf("game"));
////
////        int o = 0 % 2;
////        System.out.println(o);
////
////
////        for (int i = 0; i <= str.length(); i += 2) {
////            System.out.println(str.charAt(i));
////
////
////        }
//        double[]dub=new double[4];
//       dub[0] = 1.0;
//        dub[2]=42.1;
//        dub=new double[4];
//        dub[1]=17.2;
//        dub[3]=dub.length;
//        System.out.println(Arrays.toString(dub));
        String [] things={"house","shed","slide" ,"zebra","park","garden"};
        for(String s: things){
            switch (s.charAt(1)){
                case'h':
                    System.out.println(1);
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);

            }
        }

    }
}
