import java.util.Arrays;
import java.util.Scanner;

public class Group {


    public static void addStudentInteractive()  {
        try {

            Student s1= new Student(addAge(), addName(),addGender(),addMark());

        Student.groop.add(s1);
        Student.count++;
        System.out.println(Arrays.toString(Student.groop.toArray()));
        } catch (MyException e) {
            e.printStackTrace();
    }
    }

    public static int addAge() throws MyException {
        int date = 0;
     System.out.println("InPut integer age");
    Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
         date = scanner.nextInt();
    } else throw new MyException();

            return date;
}

    public static String addName() throws MyException {
        String name = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("InPut name");
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
        } else throw new MyException();

            return name;
        }

    public static  String addGender() throws MyException {
    String gender = " ";
    Scanner scanner = new Scanner(System.in);

    System.out.println("InPut sex");
            if (scanner.hasNextLine()) {
        gender = scanner.nextLine();
    } else throw new MyException();

       return gender;
}
public static Double addMark() throws  MyException {
    Double amark;
    Scanner scanner = new Scanner(System.in);

    System.out.println("InPut avarage mark");
    if (scanner.hasNextDouble()) {
        amark = Double.valueOf(scanner.nextDouble());
    } else throw new MyException();

    return amark;
}
}









