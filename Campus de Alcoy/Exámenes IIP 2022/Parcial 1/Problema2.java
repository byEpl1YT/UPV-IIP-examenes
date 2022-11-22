import java.util.Scanner;

public class Problema2 {
    private Problema2() {}

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String eq = kb.nextLine();
        eq = eq.trim();
        int x = eq.indexOf('x');
        int y = eq.indexOf('x',x+1);
        int z = eq.indexOf('x',y+1);
        String a1 = eq.substring(0,x);                  //a
        String a2 = eq.substring(x+1,y);                //^3+b
        String a3 = eq.substring(y+1, z);               //^2+c
        String a4 = eq. substring(z+1);        //+d
        int q = a2.indexOf("3");
        int w = a3.indexOf("2");

        a2 = a2.substring(q+1);                 //+b
        a3 = a3.substring(w+1);                 //+c

        double a = 1, b = 1, c = 1, d = Double.parseDouble(a4);
		
		if (a1.length() != 0) {
			if (a1.charAt(0) == '-' && a1.length() == 1) { a = -1; }
			else { a = Double.parseDouble(a1); }
		}
		
		if (a2.length() == 1) {
			if (a2.charAt(0) == '-') { b = -1; }
		}
		else { b = Double.parseDouble(a2); }
		
		if (a3.length() == 1) {
			if (a3.charAt(0) == '-') { c = -1; }
		}
		else { c = Double.parseDouble(a3); }	

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
