import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("xp = ");
        double xp = scan.nextDouble();
        System.out.print("xk = ");
        double xk = scan.nextDouble();
        System.out.print("dx = ");
        double dx = scan.nextDouble();

        System.out.println("---------------------------");
        System.out.printf("%27s \n", "|    " + "  x  " + "   |   " + "  y  " + "    |" );
        System.out.println("---------------------------");

        double x = xp;
        double y = 1 / (Math.abs(x + 2)) + 1;

        while (x <= xk) {
            if (x < 1){
                y -= 7 * x * x + x - 8;
            } else if (x <= 4) {
                y -= 1 / (Math.tan((x + 4) / Math.sqrt(11))) + 3;
            } else {
                y -= Math.sqrt(1 + Math.abs(Math.pow(Math.cos(x), 3)));
            }
            x = Double.parseDouble(String.format("%.2f", x));
            y = Double.parseDouble(String.format("%.3f", y));
            System.out.printf("%27s \n", "|    " + x + "   |   " + y + "    |" );
            x += dx;
        }
    }
}