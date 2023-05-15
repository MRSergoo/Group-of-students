import java.util.*;

public class Main{

    public static void main(String[] args) throws CloneNotSupportedException {

        Group.addStudentInteractive();

        try {
            Student.addStudent(29, "Bob", "man", 5);
            Student.addStudent(22, "Den", "man", 3.5);
            Student.addStudent(27, "Faina", "woman", 4.4);
            Student.addStudent(21, "Carlos", "man", 3);
            Student.addStudent(20, "Alica", "woman", 3.9);
            Student.delStudent("Dana");
            Student.addStudent(33, "Wienne", "woman", 4.9);
            Student.addStudent(31, "Kate", "woman", 4.8);
        } catch (MyException e) {
            System.out.println("Something went wrong");
        }


         Student.sortName();

        Collections.sort(Student.groop, new StudentComparator());

        for (Student e : Student.groop) {
            System.out.println(e);
        }

        Armycom.goden(Student.groop);


    }
}
