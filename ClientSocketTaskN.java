import java.net.*;
import java.io.*;
import java.util.*;

public class ClientSocketTaskN {
    static int port = 5003;
    static String address = "127.0.0.1";

    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName(address);

            System.out.println("Поключаемся к " + address + ":" + port + "...");
            Socket socket = new Socket(addr, port);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            Scanner scan = new Scanner(System.in, "UTF-8");

            System.out.print("[Запрос]:");
            System.out.print("1. All students");
            System.out.print("2. All students of one Facultet");
            System.out.print("3. All students of one Group");
            String line = scan.nextLine();

            out.println(line);
            out.flush();

            line = in.readLine();
            System.out.println("[Ответ]:" + line);

            socket.close();
        } catch (IOException x) {
            System.out.println("Ошибка ввода/вывода");
            x.printStackTrace();
        }
    }
}