package traintrackerserver_testl;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class thread extends Thread{

    public void run(){
        int running = 0;
        while(running <= 10){
            try {
                System.out.println("Test");
                Thread.sleep(200);
                // openning the datagram socket and configuring it 
                // ----------------------------->
                DatagramSocket socket = new DatagramSocket();
                // establishing the comunication network
                InetAddress address = InetAddress.getByName("localhost");
                // with DatagramPacket [packet] we are gonna establish message or 
                // whatever thing that we want to send 
                DatagramPacket packet;
                // the message it needs to be converted in bytes for pass it  
                byte[] byteMessage = new byte[200]; 

                // package - response of the server
                String stringmessage = "";
                DatagramPacket servPacket;
                byte[] pickUpbytes_server;


                String message = "test coordinate 1 - its working";

                do {
                    Thread.sleep(50);
                    // we convert the message to a bytes for the transfer
                    byteMessage = message.getBytes();
                    // we pass the message through the pakage
                    packet = new DatagramPacket(byteMessage, message.length(), address, 7000);
                    // and then we send that package
                    socket.send(packet);

                    pickUpbytes_server = new byte[200];
                    servPacket = new DatagramPacket(pickUpbytes_server, 200);
                    socket.receive(servPacket);
                    stringmessage = new String(pickUpbytes_server).trim();
                    System.out.print(stringmessage);
                    running++;
                    
                } while (running <= 10);
                socket.close();
                
                
                // running++;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    // public static void main(String[] args) {
    //     thread thread1 = new thread();
    //     thread1.start();
    //     // try {
    //     //     System.out.println("This is a test " + thread1);
    //     //     thread.sleep(200);
    //     // } catch (Exception e) {
    //     //     // TODO: handle exception
    //     // }
        
    // }
}