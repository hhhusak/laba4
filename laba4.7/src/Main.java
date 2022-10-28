import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double xp, xk, dx, x, eps, a, R, S, result;
        int n;

        System.out.print("xp = "); xp = scan.nextDouble();
        System.out.print("xk = "); xk = scan.nextDouble();
        System.out.print("dx = "); dx = scan.nextDouble();
        System.out.print("eps = "); eps = scan.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.printf("%s \n", "|     " + "x   " + " | "  +
                "ln((1+x)/(1-x))" + " |    " + "S" + "    |    " + "n" + "   |" );
        System.out.println("-------------------------------------------------");

        x = xp;
        while (x <= xk){
            n = 0;
            a = 2 * x;
            S = a;
            do{
                n++;
                R = (x * x) * ((2*n - 1) / (2*n + 1));
                a *= R;
                S += a;
            }while(Math.abs(a) >= eps);
            x = Double.parseDouble(String.format("%.2f", x));
            S = Double.parseDouble(String.format("%.3f", S));
            result = Math.log10((1 + x) / (1 - x));
            result = Double.parseDouble(String.format("%.5f", result));
            System.out.printf("%s \n", "|    " + x + "   |     " +
                    result + "     |   " +
                    S + "   |    " + n + "   |" );
            x += dx;
        }
        System.out.println("-------------------------------------------------");
    }
}