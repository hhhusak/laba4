import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("R = "); double R = scan.nextDouble();
        System.out.print("xp = "); double xp = scan.nextDouble();
        System.out.print("xk = "); double xk = scan.nextDouble();
        System.out.print("dx = "); double dx = scan.nextDouble();

        System.out.println("---------------------------");
        System.out.printf("%27s \n", "|    " + "  x  " + "   |   " + "  y  " + "    |" );
        System.out.println("---------------------------");

        double y = 0;
        double x = xp;
        while (x <= xk){
            if (x <= -2) {
                y = x + 3;
            } else if (x <= 4) {
                y = (4 - x*R - x - 2*R) / 6;
            } else if (x <= 8 - R) {
                y = -R;
            } else if (x <= 8 + R) {
                y = Math.sqrt(R*R - Math.pow((x - 8), 2)) - R * R;
            } else {
                y = -R;
            }

            x = Double.parseDouble(String.format("%.2f", x));
            y = Double.parseDouble(String.format("%.3f", y));
            System.out.printf("%27s \n", "|    " + x + "   |   " + y + "    |" );
            x += dx;
        }
    }
}