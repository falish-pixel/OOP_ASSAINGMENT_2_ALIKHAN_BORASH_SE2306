//Importing java utils
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating List
        List<Person> people = new ArrayList<>();
        people.add(new Employee("Nursultan", "Khaimuldin ", "Teacher", 7777777.00));
        people.add(new Student("Alikhan", "Borash", 3.5));
        people.add(new Student("Ermek", "Orazbek", 3.0));
        people.add(new Employee("Aidos", "Bayburin", "Teacher", 500000.00));

        // Sort the people based on their payment amounts (descending order) and print the sorted data
        Collections.sort(people);
        printData(people);
    }

    // Helper method to print person information and payment amounts
    private static void printData(List<Person> payables) {
        for (Person p : payables) {
            System.out.println(p + " \nEarns " + p.getPaymentAmount() + " tenge");
        }
    }
}