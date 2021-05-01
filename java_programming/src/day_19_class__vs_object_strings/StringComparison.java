package day_19_class__vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Belgrade";
        // case sensitive comparison
        System.out.println(city.equals("Belgrade"));
        System.out.println(city.equalsIgnoreCase("belgrade"));

        //case insensitive comparison
        System.out.println(city.equalsIgnoreCase("Belgrade"));
        System.out.println(city.equalsIgnoreCase("BelGRADE"));

    }
}
