import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class Student extends Man {
    private double amark;
    //    private int count = 0;
//    Man[] groop = new Student[10];
    public static int count = 0;
    static ArrayList<Student> groop = new ArrayList<Student>(10);

    public static void addStudent(int ag, String nam, String sx, double mr) {
        groop.add(new Student(ag, nam, sx, mr));
        count++;
        System.out.println(Arrays.toString(groop.toArray()));
    }

    public static void delStudent(String name) {

        try {
            for (Student x : groop) {
                if (name.equals(x.getName())) groop.remove(x);

                count--;
            }

            System.out.println(Arrays.toString(groop.toArray()));
        }
     catch (ConcurrentModificationException e) {}
}



    public Student(int age, String name, String sex, double amark) {
        super(age, name, sex);
        this.amark = amark;
    }

    public String getInf() {
        return super.toString() + " , avarage mark = " + amark;
    }

    public String toString() {
        return "name = " + super.getName() + ", age = " + super.getAge() + ", sex = " + super.getSex() + ", amark =  " + this.amark;
    }


}
