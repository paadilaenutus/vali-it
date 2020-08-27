import java.util.*;

// Enne kui seda tegema hakkad tee ära Lesson 2 (välja arvatud ülesanded 6, 8, 9)
public class Lesson3Hard {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
      //  int a = scanner.nextInt();
    //    System.out.println(evenFibonacci(a));
    //    randomGame();
     //   Scanner scanner = new Scanner(System.in);
    //    String string = scanner.nextLine();
        String string = "tenno";
        morseCode(string);
    }

    public static int evenFibonacci(int x) {
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x

        if (x < 3) {
            return 0;
        }
        List<Integer> fibo = new ArrayList<>();
        int sum = 0;
        for (int i = 3; i <= x; i = i + 3) {
            fibo.add(fibonacci(i - 1) + fibonacci(i - 2));
        }
        for (Integer i : fibo) {
            sum = sum + i;
        }
        return sum;
    }

    public static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        } else {
            return i == 1 ? 1 : fibonacci(i - 1) + fibonacci(i - 2);
        }
    }


    public static void randomGame() {
        // TODO kirjuta mäng mis võtab suvalise numbri 0-100, mille kasutaja peab ära arvama
        // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
        // ja kasutaja peab saama uuesti arvata
        // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
        Random random = new Random();
        int i = random.nextInt(100);
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int roll = 0;
        do {
            roll = scanner.nextInt();
            if (roll == i) {
                counter++;
                System.out.println("Sul kulus õige arvu ära arvamiseks kordi: " + counter);
            } else if (roll > i && roll <= 100){
                counter++;
                System.out.println("Õige arv on väiksem");
            } else if (roll < i && roll >= 0) {
                counter++;
                System.out.println("Õige arv on suurem");
            } else {
                System.out.println("Viga");
                return;
            }
        }while (roll < i && roll >= 0 || roll > i && roll <= 100);
        System.out.println();
    }

    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja -
        HashMap<String, String> morse;
        morse = new HashMap<>();
        morse.put("t", "- ");
        morse.put("e", ". ");
        morse.put("n", "-. ");
        morse.put("o", "--- ");
     // System.out.println(morse);
        String word = "";
        int length = text.length();
        for (int i = 0; i < length; i++) {
            word = word + morse.get(text.substring(i, i + 1));
        }
        System.out.println("sõna" + " \"tenno\"" + " on morse koodis: " + word);
        return "";
    }
}
