package variables;

import java.util.Locale;

public class C04_String {
    public static void main(String[] args) {

String string= "Hakan Kara size merhaba diyor ve verimli bir ders diliyor. 23.4.2003";

String str= string.toUpperCase();
        System.out.println(str);

String lowerCase= string.toLowerCase();
        System.out.println(lowerCase);

        char firstChar= string.charAt(11);
        System.out.println(firstChar);

        char secondChar= string.charAt(19);
        System.out.println(secondChar);

        System.out.println(""+firstChar+secondChar);
        System.out.println(firstChar+secondChar);

        String sub= string.substring(8, 15);
        System.out.println(sub);

        String sub2= string.substring(12);
        System.out.println(sub2);

        boolean isStart= string.startsWith("Kara");
            System.out.println(isStart);

            boolean isEnd= string.endsWith("merhaba");
            System.out.println(isEnd);

            boolean contains= string.contains("ve");
            System.out.println(contains);







    }
}
