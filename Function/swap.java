public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
         swap(a, b);
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the values of a and b
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("After swapping: a = " + a + ", b = " + b);
    }

        static void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping: a = " + a + ", b = " + b);
        }
    }

