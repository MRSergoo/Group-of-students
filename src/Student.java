public class Student extends Man {
    private double amark;

    public Student(int age, String name, String sex, double amark) {
        super(age, name, sex);
        this.amark = amark;
    }

    public String getInf (){
        return super.toString() + " , avarage mark = " + amark;
    }


}
