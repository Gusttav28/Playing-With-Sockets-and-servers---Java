package traintrackerserver_client.UserInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.CookieStore;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ui_client extends JFrame{
    private JButton button, button2, button3, button4, button5, button6, button7, button8, button9;
    private JPanel panel, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panel9;;
    private JTextArea textArea, textArea2, textArea3, textArea4, textArea5, textArea6, textArea7, textArea8, textArea9;
    private JLabel textJLabel;
    public ui_client(){

// -------------------------- Creating the first parametters for the window ---------------->
        this.setTitle("User");
        this.setSize(900, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
// -------------------------- Creating the objects for the panels ------------------------->



        panel= new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        panel9 = new JPanel();
        // panel.setBounds(0, 100, 200,600);
        // panel.setPreferredSize(new Dimension(600, 600));
        // panel.setBackground(Color.BLACK);

        panel.setBounds(0, 0, 900,700);
        panel.setBackground(Color.BLACK);


// -------------------------- Adding the size of the panels ------------------------->


        panel2.setPreferredSize(new Dimension(200, 300));
        panel3.setPreferredSize(new Dimension(200, 300));
        panel4.setPreferredSize(new Dimension(200, 300));
        panel5.setPreferredSize(new Dimension(200, 300));
        panel6.setPreferredSize(new Dimension(200, 300));
        panel7.setPreferredSize(new Dimension(200, 300));
        panel8.setPreferredSize(new Dimension(200, 300));
        panel9.setPreferredSize(new Dimension(200, 300));

        // panel.setPreferredSize(new Dimension(600, 700));

        // leftJPanel = new JPanel(new BorderLayout());
        // leftJPanel.setPreferredSize(new Dimension(100, 700));
        // leftJPanel.setBackground(Color.BLACK);


// -------------------------- Creating the buttons for the panels --------------s-------->


        
        button = new JButton("Star");
        button.setPreferredSize(new Dimension(100, 30));

        button2 = new JButton("Star");
        button2.setPreferredSize(new Dimension(100, 30));

        button3 = new JButton("Star");
        button3.setPreferredSize(new Dimension(100, 30));

        button4 = new JButton("Star");
        button4.setPreferredSize(new Dimension(100, 30));

        button5 = new JButton("Star");
        button5.setPreferredSize(new Dimension(100, 30));

        button6 = new JButton("Star");
        button6.setPreferredSize(new Dimension(100, 30));

        button7 = new JButton("Star");
        button7.setPreferredSize(new Dimension(100, 30));

        button8 = new JButton("Star");
        button8.setPreferredSize(new Dimension(100, 30));

        button9 = new JButton("Star");
        button9.setPreferredSize(new Dimension(100, 30));






// -------------------------- Creating text area for the panels ---------------->



        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200, 300));
        textArea.setAlignmentX(0);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        textArea2 = new JTextArea();
        textArea2.setPreferredSize(new Dimension(200, 300));
        textArea2.setAlignmentX(0);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);

        textArea3 = new JTextArea();
        textArea3.setPreferredSize(new Dimension(200, 300));
        textArea3.setAlignmentX(0);
        textArea3.setLineWrap(true);
        textArea3.setWrapStyleWord(true);

        textArea4 = new JTextArea();
        textArea4.setPreferredSize(new Dimension(200, 300));
        textArea4.setAlignmentX(0);
        textArea4.setLineWrap(true);
        textArea4.setWrapStyleWord(true);
        
        textArea5 = new JTextArea();
        textArea5.setPreferredSize(new Dimension(200, 300));
        textArea5.setAlignmentX(0);
        textArea5.setLineWrap(true);
        textArea5.setWrapStyleWord(true);
        
        textArea6 = new JTextArea();
        textArea6.setPreferredSize(new Dimension(200, 300));
        textArea6.setAlignmentX(0);
        textArea6.setLineWrap(true);
        textArea6.setWrapStyleWord(true);
        
        textArea7 = new JTextArea();
        textArea7.setPreferredSize(new Dimension(200, 300));
        textArea7.setAlignmentX(0);
        textArea7.setLineWrap(true);
        textArea7.setWrapStyleWord(true);
        
        textArea8 = new JTextArea();
        textArea8.setPreferredSize(new Dimension(200, 300));
        textArea8.setAlignmentX(0);
        textArea8.setLineWrap(true);
        textArea8.setWrapStyleWord(true);
        
        textArea9 = new JTextArea();
        textArea9.setPreferredSize(new Dimension(200, 300));
        textArea9.setAlignmentX(0);
        textArea9.setLineWrap(true);
        textArea9.setWrapStyleWord(true);
        
        // textJLabel = new JLabel("User");
        // panel.add(textJLabel, BorderLayout.NORTH);
        // panel.add(textArea);
        // panel.setLayout(new BorderLayout();





// -------------------------- Adding components to the panels ---------------->


    // ----------------------Adding buttons-------------------->  
    
        panel2.add(button);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        panel6.add(button6);
        panel7.add(button7);
        panel8.add(button8);
        panel9.add(button9);



    // ----------------------Adding textArea's-------------------->
        panel2.add(textArea);
        panel3.add(textArea3);
        panel4.add(textArea4);
        panel5.add(textArea5);
        panel6.add(textArea6);
        panel7.add(textArea7);
        panel8.add(textArea8);
        panel9.add(textArea9);



        
// -------------------------- Adding panels ---------------->
        


        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.add(panel5);
        panel.add(panel6);
        panel.add(panel7);
        panel.add(panel8);
        panel.add(panel9);
        this.add(panel);
        
        this.setVisible(true);
        // this.add(leftJPanel);
        


// -------------------------Buttons actions------------------------------------------>        

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
