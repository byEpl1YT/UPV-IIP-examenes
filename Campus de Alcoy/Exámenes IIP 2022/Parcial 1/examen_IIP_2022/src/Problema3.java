import java.util.Scanner;

public class Problema3 {
    private Problema3() {}

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String lanzamientos = kb.nextLine();
        String res;
        switch (lanzamientos) {
            case "cc":
                res = "Las dos son caras";
                break;
            case "Cc": case "cC":
                res = "Hay una cara o una cruz";
                break;
            case "CC":
                res = "Las dos son cruces";
                break;
            default:
                res = "Los datos son incorrectos";
                break;
        }
        System.out.println(res);
    }
}
