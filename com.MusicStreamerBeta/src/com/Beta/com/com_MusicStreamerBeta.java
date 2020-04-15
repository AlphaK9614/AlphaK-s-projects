package com.Beta.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class com_MusicStreamerBeta {
    public static void main(String[] args) {

        //creates a Java Frame and attributes
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400, 700);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Desktop desktop = Desktop.getDesktop();



        //creates button, add it to frame and set Boundaries
        JButton title = new JButton("Music Streamer");
        frame.add(title);
        title.setBounds(140, 10, 130, 30);



        //creates an instance of button b1 and adds button b1 to frame
        JButton b1 = new JButton("Chill");
        frame.add(b1);
        b1.setBounds(10, 140, 120, 30);

        //adds action-listener to button b1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(new URI("https://www.youtube.com/watch?v=5qap5aO4i9A"));
                } catch (IOException throwI) {
                    throwI.printStackTrace();
                } catch (URISyntaxException throwI) {
                    throwI.printStackTrace();
                }
            }
        });



        //creates an instance of button b2 and adds button b2 to frame
        JButton b2 = new JButton("Nightcore");
        frame.add(b2);
        b2.setBounds(280, 140, 120, 30);

        //adds action-listener to button b2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(new URI("https://www.youtube.com/watch?v=7nuYsK2Mouo"));
                } catch (IOException throwI) {
                    throwI.printStackTrace();
                } catch (URISyntaxException throwI) {
                    throwI.printStackTrace();
                }
            }
        });



        //creates an instance of button b3 and adds button b3 to frame
        JButton b3 = new JButton("Jazz");
        frame.add(b3);
        b3.setBounds(10,190,120,30);

        //adds action-listener to button b3
        b3.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                try {
                    desktop.browse(new URI("https://www.youtube.com/watch?v=Dx5qFachd3A"));
                } catch (IOException throwI) {
                    throwI.printStackTrace();
                } catch (URISyntaxException throwI) {
                    throwI.printStackTrace();
                }
            }
        });



        //creates an instance of button b4 and adds button b4 to frame
        JButton b4 = new JButton("Classical");
        frame.add(b4);
        b4.setBounds(280, 190, 120, 30);

        //adds action-listener to button b4
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(new URI("https://www.youtube.com/watch?v=QEDZd066a2k"));
                } catch (IOException throwI) {
                    throwI.printStackTrace();
                } catch (URISyntaxException throwI) {
                    throwI.printStackTrace();
                }
            }
        });



        //creates an instance of button b5 and adds button b5 to frame
        JButton b5 = new JButton("Dubstep");
        frame.add(b5);
        b5.setBounds(10, 240, 120, 30);

        //adds action-listener to button b5
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(new URI("https://www.youtube.com/watch?v=Oxj2EAr256Y"));
                } catch (IOException throwI) {
                    throwI.printStackTrace();
                } catch (URISyntaxException throwI) {
                    throwI.printStackTrace();
                }
            }
        });



        //creates an instance of button b6 and adds button b6 to frame
        JButton b6 = new JButton("Reggae");
        frame.add(b6);
        b6.setBounds(280, 240, 120, 30);

        //adds action-listener to button b6
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    desktop.browse(new URI("https://www.youtube.com/watch?v=u6kdx-Q61l0"));
                } catch (IOException throwI) {
                    throwI.printStackTrace();
                } catch (URISyntaxException throwI) {
                    throwI.printStackTrace();
                }
            }
        });
    }
}

