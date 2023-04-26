package variables;

public class C03_Type_Casting {
    public static void main(String[] args) {

        int first = 3576873;
        System.out.println(first);

        double big = first;
        System.out.println(big);

        byte min = 121;
        System.out.println(min);
        long max = min;
        System.out.println(max);

        float num = 123.568768764F;
        System.out.println(num);
        byte numbers = (byte) num;
        System.out.println(numbers);

        long nmb = 354687987648796L;
        System.out.println(nmb);
        short minNum = (short) nmb;
        System.out.println(minNum);

        System.out.println(Integer.MAX_VALUE);


    }
}
