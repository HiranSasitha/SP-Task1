package lk.example.problem5;

public class Problem5 {

    public static void main(String[] args) {
        solve("", 1, 0, 0);
    }

    private static void solve(String expr, int pos, long prev, long value) {
        if (pos == 10) {
            if (value + prev == 100) {
                System.out.println(expr + " = 100");
            }
            return;
        }

        int num = pos;

        //  '+'
        solve(expr + "+" + num, pos + 1, num, value + prev);

        // '-'
        solve(expr + "-" + num, pos + 1, -num, value + prev);


        long newPrev = (prev >= 0 ? prev * 10 + num : prev * 10 - num);
        solve(expr + num, pos + 1, newPrev, value);
    }
}

