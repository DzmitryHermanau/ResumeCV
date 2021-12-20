package basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import java.util.Calendar;
import java.util.Scanner;

public class ImageForFon<myResume> extends JFrame {

    private ImageIcon myFoto;
    private JLabel myLabel;
    private JButton button1 = new JButton("WhoIAm");
    private JButton button2 = new JButton("MyCurrentJob");
    private JButton button3 = new JButton("SourcesForStudy");
    private JButton button4 = new JButton("AndWhy?");
    private JButton button5 = new JButton("GotIt");
    private int age = Calendar.getInstance().get(Calendar.YEAR) - 1986;
    private String myName = "Dzmitry Hermanau";

    private static final int WINDOW_WIDHT = 550;
    private static final int WINDOW_HEIGHT = 600;
    private static final int POS_X = 650;
    private static final int POS_Y = 250;


    Scanner scan = new Scanner(new FileInputStream("myInfo.txt"));

    public ImageForFon() throws FileNotFoundException {


        setTitle("Resume(curriculumVitae)");
        myFoto = new ImageIcon(this.getClass().getResource("/1.JPG"));
        myLabel = new JLabel(myFoto);
        myLabel.setSize(WINDOW_WIDHT, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                message += "My name is " + myName + ".\n";
                message += "I'm " + age + " years old" + ".\n";
                message += "In 2009 graduated from GrGU as an economist-manager" + ".\n";
                message += "Now have been studying JAVA for three mounth" + ".\n";
                message += "Looking for work options with Java as an intern" + ".\n";
                JOptionPane.showMessageDialog(null, message, "Short info", JOptionPane.PLAIN_MESSAGE);
            }

        });

        button2.setBackground(Color.gray);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "";
                message += "Grodnenskiy leshoz, since 2010 " + ".\n";
                message += "Position - head of industrial production department" + ".\n";
                message += "Responsibilities - planning, management and\n";
                message += "setting task for successful functioning" + ".\n";
                JOptionPane.showMessageDialog(null, message, "About my job", JOptionPane.PLAIN_MESSAGE);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Schildt Herbert - Java:A beginner's guid (studying at the moment).\n" +
                        "Training Java,Git courses from GeekBrains (studying at the moment).\n" +
                        "1 month of studying at ItAcademy and different video from youtube.");
            }

        });

        button4.setBackground(Color.cyan);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "I think i get that time/line of age, when\n" +
                        "i have to decide to change my future way.\n" +
                        "Now or never.\n" +
                        "So,here I am.");
            }

        });

        button5.setBackground(Color.green);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, scan.nextLine());
                System.exit(0);
            }

        });

        JPanel myPanel = new JPanel(new GridLayout(1, 4));
        myPanel.add(button1);
        myPanel.add(button2);
        myPanel.add(button3);
        myPanel.add(button4);

        add(myLabel);
        setSize(WINDOW_WIDHT, WINDOW_HEIGHT);

        setLocation(POS_X, POS_Y);
        add(myPanel, BorderLayout.NORTH);
        add(button5, BorderLayout.SOUTH);
        setVisible(true);
        setResizable(false);

    }

}