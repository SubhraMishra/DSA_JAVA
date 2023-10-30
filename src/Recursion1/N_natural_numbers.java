package Recursion1;

public class N_natural_numbers {
    public static void main(String args[]) {
        naturalno(5);
    }

    public static void naturalno(int n) {
        if (n > 0) {

            naturalno(n - 1);
            System.out.print(n + " ");
        }
    }
}
