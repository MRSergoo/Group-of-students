import java.util.Scanner;

public class Group {

    public static void main(String[] args) {
        Man[] groop = new Student[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("please, input age ");
        int a = sc.nextInt();
        System.out.println("please, input name ");
        String n = sc.nextLine();
        System.out.println("please, input sex");
        String s = sc.nextLine();
        System.out.println("please, input amark");
        double m = sc.nextDouble();
        groop[2]  = new Student(a,n,s,m);





        Man man1 = new Man(36, "Alica", "woman");
        Man student1 = new Student(21, "Vadim", "man", 4.78);
        System.out.println(groop[2] .getInf());
      //  System.out.println(groop[2] .getInf());
    }
}
