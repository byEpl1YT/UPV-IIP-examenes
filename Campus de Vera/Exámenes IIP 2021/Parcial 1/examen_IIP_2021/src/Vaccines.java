import java.util.Locale;
import java.util.Scanner;

public class Vaccines {
    private Vaccines() {  }

    public static void main(String[] args) {
        VaccineDosis vac1 = new VaccineDosis();

        Scanner kb = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Introduzca el SIP: ");
        String sip = kb.nextLine();
        System.out.println("Introduzca la dosis: ");
        double dosis = kb.nextDouble();

        VaccineDosis vac2 = new VaccineDosis(VaccineDosis.PFIZER,
                dosis, 8, 0, sip);

        int effectivity = vac1.compareTo(vac2);
        String res;
        if (effectivity < 0) {
            res = "La vacuna 1 es más efectiva";
        }
        else if (effectivity > 0) {
            res = "La vacuna 2 es más efectiva";
        }
        else {
            res = "Ambas vacunas son igual de efectivas";
        }
        System.out.println(res);

    }
}
