public class Main {

    public static void main(String[] args) {
        int i = 1;
        double M = 1;

        // 1 Спосіб
        while (i <= 15) {
            M *= (Math.sin(i) * Math.sin(i) + Math.cos(1 / i) * Math.cos(1 / i)) / i * i;
            i++;
        }
        System.out.println("(while) M = " + M);

        // 2 Спосіб
        M = i = 1;
        do {
            M *= (Math.sin(i) * Math.sin(i) + Math.cos(1 / i) * Math.cos(1 / i)) / i * i;
            i++;
        } while (i <= 15);
        System.out.println("(do while) M = " + M);

        // 3 Спосіб
        M = 1;
        for (i = 1; i <= 15; i++) {
            M *= (Math.sin(i) * Math.sin(i) + Math.cos(1 / i) * Math.cos(1 / i)) / i * i;
        }
        System.out.println("(for++) M = " + M);

        // 4 Спосіб
        M = 1;
        for (i = 15; i >= 1; i--) {
            M *= (Math.sin(i) * Math.sin(i) + Math.cos(1 / i) * Math.cos(1 / i)) / i * i;
        }
        System.out.println("(for--) M = " + M);
    }
}