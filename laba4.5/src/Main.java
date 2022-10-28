import java.util.Scanner;

//   double a = ((Math.random() * 2 * 5.01) - 5);
//   System.out.printf("%.2f \n", a);
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("R = "); double R = scan.nextDouble();
        double x, y;

        for (int i = 0; i <= 10; i++){
            x = Double.parseDouble(String.format("%.2f", (Math.random() * 2 * R) - R));
            y = Double.parseDouble(String.format("%.2f", (Math.random() * 2 * R) - R));

            if (x > 0 && y >= 0 && y <= Math.sqrt(R*R - x*x)
                    || x <= 0 && y <= x + R && y <= Math.sqrt(R*R - x*x)) {
                System.out.printf("%8s \n", "| " + x + "  |  " + y + " | " + "yes");
            } else {
                System.out.printf("%8s \n", "| " + x + "   |   " + y + " | " + "no");
            }
        }
    }
}