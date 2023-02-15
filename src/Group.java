import java.util.Arrays;
import java.util.Scanner;

public class Group {


    public static void main(String[] args) {
        try {
            Student.addStudent(29, "Rob", "man", 5);
            Student.addStudent(22, "Den", "man", 3.5);
            Student.addStudent(27, "Dana", "woman", 4.4);
            Student.addStudent(21, "Carlos", "man", 3);
            Student.addStudent(20, "Alica", "woman", 3.9);
            Student.delStudent("Dana");
            Student.addStudent(33, "Anna", "woman", 4.9);
            Student.addStudent(31, "Kate", "woman", 4.8);
        } catch (MyException e) {
            System.out.println("You add more five customers");
        }

    }



}
