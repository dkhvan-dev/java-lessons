import java.sql.Statement;
import java.util.Scanner;

public class untitled {
    public static final Scanner console = new Scanner(System.in);

    public static class Task1 {
        public static void main(String[] args) {
            String s = console.nextLine();
            int n = console.nextInt();
            while (n > 0) {
                System.out.println(s);
                n--;
            }
        }
    }

    public static class Task2 {
        public static void main(String[] args) {
            int n = console.nextInt();

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static class Task3 {
        public static void main(String[] args) {
            int n = console.nextInt();
            int m = console.nextInt();

            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static class Task4 {
        public static void main(String[] args) {
            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();
            int d = console.nextInt();

            for (int i = a; i <= b; i++) {
                if (i % d == c) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static class Task5 {
        public static void main(String[] args) {
            int k = console.nextInt();
            int n = console.nextInt();
            int w = console.nextInt();
            int sum = 0;

            for (int i = 1; i <= w; i++) {
                sum += k*i;
            }

            if (sum > n) {
                System.out.print(sum - n);
            } else {
                System.out.print(0);
            }
        }
    }

}
