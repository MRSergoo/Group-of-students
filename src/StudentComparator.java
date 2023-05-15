import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAmark()-o2.getAmark()>0.01) return 1;
        if (o1.getAmark()-o2.getAmark()<0.01) return -1;
        else return 0;
    }
}
