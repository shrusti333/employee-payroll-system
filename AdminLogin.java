/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminLogin;
import java.awt.*;
import javax.swing.*;
import AdminHome.*;
import com.mysql.cj.xdevapi.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author shrusti
 */


     public class AdminLogin extends JFrame{
     public void display(){
         AdminHome adminhome=new AdminHome();
        JPanel p =new JPanel();
        p.setBackground(new Color(0,0,0,80));
        p.setBounds(0,0,900,100);
        JLabel name=new JLabel("WELCOME TO ABC LIMITED");
        name.setBounds(200,50, 400, 50);
        Font f=new Font("serif",Font.BOLD,24);
        name.setFont(f);
        p.add(name);
        JPanel login=new JPanel();
        login.setLayout(null);
        login.setSize(400,350);
        login.setBackground(new Color(0,0,0,60));
        login.setBounds(250, 175,400,350);
        JLabel l1=new JLabel("user name");
        l1.setBounds(50,50,300,50);
        JTextField t1= new JTextField ("");
        t1.setBounds(145,50,250,50);
        JLabel l2=new JLabel("password");
        l2.setBounds(50,150,300,50);
        JPasswordField t2= new JPasswordField ("");
        t2.setBounds(145,150,250,50);
         l1.setBackground(new Color(210,180,140));
        l2.setBackground(new Color(210,180,140));
         t1.setBackground(Color.WHITE);
        t2.setBackground(Color.WHITE);
         JButton b=new JButton("login");
        b.setBounds(130,250,100,50);
        b.setBackground(Color.WHITE);
        login.add(l1);
        login.add(t1);
        login.add(l2);
        login.add(t2);
        login.add(b);
          b.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
                String user="abc";
                String p="abc";
            String name="";
            String password="";
            name=t1.getText();
            password=t2.getText(); 
            if(name.equalsIgnoreCase(user)){
            if(password.equalsIgnoreCase(p)){
            JOptionPane.showMessageDialog(null, "Login Successful");
            adminhome.home();
            }
            else{
            JOptionPane.showMessageDialog(null, "Invalid Password");}
            }else{
            JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
              }
               
        });
        
        
        
      
        setSize(900,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
       ImageIcon background_img=new ImageIcon("D:\\back.jpg");
      
     
      Image img=background_img.getImage();
      Image temp=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
      background_img=new ImageIcon(temp);
     
      JLabel background =new JLabel(background_img,JLabel.CENTER);
      background.setBounds(0, 0, 900, 600);
      add(background);
        background.add(login);
        background.add(p);
       
       
    }

    
    
}

    
    
    
