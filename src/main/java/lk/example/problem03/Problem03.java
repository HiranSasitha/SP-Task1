package lk.example.problem03;

public class Problem03 {

    public static void main(String[] args) {
        int numb = 100;
        fibonacciNumbers(numb);
    }

    private static void fibonacciNumbers(int numb) {
        int a = 0, b = 1, c = 1;

        for (int x = 1; x <= numb; x++) {
            System.out.print(a + ",");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
