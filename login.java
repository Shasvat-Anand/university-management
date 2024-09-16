import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class login extends JFrame  implements ActionListener{
    JTextField textfieldname;


    JPasswordField passwordField;

    JButton login,back;
    
    login(){
        JLabel username= new JLabel("Username");
        username.setBounds(40 ,40 ,100 ,20);
        add(username);

        textfieldname =new JTextField();
        textfieldname.setBounds( 150,40,150,20);
        add(textfieldname);


        JLabel password=new JLabel("Password");
        password.setBounds(40,80,100,20);
        add(password);

        passwordField =new JPasswordField();
        passwordField.setBounds( 150,80,150,20);
        add(passwordField);

        JButton login= new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground( Color.green);
        login.setForeground(Color.black);
        login.addActionListener(this);
        add(login);

        JButton back=new JButton("Cancel");
        back.setBounds( 200 ,140,120,30);
        back.setBackground( Color.green);
        back.setForeground( Color.black);
        back.addActionListener(this);
        add(back);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("loginicon.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(350,20,100,100);
        add(img);

        ImageIcon i11= new ImageIcon(ClassLoader.getSystemResource("loginback.jpeg"));
        Image i22=i11.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel image=new JLabel(i33);
        image.setBounds(0,0,500,300);
        add(image);


        setSize( 500,300);
        setLocation(500 ,250);
        setLayout( null);
        setVisible( true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e. getSource() == login){

        }
        else{
            setVisible(false);
        }



    }
    public static void main(String[] args) {
        new login();
    }
}
