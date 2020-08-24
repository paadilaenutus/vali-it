import java.sql.SQLOutput;

public class Lesson1MathUtil {

    public static void main(String[] args) {
        int minimum = min(-3, 5);
        int maximum = max(3, 5);
        int absolute = abs(-1154);
        boolean odds = isEven(888);
        int minimum3 = min(3, 3, 5);
        int maximum3 = max(6, 6, 4);
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(absolute);
        System.out.println(odds);
        System.out.println(minimum3);
        System.out.println(maximum3);
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
        } return a;
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

