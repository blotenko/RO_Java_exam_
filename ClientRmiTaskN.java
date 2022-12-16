
import java.rmi.*;
import java.util.ArrayList;
import java.util.List;

public class ClientRmiTaskN{
    public static void main(String args[]){
        try{
            Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");

            System.out.println(stub.showStudentsAll().toString());
            System.out.println(stub.showStudentsByGroup("IPS323").toString());
            System.out.println(stub.showStudentaByFaculty("Cyber").toString());
        }catch(Exception e){}
    }
}