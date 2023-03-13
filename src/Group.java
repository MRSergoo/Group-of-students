import java.util.Arrays;
import java.util.Scanner;

public class Group {


    public static void addStudentInteractive()  {

        try {
            addAge();
            addName();
            addGender();
            addMark();
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
        scanner.close();
            return date;
}

    public static String addName() throws MyException {
        String name = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("InPut name");
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
        } else throw new MyException();
        scanner.close();
            return name;
        }

    public static  String addGender() throws MyException {
    String gender = " ";
    Scanner scanner = new Scanner(System.in);

    System.out.println("InPut sex");
            if (scanner.hasNextLine()) {
        gender = scanner.nextLine();
    } else throw new MyException();
        scanner.close();
       return gender;
}
public static Double addMark() throws  MyException {
    Double amark;
    Scanner scanner = new Scanner(System.in);

    System.out.println("InPut avarage mark");
    if (scanner.hasNextDouble()) {
        amark = Double.valueOf(scanner.nextDouble());
    } else throw new MyException();
    scanner.close();
    return amark;
}
}

//        if (count>=5) throw new MyException();
//
//        groop.add(new Student(ag, nam, sx, mr));
//        count++;
//        System.out.println(Arrays.toString(groop.toArray()));


//    static public Student ollo() throws MyException {
//
//        Student s1 = new Student(0, null, null, 0.0);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("InPut integer age \n");
//        if (scanner.hasNextInt()) {
//            s1.setAge(scanner.nextInt());
//        } else throw new MyException();
//
//        System.out.println("InPut name");
//        if (scanner.hasNext()) {
//            s1.setName(scanner.next());
//        } else throw new MyException();
//
//        System.out.println("InPut sex");
//        if (scanner.hasNext()) {
//            s1.setSex(scanner.next());
//        } else throw new MyException();
//
//        System.out.println("InPut avarage mark");
//        if (scanner.hasNextDouble()) {
//            s1.setAmark(scanner.nextDouble());
//        } else throw new MyException();
//
//        scanner.close();
//        return s1;
//    }


//    public static void main(String[] args) {
//
//        try {
//            Group.ollo();
//            System.out.println();
//        } catch (Exception MyException) {
//            System.out.println("Nahuevertel'");
//        }

//
//        try {
//            Student.addStudent(29, "Rob", "man", 5);
//            Student.addStudent(22, "Den", "man", 3.5);
//            Student.addStudent(27, "Dana", "woman", 4.4);
//            Student.addStudent(21, "Carlos", "man", 3);
//            Student.addStudent(20, "Alica", "woman", 3.9);
//            Student.delStudent("Dana");
//            Student.addStudent(33, "Anna", "woman", 4.9);
//            Student.addStudent(31, "Kate", "woman", 4.8);
//        } catch (MyException e) {
//            System.out.println("You add more five customers");
//        }
//
//    }
//



