import java.net.*;
import java.util.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept();
            DataInputStream in = new DataInputStream(s.getInputStream());
            int a = (int) in.read();
            int b = (int) in.read();
            char ch = (char) in.read();
            DataOutputStream o = new DataOutputStream(s.getOutputStream());
            if ('+' == ch) {
                int c = a + b;
                o.write(c);
            } else if ('-' == ch) {
                int c = a - b;
                o.write(c);
            } else if ('*' == ch) {
                int c = a * b;
                o.write(c);
            } else if ('/' == ch) {
                int c = a / b;
                o.write(c);
            }
            ss.close();
        } catch (Exception E) {
            System.out.println(E);
        }

    }

}
