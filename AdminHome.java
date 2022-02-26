/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminHome;

   import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import AddEmployee.AddEmployee; 
import AddDepartment.AddDepartment;
import AdminLogin.AdminLogin;
import SalaryReport.Salary2;
import homepage.Homepage;
/**
 *
 * @author shrusti
 */
public class AdminHome extends JFrame {
    
 


    

    public void home(){
       Homepage m=new Homepage();
      
      AdminLogin al=new AdminLogin();
        Salary2 s=new Salary2();
        AddEmployee ae=new  AddEmployee ();
        AddDepartment ad=new AddDepartment();
         JFrame f=new JFrame("Admin Home");
       int no_of_employee = 4,active=4,on_leave=0;
       JPanel p =new JPanel();
        p.setBackground(new Color(0,0,0,80));
        p.setBounds(0,0,900,100);
        JLabel name=new JLabel("ADMIN HOME");
        name.setBounds(200,50, 400, 50);
        Font f1=new Font("serif",Font.BOLD,24);
        name.setFont(f1);
        p.add(name);
       

        JPanel p2=new JPanel();
         p2 .setBounds(0,110,900,100);
         JPanel p4=new JPanel();
         p4 .setBounds(0,210,900,30);
        JPanel p3=new JPanel(); 
         p3 .setBounds(200, 300, 500, 250);
        p3.setLayout(new GridLayout(4,1));
        p2.setBackground(new Color(0,0,0,60));
        p4.setBackground(new Color(0,0,0,60));
        p3.setBackground(new Color(0,0,0,60));
        JButton b1=new JButton("Add Department");
        JButton b2=new JButton("Add Employee");
        JButton b3=new JButton("Salary report");
        JButton b4=new JButton("log out");
        p2.setLayout(null);
        p3.setLayout(null);
        p4.setLayout(null);
       
                ImageIcon img1=new ImageIcon("D:\\download (1).jpg");
         Image imga=img1.getImage();
        Image tempa=imga.getScaledInstance(225,100,Image.SCALE_SMOOTH);
        img1=new ImageIcon(tempa);
        
        JLabel i1 =new JLabel(img1,JLabel.CENTER);
        i1.setBounds(5,0, 225, 100);
        p2.add(i1);
        img1=new ImageIcon("D:\\download.jpg");
          imga=img1.getImage();
        tempa=imga.getScaledInstance(225,100,Image.SCALE_SMOOTH);
        img1=new ImageIcon(tempa);
        JLabel i2 =new JLabel(img1,JLabel.CENTER);
        i2.setBounds(230,0, 225, 100);
        
        p2.add(i2);
       
        img1=new ImageIcon("D:\\s.jpg");
          imga=img1.getImage();
        tempa=imga.getScaledInstance(225,100,Image.SCALE_SMOOTH);
        img1=new ImageIcon(tempa);
         
        JLabel i3 =new JLabel(img1,JLabel.CENTER);
        i3.setBounds(455,0, 225, 100);
        p2.add(i3);
        
        
        img1=new ImageIcon("D:\\bb.jpg");
          imga=img1.getImage();
        tempa=imga.getScaledInstance(225,100,Image.SCALE_SMOOTH);
        img1=new ImageIcon(tempa);
       
        JLabel i4 =new JLabel(img1,JLabel.CENTER);
        i4.setBounds(680,0, 225, 100);
         p2.add(i4);
        p2.add(i1);
        b1.setBounds(5,0,225,30);
        b1.setBorder(BorderFactory.createLineBorder(Color.black));
        b1.setBackground(Color.white);
        b2.setBounds(230,0,225,30);
         b2.setBorder(BorderFactory.createLineBorder(Color.black));
        b2.setBackground(Color.white);
         b3.setBorder(BorderFactory.createLineBorder(Color.black));
        b3.setBounds(455,0,225,30);
       b3.setBackground(Color.white);
        b4.setBorder(BorderFactory.createLineBorder(Color.black));
        b4.setBounds(680,0,225,30);
        b4.setBackground(Color.white);
          p4.add(b1);
          p4.add(b2);
          p4.add(b3);
          p4.add(b4);
           b1.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                   ad.add();
               }
              
          });
           b4.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                  m.wlecome();
               }
              
          });
           b2.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                  ae.add();
               }
              
          });
           b3.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) {
                  s.add();
               }
              
          });
          
              
         
           JLabel l2=new JLabel("no of employee ");
           JLabel l3=new JLabel("active ");
            JLabel l4=new JLabel("no leave");
            JTextField tf1=new JTextField(" "+ no_of_employee);
            JTextField tf2=new JTextField(" "+active);
            JTextField tf3=new JTextField(" "+on_leave);
           p3.setLayout(new GridLayout(3,2));
            p3.add(l2);
            p3.add(tf1);
            p3.add(l3);
            p3.add(tf2);
            p3.add(l4);
            p3.add(tf3);
       
          
        setSize(900,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
         ImageIcon background_img=new ImageIcon("D:\\back.jpg");
         Image img=background_img.getImage();
        Image temp=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
        background_img=new ImageIcon(temp);
        
        JLabel background =new JLabel(background_img,JLabel.CENTER);
         background.add(p3);
         background.add(p4);
        background.add(p2);
        background.add(p);
        background.setBounds(0, 0 ,900,600);
        add(background);
       
        
    // End of variables declaration                   
}
        
    }
    

