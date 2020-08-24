public class Lesson1 {

    public static void main(String[] args) {
        excersie1();
        excersie2();
        excersie3();
        excersie4();
    }

    public static void excersie1(){
        // TODO
        // defineeri 3 muutujat a = 1, b = 1, c = 3
        int a = 1;
        int b = 1;
        int c = 3;
        // Prindi v2lja a==b ja a==c
        System.out.println(a==b);
        System.out.println(a==c);
        // Lisa rida a = c
        a = c;
        // Prindi v2lja a==b ja a==c, mis muutus???
        System.out.println(a==b);
        System.out.println(a==c);
    }

    public static void excersie2(){
        // TODO
        // Loo muutujad x1 = 10 ja x2 = 20, vali sobiv andmetyyp
        int x1 = 10;
        int x2 = 20;
        // Tekita muutuja y1 = ++x1, tryki v2lja nii x1 kui y1
        int y1 = ++x1;
        System.out.println(x1);
        System.out.println(y1);
        // Tekita muutuja y2 = x2++, tryki v2lja nii x2 ja y2
        int y2 = x2++;
        System.out.println(x2);
        System.out.println(y2);
        // Analyysi tulemusi
    }

    public static void excersie3(){
        // TODO
        // Loo arvulised muutujad
        // a = 18 % 3
        int a = 18 % 3;
        // b = 19 % 3
        int b = 19 % 3;
        // c = 20 % 3
        int c = 20 % 3;
        // d = 21 % 3
        int d = 21 % 3;
        // Prindi v2lja k6igi muutujate v22rtused
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void excersie4(){
        // TODO
        // Defineeri String tyypi muutuja mille sisu oleks "\"\\""
        String s = "\"\\\"\\\\\"\"";
        // Tryki muutuja sisu v2lja
        System.out.println(s);
    }

}
