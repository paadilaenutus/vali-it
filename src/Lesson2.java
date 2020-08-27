import javax.management.StringValueExp;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Lesson2 {

    public static void main(String[] args) {

        //   exercise1();
        //   exercise2(4);
        //   exercise3(2, 5);
        // fibonacci(0);
        // System.out.print(fibonacci(7));
        //   exercise5();
        //  Scanner scanner = new Scanner(System.in);
        //  int i = scanner.nextInt();
        //  int j = scanner.nextInt();
        //   exercise5(i, j);
        //exercise6();
        // exercise8();
        exercise9();
    }

    public static void exercise1() {
        // TODO loo 10 elemendile täisarvude massiv
        int[] i = new int[10];
        // TODO loe sisse konsoolist 10 täisarvu
        Scanner scanner = new Scanner(System.in);
        for (int n = 0; n < 10; n++) {
            i[n] = scanner.nextInt();
        }

        // TODO trüki arvud välja vastupidises järiekorras
        for (int j = 9; j >= 0; j--) {
            System.out.println(i[j]);
        }
    }

    public static void exercise2(int x) {
        // TODO prindi välja x esimest paaris arvu
        // Näide:
        // Sisend 5
        // Väljund 2 4 6 8 10
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i < num + 1; i++) {
            System.out.println(i * 2);
        }
    }

    public static void exercise3(int x, int y) {
        // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
        // TODO näiteks x = 3 y = 3
        // TODO väljund
        // 1 2 3
        // 2 4 6
        // 3 6 9
        Scanner scanner = new Scanner(System.in);
        int xx = scanner.nextInt();
        int yy = scanner.nextInt();
        for (int i = 1; i < xx + 1; i++) {
            for (int j = 1; j < yy + 1; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }
    }

    public static int fibonacci(int i) {
        // TODO
        // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // Tagasta fibonacci jada n element
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return (fibonacci(i - 1)) + (fibonacci(i - 2));
        }
    }


    public static void exercise5(int i, int j) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        if (i < 0 || i > 10000 || j < 0 || j > 10000) {
            return;
        }
        //declare amount of cycles(for) and loops(while), declare temp int for storing either i or j depending which is smaller in size
        int cycles = 0;
        int temp = 0;
        int loop = 0;
        if (i < j) {
            cycles = j - i + 1;
            temp = i;
        } else if (j < i) {
            cycles = i - j + 1;
            temp = j;
        }
        //declare counter for every mathematical iteration
        int counter = 0;
        //maxcycle is updated every time when the counter is higher than in previous cycle
        int maxcycle = 0;
        System.out.print(i + " ");
        System.out.print(j + " ");
        for (int k = 0; k < cycles; k++) {
            counter = 0;
            loop = temp + k;
            while (loop != 1) {
                if (loop % 2 != 0) {
                    loop = loop * 3 + 1;
                } else loop = loop / 2;
                //System.out.print(m + " ");
                counter++;
            }
            counter++;
            if (counter > maxcycle) {
                maxcycle = counter;
            }
        }

        System.out.println(maxcycle);
    }


    public static <line2> void exercise6(){
        /*
            Kirjutada Java programm, mis loeb failist visits.txt sisse looduspargi külastajad erinevatel jaanuari päevadel ning
            a) sorteerib külastuspäevad külastajate arvu järgi kasvavalt ning prindib tulemuse konsoolile;
            b) prindib konsoolile päeva, mil külastajaid oli kõige rohkem.
            Faili asukoht tuleb programmile ette anda käsurea parameetrina.
         */
        File visits;
        visits = new File("C:\\Users\\opilane\\IdeaProjects\\vali-it-siim\\resources\\visits.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(visits);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> date = new ArrayList<>();
        int peeps = 0;
        int maxpeeps = 0;
        String maxdate = "";
        String line = "";
        List<Integer> sortList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            peeps = Integer.parseInt(line.substring(12));
            //add to sorting list
            sortList.add(peeps);
            date.add(line);
            if (peeps > maxpeeps) {
                maxpeeps = peeps;
                maxdate = line;
            }
        }
        System.out.println(maxdate);


        Comparator<String> cmp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                int diff = (o1.substring(12)).compareTo(o2.substring(12));
                return (diff == 0) ? (Integer.valueOf(o2.substring(12)).compareTo(Integer.valueOf(o1.substring(12)))): diff;
            }
        };
        Collections.sort(date, cmp);
        System.out.println(date);
    }

    public static void exercise7() {
        // TODO arvuta kasutades BigDecimali 1.89 * ((394486820340 / 15 ) - 4 )
        BigDecimal a = new BigDecimal(1.89);
        BigDecimal b = new BigDecimal("394486820345");
        BigDecimal c = new BigDecimal("15");
        BigDecimal d = new BigDecimal("4");
    }

    public static void exercise8() {
        File nums = new File("C:\\Users\\opilane\\IdeaProjects\\vali-it-siim\\resources\\nums.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(nums);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BigInteger sum = new BigInteger("0");
        BigInteger number = new BigInteger("0");
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            number = new BigInteger(line);
            sum = sum.add(number);
        }
        System.out.println(sum);
        /*
        Failis nums.txt on üksteise all 150 60-kohalist numbrit.

        Kirjuta programm, mis loeks antud numbrid failist sisse ja liidaks need arvud kokku ning kuvaks ekraanil summa.
        Faili nimi tuleb programmile ette anda käsurea parameetrina.

        VASTUS:
        Õige summa: 77378062799264987173249634924670947389130820063105651135266574
         */
    }

    public static void exercise9() {
        /* TODO
        Sama mis eelmises ülesandes aga ära kasuta BigInt ega BigDecimal klassi
         */
        File nums = new File("C:\\Users\\opilane\\IdeaProjects\\vali-it-siim\\resources\\nums.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(nums);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = scanner.nextLine();
        String line2 = scanner.nextLine();
        String kar = line.substring(60);
        String kar2 = line2.substring(60);
        int[] arr1 = new int[60];
        int[] arr2 = new int[60];
        int[] sum = new int[60];
        arr1[59] = Integer.parseInt(kar);
        arr2[59] = Integer.parseInt(kar2);
        sum[59] = Integer.parseInt(kar) + Integer.parseInt(kar2);

        for (int i = 0; i < 149; i++) {
        //    line = scanner.nextLine();
            for (int j = 59; j >= 0; j--) {
                kar = line.substring(j);
                kar2 = line.substring(j);
                arr1[j] = Integer.parseInt(kar);
                arr2[j] = Integer.parseInt(kar2);
            }
            for (int k = 59; k >= 0; k--) {
                sum[k] = arr1[k] + arr2[k];
                if (sum[k] > 9) {
                        arr1[k-1]++;
                }
            }

        }

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();

        }
        System.out.println(sum);
    }

}
