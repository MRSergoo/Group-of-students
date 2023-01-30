import java.util.Arrays;

public class Student extends Man {
    private double amark;
//    private int count = 0;
//    Man[] groop = new Student[10];
int count = 0;

    public static void addStudent(int ag, String nam, String sx, double mr){
        int count = 0;
        Man[] groop = new Student[10];
        groop[count] = new Student(ag, nam, sx, mr);
        count++;
        System.out.println(Arrays.toString(groop) + " \n");
    }





    public Student(int age, String name, String sex, double amark) {
        super(age, name, sex);
        this.amark = amark;
    }

    public String getInf (){
        return super.toString() + " , avarage mark = " + amark;
    }
    public String toString() {
        return "name = " + super.getName() + ", age = " + super.getAge() + ", sex = " + super.getSex() + ", amark =  " + this.amark;
    }


}
