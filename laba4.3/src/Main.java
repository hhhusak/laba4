import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double xp, xk, dx, x, a, b, c;
        System.out.print("xp = "); xp = scan.nextDouble();
        System.out.print("xk = "); xk = scan.nextDouble();
        System.out.print("dx = "); dx = scan.nextDouble();
        System.out.print("a = "); a = scan.nextDouble();
        System.out.print("b = "); b = scan.nextDouble();
        System.out.print("c = "); c = scan.nextDouble();

        System.out.println("---------------------------");
        System.out.printf("%27s \n", "|    " + "  x  " + "   |   " + "  F  " + "    |" );
        System.out.println("---------------------------");

        double F = 0;
        x = xp;
        while (x <= xk){
            if (x < 0 && b != 0){
                F = a - (x / (10 + b));
            } else if (x > 0 && b == 0){
                F = (x - a) / (x - c);
            } else {
                F = 3 * x + 2 / c;
            }
            x = Double.parseDouble(String.format("%.2f", x));
            F = Double.parseDouble(String.format("%.3f", F));
            System.out.printf("%27s \n", "|    " + x + "   |   " + F + "    |" );
            x += dx;
        }
    }
}