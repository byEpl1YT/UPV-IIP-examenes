import java.util.Scanner;

public class Ejercicio3 {
    private Ejercicio3() {}

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String s1 = kb.nextLine();
        String s2 = kb.nextLine();

        int res = s1.compareTo(s2);
        System.out.println(res);

    }
}
