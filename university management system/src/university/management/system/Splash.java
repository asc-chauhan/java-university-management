package university.management.system;

import java.awt.*;

import javax.swing.*;

public class Splash extends JFrame implements Runnable{

    Thread t;
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/first.png"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel img = new JLabel(i3);
        add(img);

        t = new Thread(this);
        t.start();
//		setUndecorated(true); // Remove window borders
//        setLayout(new BorderLayout());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        int x = 1;
        for(int i = 2; i <= 600; i += 4, x += 1) {
            setLocation(600 - (i + x)/2 , 300 - i/2);
            setSize(i + 3 * x, i + x/2);
            try {
                Thread.sleep(10);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            // next class
            new Login();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Splash();
    }

}