public class Student extends Person{
    // Private field for storing the student's GPA and stepuha
    private double gpa;
    private static final double stepuha = 41898.00;

    // Default constructor
    public Student(){ }

    // Constructor to initialize student with name, surname, and GPA
    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    // Getter and Setter method for retrieving and updating the student's GPA
    public double getGpa(){
        return gpa;
    }
    public void setGpa(){
        this.gpa = gpa;
    }

    // Overridden method to calculate student payment based on GPA
    @Override
    public double getPaymentAmount(){
        return gpa > 2.67 ? stepuha : 0.0;
    } // If GPA is above 2.67, return the scholarship amount, otherwise return 0.0
}
