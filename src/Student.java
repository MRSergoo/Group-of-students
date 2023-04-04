import java.util.*;


public class Student extends Man implements Comparable, Cloneable {
    public static int count = 0;
    private double amark;

    static ArrayList<Student> groop = new ArrayList<>(10);

    public static void addStudent(int ag, String nam, String sx, double mr) throws MyException {
        if (count >= 10) throw new MyException();

        groop.add(new Student(ag, nam, sx, mr));
        count++;


    }

    public static void delStudent(String name) {

        Iterator<Student> iter = groop.iterator();
        while (iter.hasNext()) {
            if (name.equals(iter.next().getName())) {
                iter.remove();
                count--;
            }

        }

    }

    public static void sortName() throws CloneNotSupportedException {
        for (int i = 0; i < groop.size()-1; i++) {
            for (int j = 0; j < groop.size()-1; j++) {
            Student aa;
            Student bb;
           if  ((groop.get(j).getName().compareTo(groop.get(j+1).getName()))>0) {
               aa = groop.get(j).clone();
               bb = groop.get(j+1).clone();
               groop.set(j, bb);
               groop.set(j + 1, aa);
           }
        }

        }

    }



    public Student(int age, String name, String sex, double amark) {
        super(age, name, sex);
        this.amark = amark;
    }


    public double getAmark() {
        return amark;
    }

    public void setAmark(double amark) {
        this.amark = amark;
    }

    public String getInf() {
        return super.toString() + " , avarage mark = " + amark;
    }

    public String toString() {
        return "name = " + super.getName() + ", age = " + super.getAge() + ", sex = " + super.getSex() + ", amark =  " + this.amark;
    }


    @Override
    public int compareTo(Object o) {

        Student anotherstudent = (Student) o;
        if (this.getAge() > anotherstudent.getAge())
        {return 1;}

        if (this.getAge() < anotherstudent.getAge())
        { return -1;}
        return 0;
    }

  /*  public int CompareTo(Object b) {
        Student anotherstudent = (Student) b;
        return 3;
    }*/



    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
