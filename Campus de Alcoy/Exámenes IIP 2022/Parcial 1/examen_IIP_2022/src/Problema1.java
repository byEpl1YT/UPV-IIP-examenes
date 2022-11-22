import java.util.Scanner;
import java.util.Locale;

public class Problema1 {
    private Problema1() {}

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useLocale(Locale.US);

        double x = kb.nextDouble();
        kb.nextLine();

        if (x <= 0) {
            x = Math.pow(3 - x * x, 4);
        }
        else if (x <= 100) {
            x = x * x + (1 / x);
        }
        else {
            x = 4 * x * x * x;
        }

        System.out.println(x);
    }
}
