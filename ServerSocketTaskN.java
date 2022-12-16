import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerSocketTaskN {

    static int port = 2345;

    public static void main(String[] args)    {

        try {
            ServerSocket sock = new ServerSocket(port);


            System.out.println("Ожидание подключений...");
            Socket client = sock.accept();
            System.out.println("Подключился клиент");

            InputStream sin = client.getInputStream();
            OutputStream sout = client.getOutputStream();

            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            while(true) {

                String line = in.readUTF();
                System.out.println("Получена строка: " + line);

                Student one = new Student(1,"Vlad","09393993","30303030","Cyber","IPS32",3);
                Student two = new Student(1,"Vlad2","09393993","30303030","Cyber3","IPS323",4);
                Student three = new Student(1,"Vlad3","09393993","30303030","Cyber","IPS32",3);
                List<Student> students= new ArrayList<>();
                students.add(one);students.add(two);students.add(three);
                if(line == "1")
                {
                    out.writeUTF(Student.toString(students));
                }
                else if(line == "2")
                {
                    students = Student.getAllStudInfacultet(students, "Cyber");
                    out.writeUTF(Student.toString(students));
                }
                else if(line == "3")
                {
                    students = Student.getAllStudInGroup(students, "IPS323");
                    out.writeUTF(Student.toString(students));
                }
                out.flush();
            }
        } catch(IOException ex) {
            System.out.println("Ошибка ввода/вывода");
            ex.printStackTrace();
        }
    }
}