import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, k, S, P;

        // 1 Спосіб
        P = 1;
        i = 1;
        while (i <= 10){
            S = 0;
            k = 1;
            while (k <= i){
                S += 1 / k;
                k++;
            }
            P *= (i + S) / (Math.sqrt(S));
            i++;
        }
        System.out.println("(while) P = " + P);

        // 2 спосіб
        P = 1;
        i = 1;
        do {
            S = 0;
            k = 1;
            do {
                S += 1 / k;
                k++;
            } while(k <= i);
            P *= (i + S) / (Math.sqrt(S));
            i++;
        } while (i <= 10);
        System.out.println("(do while) P = " + P);

        // 3 спосіб
        P = 1;
        for (i = 1; i <= 10; i++){
            S = 0;
            for (k = 1; k <= i; k++){
                S += 1 / k;
            }
            P *= (i + S) / (Math.sqrt(S));
        }
        System.out.println("(for++) P = " + P);

        // 4 спосіб
        P = 1;
        for (i = 10; i >= 1; i--){
            S = 0;
            for (k = i; k >= 1; k--){
                S += 1 / k;
            }
            P *= (i + S) / (Math.sqrt(S));
        }
        System.out.println("(for--) P = " + P);
    }
}