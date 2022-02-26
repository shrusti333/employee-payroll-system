/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddDepartment;
import AddEmployee.AddEmployee;
import AdminHome.AdminHome;
import com.sun.jdi.connect.spi.Connection;
import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author shrusti
 */

public class AddDepartment extends JFrame {
    public void add (){
             AdminHome adminhome=new AdminHome();
        JPanel p =new JPanel();
        p.setBackground(new Color(0,0,0,80));
        p.setBounds(0,0,900,100);
        JLabel name=new JLabel("ADD DEPARTMENT");
        name.setBounds(200,50, 400, 50);
        Font f=new Font("serif",Font.BOLD,24);
        name.setFont(f);
        p.add(name);
        JPanel adddepartment=new JPanel();
        adddepartment.setLayout(null);
        adddepartment.setSize(500,450);
       adddepartment.setBackground(new Color(0,0,0,60));
        adddepartment.setBounds(270, 150,400,400);
     JLabel l6=new JLabel( "    DEPARTMENT INFO");
     l6.setFont(f);
     l6.setBounds(0,0,400,50);
      l6.setBackground(new Color(0,0,0,80));
      adddepartment.add(l6);
     JLabel l1=new JLabel("   NAME ");
     l1.setBounds(60,70,300,50);
        JLabel l2=new JLabel("  MANAGER NAME");
        l2.setBounds(50,120,300,50);
        JLabel l3=new JLabel(" TOTAL NO OF EMPLOYEE");
        l3.setBounds(50,170,300,50);
        JLabel l4=new JLabel("  DEPARTMENT ID");
        l4.setBounds(50,220,300,50);
        JTextField t1=new JTextField();
        t1.setBounds(200,70,200,50);
        JTextField t2=new JTextField();
        t2.setBounds(200,120,200,50);
        JTextField t3=new JTextField();
        t3.setBounds(200,170,200,50);
        JTextField t4=new JTextField();
        t4.setBounds(200,220,200,50);
        
        t1.setEnabled(true);
    
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        
        JButton b1=new JButton("add");
             b1.setBounds(90,290,100,50);
        JButton b2=new JButton("cancel");
         b2.setBounds(230,290,100,50);
        adddepartment.add(l1);
        adddepartment.add(t1);
         adddepartment.add(l2);
         adddepartment.add(t2);
         adddepartment.add(l3);
         adddepartment.add(t3);
         adddepartment.add(l4);
        adddepartment.add(t4);
        adddepartment.add(b1);
        adddepartment.add(b2);
        b1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e) {
                  if(e.getSource()==b1){
                 
             }
                 try {
                     Class.forName("com.mysql.jdbc.Driver");
                     System.out.println("hi");
                     java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?zeroDateTimeBehavior=CONVERT_TO_NULL","root","#S@v1ND33");
                      System.out.println("hi");
                     PreparedStatement Pstatement ;
                 Pstatement = con.prepareStatement("INSERT INTO untitled "+"values(?,?,?,?)");
                 Pstatement.setString(1, t1.getText());
                     Pstatement.setString(2, t2.getText());
                     Pstatement.setString(3, t3.getText());
                     Pstatement.setString(4, t4.getText());
                   
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
        
        background.add(adddepartment);
        background.add(p);
        background.setBounds(0, 0 ,900,600);
        add(background);
    }
        
}

