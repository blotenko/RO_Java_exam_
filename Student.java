import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    String dateOfBirth;
    String tel;
    String facultet;
    String group;
    int kurs;
    public Student(int id, String n, String d, String t, String f, String g, int k)
    {
        this.id  = id;
        this.name = n;
        this.dateOfBirth = d;
        this.tel = t;
        this.facultet = f;
        this.group = g;
        this.kurs = k;
    }

    public  String toString() {
        String res =  "";
        res += this.name + " "+ this.group +" "+ this.facultet;
        return res;
    }

    public static String toString(List<Student> students) {
        String res =  "";
        for(int i = 0;i<students.size();i++)
        {
            res += students.get(i).toString();
        }
        return res;
    }

    public static List<Student> getAllStudInGroup(List<Student> allSt, String group) {
      List<Student> sts = new ArrayList<>();
      for(int i= 0; i<allSt.size();i++){
          if(allSt.get(i).group == group)
          {
              sts.add(allSt.get(i));
          }
      }
      return sts;
    }
    public static List<Student> getAllStudInfacultet(List<Student> allSt, String facul) {
        List<Student> sts = new ArrayList<>();
        for(int i= 0; i<allSt.size();i++){
            if(allSt.get(i).facultet == facul)
            {
                sts.add(allSt.get(i));
            }
        }
        return sts;
    }


}

