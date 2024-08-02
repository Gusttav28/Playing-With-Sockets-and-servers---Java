package traintrackerserver_test.UserInterface;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import traintrackerserver_testl.thread;

public class ui extends JFrame{
    private JButton button, button2;
    private JPanel panel;
    public ui(){
        this.setTitle("Test for server");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 50));

        button = new JButton("Test");
        button.setBounds(10, 20, 100, 200);
        panel.add(button);
        button2 = new JButton("Test2");
        button2.setBounds(30, 20, 100, 200);
        panel.add(button2);
        this.add(panel);
        this.setVisible(true);

    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            System.out.println("test");
            thread thread1 = new thread();
            thread1.start();

            try {
                Thread.sleep(200);
            } catch (Exception ex) {
                // TODO: handle exception
            }
        }
    });
    button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("test");
                
                new Thread(()->{
                    try {
                        //Creating the socket 
                        DatagramSocket socket = new  DatagramSocket(6000);
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
                            // textArea.append("\n" + message);
                            System.out.println(message);
                            // System.out.println("\n" message);
                            port = pack.getPort();
                            addres = pack.getAddress();
                            comMessage = "";
                            if (message.startsWith("run")){
                                thread thread1 = new thread();
                                thread1.start();
                                JOptionPane.showMessageDialog(null, "its working");
                                try {
                                    Thread.sleep(200);
                                } catch (Exception ex) {
                                    // TODO: handle exception
                                }
                            }
                            byte_messages2 = comMessage.getBytes();
            
                            envPacket = new DatagramPacket(byte_messages2, comMessage.length(), addres, port);
                            socket.send(envPacket);
                            
                        } while (true);
        
                    } catch (Exception ex) {
        
                    }
                }).start();

                
                
            }
        });
        
    }

    
}
