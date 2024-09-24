import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements  ActionListener {

    public Project(){
        setSize(1540,850);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image1/splash1.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1540,850,  Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);

        JMenuBar mb=new JMenuBar();
        //new information menubar
        JMenu newinfo=new JMenu("New Information ");
        newinfo.setForeground(Color.blue);
        mb.add(newinfo);
        // faculty information
        JMenuItem  facultyinfo=new JMenuItem("New Faculty Information");
        facultyinfo.setBackground( Color.white);
        newinfo.add(facultyinfo);
        // student information
        JMenuItem  stinfo=new JMenuItem("New Student Information");
        stinfo.setBackground( Color.white);
        newinfo.add(stinfo);

        //2 Detailshow
        JMenu Details=new JMenu("View Details");
        Details.setForeground(Color.blue);
        mb.add(Details);
        // faculty Details
        JMenuItem  facultydetail=new JMenuItem("Faculty Details");
        facultydetail.setBackground( Color.white);
        Details.add(facultydetail);
        // student Details
        JMenuItem  stdetail=new JMenuItem("Student Details");
        stdetail.setBackground( Color.white);
        Details.add(stdetail);

        //3 Leave
        JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.blue);
        mb.add(leave);
        // faculty leave
        JMenuItem  facultyleave=new JMenuItem("Faculty Leave");
        facultyleave.setBackground( Color.white);
        leave.add(facultyleave);
        // student leave
        JMenuItem  stleave=new JMenuItem("Student Leave");
        stleave.setBackground( Color.white);
        leave.add(stleave);

        //4 leave details
        JMenu lDetails=new JMenu("Leave Details");
        lDetails.setForeground(Color.blue);
        mb.add(lDetails);
        // faculty Details
        JMenuItem  lfacultydetail=new JMenuItem("Faculty Leave Details");
        lfacultydetail.setBackground( Color.white);
        lDetails.add(lfacultydetail);
        // student Details
        JMenuItem  lstdetail=new JMenuItem("Student Leave Details");
        lstdetail.setBackground( Color.white);
        lDetails.add(lstdetail);

        //5 examination
        JMenu exam=new JMenu("Examination");
        exam.setForeground(Color.blue);
        mb.add(exam);
        // examination details
        JMenuItem  Examdetail=new JMenuItem("Examination Details");
        Examdetail.setBackground( Color.white);
        exam.add(Examdetail);
        //  enter marks
        JMenuItem  entermark=new JMenuItem("Enter Marks");
        entermark.setBackground( Color.white);
        exam.add(entermark);

        ///6 update details
        JMenu UpdateInfo=new JMenu("Update Info");
        UpdateInfo.setForeground(Color.blue);
        mb.add(UpdateInfo);
        // faculty Details
        JMenuItem  facultyup=new JMenuItem(" Update Faculty Details");
        facultyup.setBackground( Color.white);
        UpdateInfo.add(facultyup);
        // student Details
        JMenuItem  studentup=new JMenuItem("Update Student Details");
        studentup.setBackground( Color.white);
        UpdateInfo.add(studentup);

        //7 fee details
        JMenu Fee=new JMenu("Fee Details");
        Fee.setForeground(Color.blue);
        mb.add(Fee);
        //  fee structure
        JMenuItem  feestructure=new JMenuItem("Fee Structure");
        feestructure.setBackground( Color.white);
        Fee.add(feestructure);
        //  fee form
        JMenuItem  feeform=new JMenuItem("Student Fee Form");
        feeform.setBackground( Color.white);
        Fee.add(feeform);


        // 8 utility
        JMenu utility=new JMenu("Utility");
        utility.setForeground(Color.blue);
        mb.add(utility);
        //  notepad
        JMenuItem  Notepad=new JMenuItem("Notepad");
        Notepad.setBackground( Color.white);
        Notepad.addActionListener(this);
        utility.add(Notepad);
        //  calculator
        JMenuItem  calc=new JMenuItem("Calculator");
        calc.setBackground( Color.white);
        calc.addActionListener(this);
        utility.add(calc);

        // 9 exit
        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.blue);
        mb.add(exit);
        //  notepad
        JMenuItem  ex=new JMenuItem("Exit");
        ex.setBackground( Color.white);
        ex.addActionListener(this);
        exit.add(ex);




        setJMenuBar(mb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String cmd = ae.getActionCommand();
        if(cmd.equals("Exit")){
            setVisible( false);
        }
        else if (cmd.equals( "Calculator")){
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        }
        else if (cmd.equals( "Notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {

            }
        }

    }
    public static void main(String[] args) {
        new Project();
    }
}

