import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Armycom {
     static void goden(List<Student> c) {
          ArrayList<Student> godstudents = new ArrayList<>();

          for (Student p : c) {
               if (p.getAmark()-4.5 < 0.001) godstudents.add(p);
          }
          System.out.println(Arrays.toString(godstudents.toArray()));
     }
}


