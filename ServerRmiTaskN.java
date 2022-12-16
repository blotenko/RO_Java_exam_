
import java.rmi.*;
import java.rmi.registry.*;
import java.util.ArrayList;
import java.util.List;

public class ServerRmiTaskN{
    public static void main(String args[]){
        try{
            Student one = new Student(1,"Vlad","09393993","30303030","Cyber","IPS32",3);
            Student two = new Student(1,"Vlad2","09393993","30303030","Cyber3","IPS323",4);
            Student three = new Student(1,"Vlad3","09393993","30303030","Cyber","IPS32",3);
            List<Student> students= new ArrayList<>();
            Adder stub=new AdderRemote(students);
            Naming.rebind("rmi://localhost:5000/sonoo",stub);
        }catch(Exception e){System.out.println(e);}
    }
}