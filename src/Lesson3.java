import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("sumof2")){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(sum(n, m));
        }
        else if (input.equalsIgnoreCase("sumarr")){
            int[] x = new int[5];
            System.out.println(sum(x));
        }
        else if (input.equalsIgnoreCase("fact")){
            int n = scanner.nextInt();
            System.out.println(factorial(n));
        }
        else if (input.equalsIgnoreCase("sort")){
            int[] a = new int[]{9, 9, 9, 1, 9, 9, 9, 1, 9, 9};
            System.out.println(Arrays.toString(sort(a)));
        }
        else if (input.equalsIgnoreCase("prime")){
            int x = scanner.nextInt();
            System.out.println(isPrime(x));
        }
        else if (input.equalsIgnoreCase("reverse")){
            String lause = scanner.nextLine();
            System.out.println(reverseString(lause));
        }
    }

    public static int sum(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus
        return x + y;
    }

    public static int sum(int[] x){
        // Todo liida kokku kõik numbrid massivis x
        int[] arr = {1, 3, 5, 7, 9};
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        int fact = 1;
        for (int i = 1; i<=x;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        int temp = 0;
        for(int j = 0; j<a.length; j++){
            for (int i = 1; i<a.length; i++){
                if (a[i]<a[i-1]){
                    temp = a[i];
                    a[i] = a[i-1];
                    a[i - 1] = temp;
                }
            }
        }

        return a;
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        int length = a.length();
        for (int i=length; i> 0; i--){
            System.out.print(a.substring(i - 1, i));
        }
        return "";
    }

    public static boolean isPrime(int x){
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        if (x == 2 || x == 5) // kontrollib ainsat primaarset paarisarvu ja ainsat 5-ga lõppevat primaarset arvu
            return true;
        else if (x % 2 == 0 || x == 1) // välistab ülejäänud paarisarvud ja ühe
            return false;
        for (int i = 3; i < x; i++) { // kontrollib arve alates neljast (kuigi eelnevaid tingimusi arvestades võiks alata ka seitsmest)
            if (x % i == 0){
                return false;
            }
        }
        return true; //kui eelnevad tingimused ei kehti, on tegemist primaararvuga
    }

}
