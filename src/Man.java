

public class Man {
    private int age;
    private String name;
    private String sex;

    public Man(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
   }

    public Man(){

    }

    public String getInf (){
        return this.toString();
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) { this.name = name;}

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "name = " + name + ", age = " + age + ", sex = " + sex;
    }


}
