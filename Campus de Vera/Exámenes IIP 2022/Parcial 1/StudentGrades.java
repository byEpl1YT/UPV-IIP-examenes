import java.util.Scanner;
import java.util.Locale;
public class StudentGrades {
    private StudentGrades() { }
    
    public static void main(String[] args) {
        Student student3 = new Student("Ana Isabel", "Pi", "del Valle", "12345678Z");
        Student student2 = new Student("Thomas", "Pyne", "Roure", "87654321X");
        
        System.out.println(student1.toString() + " " + student1.user());
        
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Introduzca la nota del primer parcial");
        double nota1 = tec.nextDouble();
        System.out.println("Introduzca la nota del segundo parcial");
        double nota2 = tec.nextDouble();
        
        student1.setGrade1(nota1);
        student1.setGrade2(nota2);
        student2.setGrade1(8.5);
        student2.setGrade2(9.75);
        
        double finals1 = student1.finalGrade();
        double finals2 = student2.finalGrade();
        System.out.println("Is the first student's grade the highest? " + (finals1 > finals2));
    }
}
