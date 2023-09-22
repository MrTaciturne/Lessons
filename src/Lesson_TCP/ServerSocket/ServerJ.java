package Lesson_TCP.ServerSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerJ implements Runnable{
    @Override
    public void run() {
         final String[] ANSWER = {"Maybe", "No way", "You are lucky"};
         final Random random = new Random();



            try (ServerSocket serverSocket = new ServerSocket(1042);
                 Socket socket = serverSocket.accept();
                 DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                 DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
                String request = dataInputStream.readUTF();
                while (!"stop".equals(request)) {
                    System.out.println("Client request " + request);
                    dataOutputStream.writeUTF(ANSWER[random.nextInt(3)]);
                    request = dataInputStream.readUTF();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
