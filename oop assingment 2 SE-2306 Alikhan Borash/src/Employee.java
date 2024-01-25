public class Employee extends Person {
    // Private field to store the employee's job position and salary
    private String position;
    private double salary;

    // Default constructor
    public Employee(){}

    // Constructor to initialize student with name, surname, position and salary
    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // Getter and Setter method for retrieving the Employee's position
    public String getPosition(){return position;}

    public void setPosition(String position){
        this.position = position;
    }


    // Getter and Setter method for retrieving and updating the Employee's salary
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // Overridden method to provide a string representation of the employee
    @Override
    public String toString(){
        return "Employee: " + super.toString();
    }


    // Overridden method to calculate employee payment based on salary
    @Override
    public double getPaymentAmount(){
        return salary;
    }
}