
public class Student {
    public static final double WEIGHT_1 = 0.40;
    public static final double WEIGHT_2 = 0.60;
    
    private String name, surname1, surname2;
    private String dni;
    private double grade1, grade2;
    
    public Student(String name, String surname1, String surname2, String dni) {
    this.name = name;
    this.surname1 = surname1;
    this.surname2 = surname2;
    this.dni = dni;
    this.grade1 = 0.0;
    this.grade2 = 0.0;
    }
    
    public void setGrade1(double grade1) {
    this.grade1 = grade1;
    }
    
    public void setGrade2(double grade2) {
    this.grade2 = grade2;
    }
    
    public double finalGrade() {
    return Math.max(grade2, grade1 * WEIGHT_1 + grade2 * WEIGHT_2);
    }
    
    public String user() {
    String res = name.substring(0,2);
    res += surname1.substring(0,2);
    res += surname2.substring(0,2);
    res = res.toLowerCase();
    return res + "@etsinf.upv.es";
    }
    
    public boolean equals(Object o) {
        return o instanceof Student
        && this.dni.equals(((Student) o).dni); 
    }
    
    public String toString() {
        return name + " " + surname1 + ". DNI: " + dni;
    }
    
}
