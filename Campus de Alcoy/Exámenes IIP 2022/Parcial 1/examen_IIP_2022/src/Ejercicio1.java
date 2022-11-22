import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    private Ejercicio1() {}

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in).useLocale(Locale.US);
        double num1 = kb.nextDouble();
        double num2 = kb.nextDouble();
        kb.nextLine();
        String res = "Son diferentes";
        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
            res = "Son iguales";
        }
        System.out.println(res);

    }
}
