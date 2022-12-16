import java.rmi.*;
import java.util.List;

public interface Adder extends Remote{
    public int add(int x,int y)throws RemoteException;
    public List<Student> showStudentsByGroup(String group)throws RemoteException;
    public List<Student> showStudentsAll()throws RemoteException;
    public List<Student> showStudentaByFaculty(String faculty)throws RemoteException;
}