package Operators;

public class AritmetikOperators {
    public static void main(String[] args) {

    //Toplama
        int x= 25;
        int y= 14;
        int toplam= x+y;
        System.out.println("toplam = " + toplam);

        //Çıkarma
        double a = 25.567834534;
        double b = 14.332678656;
        double cikanSonuc= a-b;
        System.out.println("cikanSonuc = " + cikanSonuc);

        //çarpma
        float c= 2.51f;
        float d= 3.48f;
        float carpma= c*d;
        System.out.println("carpma = " + carpma);

        //bölme
        long e= 12354687963598795L;
        long f= 11130015879523000L;
        long bolme= e/f;
        System.out.println("bolme = " + bolme);

        //modulus
        long modulus= e%f;
        System.out.println("modulus = " + modulus);

        //artırma
        short k= 12;
        k++;  //k=12+1;
        System.out.println("k = " + k);

        //eksiltme
        byte z= 19;
        z--; //z=19+1;
        System.out.println("z = " + z);

    }
}
