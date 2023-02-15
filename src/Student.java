import java.util.*;

public class Student extends Man {
    public static int count = 0;
    private double amark;

    static ArrayList<Student> groop = new ArrayList<>(10);

    public static void addStudent(int ag, String nam, String sx, double mr) throws MyException {
        if (count>=5) throw new MyException();

            groop.add(new Student(ag, nam, sx, mr));
            count++;
            System.out.println(Arrays.toString(groop.toArray()));

    }

    public static void delStudent(String name) {

        Iterator<Student> iter = groop.iterator();
        while (iter.hasNext()) {
            if (name.equals(iter.next().getName())) {
                iter.remove();
                count--;
            }

        }
        System.out.println(Arrays.toString(groop.toArray()));
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
