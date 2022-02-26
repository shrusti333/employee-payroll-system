/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddEmployee;
import AdminHome.AdminHome;

import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author shrusti
 */
public class AddEmployee extends JFrame {
    public void add (){
             AdminHome adminhome=new AdminHome();
        JPanel p =new JPanel();
        p.setBackground(new Color(0,0,0,80));
        p.setBounds(0,0,900,100);
        JPanel p1 =new JPanel();
        p1.setBounds(500, 150,400,400);
        JTextArea a=new JTextArea();
        JLabel name=new JLabel("ADD EMPLOYEE");
        name.setBounds(200,50, 400, 50);
        Font f=new Font("serif",Font.BOLD,24);
        name.setFont(f);
        p.add(name);
        JPanel addemployee=new JPanel();
        addemployee.setLayout(null);
        addemployee.setSize(500,450);
        addemployee.setBackground(new Color(0,0,0,60));
        addemployee.setBounds(265, 150,400,400);
         
       JLabel l6=new JLabel( "      EMPLOYEE INFO");
     l6.setBounds(0,0,400,50);
    l6.setFont(f);
      l6.setBackground(new Color(0,0,0,80));
      addemployee.add(l6);
        JLabel l1=new JLabel("  NAME OF THE EMPLOYEE");
       l1.setBounds(55,65,250,40);
        JLabel l2=new JLabel("          ADDRESS");
        l2.setBounds(60,110,250,40);
        JLabel l3=new JLabel("         DEPARTMENT");
         l3.setBounds(60,160,250,40);;
        JLabel l4=new JLabel("        PHONE NO");
        l4.setBounds(60,215,250,40);
        JLabel l5=new JLabel("         EMAIL ID");
        l5.setBounds(60,260,250,40);
        JLabel l7=new JLabel("         PASSWORD ");
        l7.setBounds(60,305,250,40);
        JTextField t1=new JTextField();
        t1.setBounds(200,55,200,40);
        JTextField t2=new JTextField();
          t2.setBounds(200,105,200,40);
        JTextField t3=new JTextField();
          t3.setBounds(200,155,200,40);;
        JTextField t4=new JTextField();
         t4.setBounds(200,205,200,40);
        JTextField t5=new JTextField();
         t5.setBounds(200,250,200,40);
         JPasswordField t7=new JPasswordField();
         t7.setBounds(200,295,200,40);
        t1.setEnabled(true);
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        t5.setEnabled(true);
        t7.setEnabled(true);
        JButton b1=new JButton("add");
             b1.setBounds(90,345,100,50);
        JButton b2=new JButton("cancel");
         b2.setBounds(230,345,100,50);
        addemployee.add(l1);
         addemployee.add(t1);
        addemployee.add(l2);
         addemployee.add(t2);
         addemployee.add(l3);
         addemployee.add(t3);
         addemployee.add(l4);
        addemployee.add(t4);
        addemployee.add(l5);
        addemployee.add(t5);
        addemployee.add(l7);
        addemployee.add(t7);
        addemployee.add(b1);
        addemployee.add(b2);
        
        b1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
             if(e.getSource()==b1){
                 
             }
                 try {
                     Class.forName("com.mysql.jdbc.Driver");
                     System.out.println("hi");
                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?zeroDateTimeBehavior=CONVERT_TO_NULL","root","#S@v1ND33");
                      System.out.println("hi");
                     PreparedStatement Pstatement ;
                 Pstatement = con.prepareStatement("INSERT INTO employee"+" values (?,?,?,?,?,?)");
                 Pstatement.setString(1, t1.getText());
                     Pstatement.setString(2, t2.getText());
                     Pstatement.setString(3, t3.getText());
                     Pstatement.setString(4, t4.getText());
                     Pstatement.setString(5, t5.getText());
                     Pstatement.setString(6, t7.getText());
                     Pstatement.executeUpdate(); 
                     JOptionPane.showMessageDialog(null, "data was added successfully");
                     adminhome.home();
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (SQLException ex) {
                 Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
             }catch(Exception te){
                 
             }
            
      
         
         
         }
         
            });
        b2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
             int a=JOptionPane.showConfirmDialog(null,"are u sure??");
            if(a==JOptionPane.YES_OPTION){
                adminhome.home();
                  }
            }});
        
        
      
        setSize(900,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
       ImageIcon background_img=new ImageIcon("D:\\back.jpg");
        
        
        Image img=background_img.getImage();
        Image temp=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
        background_img=new ImageIcon(temp);
        
        JLabel background =new JLabel(background_img,JLabel.CENTER);
        
        background.add(addemployee);
        background.add(p);
        background.setBounds(0, 0 ,900,600);
        add(background);
    }
        
}
