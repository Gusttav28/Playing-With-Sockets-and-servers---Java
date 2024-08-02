package traintrackerserver_test.UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ui extends JFrame{
    private JButton button;
    private JPanel panel;
    private JTextArea textArea;
    public ui(){
        this.setTitle("Test for server");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 50));
        button = new JButton("Test");
        button.setBounds(10, 20, 100, 200);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(300, 400));
        // textArea.setBounds(150, 100, 300, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        panel.add(textArea, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        panel.add(textArea);
        this.add(panel);
        this.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("test");
                String messagetest = "tesst";
                // textArea.append



                thread Thread1 = new thread();
                Thread1.start();




                // ------> this is the thread who recive the data from the server 
                new Thread(()->{
                    try {
                        //Creating the socket 
                        DatagramSocket socket = new  DatagramSocket(7000);
                        byte[] byte_messages = new byte[200];
                        String message = new String(byte_messages);
                        String comMessage = "";
                        
                        DatagramPacket pack = new DatagramPacket(byte_messages, 200);
                        DatagramPacket envPacket = new DatagramPacket(byte_messages, 200);
                        
                        int port;
                        InetAddress addres;
                        byte[] byte_messages2 = new byte[200];
                        do {
                            Thread.sleep(500);
                            socket.receive(pack);
                            message = new String(byte_messages);
                            textArea.append("\n" + message);
                            System.out.println(message);
                            // System.out.println("\n" message);
                            port = pack.getPort();
                            addres = pack.getAddress();
                            comMessage = "";
                            byte_messages2 = comMessage.getBytes();
            
                            envPacket = new DatagramPacket(byte_messages2, comMessage.length(), addres, port);
                            socket.send(envPacket);
                            
                        } while (true);
        
                    } catch (Exception ex) {
        
                    }
                }).start();

            }
        });
        
        // new Thread(()->{
        //     try {
        //         //Creating the socket 
        //         DatagramSocket socket = new  DatagramSocket(7000);
        //         byte[] byte_messages = new byte[200];
        //         String message = new String(byte_messages);
        //         String comMessage = "";
                
        //         DatagramPacket pack = new DatagramPacket(byte_messages, 200);
        //         DatagramPacket envPacket = new DatagramPacket(byte_messages, 200);
                
        //         int port;
        //         InetAddress addres;
        //         byte[] byte_messages2 = new byte[200];
        //         do {
        //             Thread.sleep(500);
        //             socket.receive(pack);
        //             message = new String(byte_messages);
        //             textArea.append("\n" + message);
        //             System.out.println(message);
        //             // System.out.println("\n" message);
        //             port = pack.getPort();
        //             addres = pack.getAddress();
        //             comMessage = "";
        //             byte_messages2 = comMessage.getBytes();
    
        //             envPacket = new DatagramPacket(byte_messages2, comMessage.length(), addres, port);
        //             socket.send(envPacket);
                    
        //         } while (true);

        //     } catch (Exception ex) {

        //     }
        // }).start();
        
    }

    
}
