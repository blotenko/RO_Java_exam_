import java.rmi.*;
import java.rmi.server.*;
import java.util.List;

public class AdderRemote extends UnicastRemoteObject implements Adder{
    List<Student> students;
    AdderRemote(List<Student> st)throws RemoteException{
        super();
        students = st;
    }
    public int add(int x,int y){return x+y;}

    public List<Student> showStudentsByGroup( String group)
    {
        this.students = Student.getAllStudInGroup(this.students,group);
        return students;
    }
    public List<Student> showStudentsAll(){
        return this.students;
    }
    public List<Student> showStudentaByFaculty(String faculty){
        this.students = Student.getAllStudInfacultet(this.students,faculty);
        return students;
    }

}  