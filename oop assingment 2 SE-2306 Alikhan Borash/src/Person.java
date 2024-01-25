public abstract class Person implements Payable, Comparable<Person> {

    // Private static field for generating unique IDs for each person
    private static int id_gen = 1;

    // Private fields for storing person's data
    private int id;
    private String name;
    private String surname;

    // Default constructor (no arguments) that assigns a unique ID
    public Person(){
        id = id_gen++;
    }

    // Constructor to initialize person with name and surname
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    //Setter method for updating the Person's name and surname
    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    // Getter methods for retrieving person's information
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPosition() {return "Student";}

    // Overridden method to provide a string representation of the person
    @Override
    public String toString(){
        return getPosition() +
                "\nid:" + id +
                "\nName:" + name +
                "\nSurname:" + surname ;
    }

    //Payable interface
    @Override
    public double getPaymentAmount(){
        //default payment
        return 0.0;
    }

    @Override
    public int compareTo(Person other){
        return Double.compare(other.getPaymentAmount(), getPaymentAmount());
    }

}