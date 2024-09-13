public class Reduce {
    public static void main(String[] args) {

        int n = 100;
        int steps = 0;
        while (n > 0) {

            steps++;
            boolean iseven = n % 2 == 0;
            boolean isodd = n % 2 == 1;

            if (iseven) {
                n = n / 2;
            }

            else if (isodd) {
                n = n - 1;
            }
        }
        System.out.println(steps);
    }
}
