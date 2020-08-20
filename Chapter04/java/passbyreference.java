class my_number {
    public int number;

    public my_number(int num) {
        number = num;
    }
}

public class passbyreference {
    public static void main(String[] args) {
        my_number a = new my_number(1);
        my_number b = new my_number(2);

        System.out.println("Before swap, a = " + a.number);
        System.out.println("Before swap, b = " + b.number);

        swap(a, b);

        System.out.println("After swap, a = " + a.number);
        System.out.println("After swap, b = " + b.number);
    }

    private static void swap(my_number a, my_number b) {
        int temp;
        temp = a.number;
        a.number = b.number;
        b.number = temp;
        System.out.println("inside swap: a = " + a.number);
        System.out.println("inside swap: b = " + b.number);
    }

}