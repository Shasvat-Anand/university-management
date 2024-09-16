import java.awt.Image;

import javax.swing.*;
public class splash extends JFrame implements Runnable{
    Thread t;
    splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("splash1.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        add(img);
        t=new Thread(this);
        t.start();
        setVisible(true);


        int x=1;
        for (int i=2;i<=600;i+=4,x+=1){
            setLocation( 600 -((i +x)/2),350 -(i/2));
            setSize( i+3*x , i+x/2);


            try {
                Thread.sleep(10);
                
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }

        }
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            //next class 
            new login();

        }catch(Exception e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new splash();
    }
}