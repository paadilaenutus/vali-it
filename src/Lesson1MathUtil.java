import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson1MathUtil {

    public static void main(String[] args) {
        System.out.println("Call method: ");
        Scanner string1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String query = string1.nextLine();
        if (query.equalsIgnoreCase("minimum")) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(min(n, m));
        }
        else if (query.equalsIgnoreCase("maximum")) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(max(n, m));
        }
        else if (query.equalsIgnoreCase("absolute")) {
            int n = scanner.nextInt();
            System.out.println(abs(n));
        }
        else if (query.equalsIgnoreCase("oddeven")) {
            int n = scanner.nextInt();
            System.out.println(isEven(n));
        }
        else if (query.equalsIgnoreCase("maximum3")) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(max(n, m, k));
        }
        else if (query.equalsIgnoreCase("minimum3")) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(min(n, m, k));
        }
        else System.out.println("Incorrect input");
    }

    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus
        if (a < b) {
            return a;
        } else return b;
    }

    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;
        } else return b;
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a < 0) {
            a *= -1;
        }
        return a;
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        return (a % 2 == 0);
    }

    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= a && b <= c) {
            return b;
        } else return c;
    }

    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        } else return c;
    }
}

