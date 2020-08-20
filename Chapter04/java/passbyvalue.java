public class passbyvalue {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Before swap, a = " + a);
        System.out.println("Before swap, b = " + b);

        swap(a, b);

        System.out.println("After swap, a = " + a);
        System.out.println("After swap, b = " + b);
    }

    private static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("inside swap: a = " + a);
        System.out.println("inside swap: b = " + b);
    }

}
