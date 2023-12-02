import java.net.*;
import java.util.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 3000);

            System.out.println("successfully connected");
            Scanner sc = new Scanner(System.in);
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            int a, b;
            char ch;
            System.out.println("enter a:");
            a = sc.nextInt();
            out.write(a);
            System.out.println("enter b:");
            b = sc.nextInt();
            out.write(b);
            System.out.println("enter ch:");
            ch = sc.next().charAt(0);
            out.write(ch);
            DataInputStream in = new DataInputStream(client.getInputStream());
            int t = (int) in.read();
            System.out.println("output=" + t);
            out.close();
        } catch (Exception E) {
            System.out.println(E);
        }

    }

}
