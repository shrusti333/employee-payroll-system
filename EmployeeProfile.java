/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeProfile;

import AddEmployee.AddEmployee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author shrusti
 */
public class EmployeeProfile extends JFrame {
    @SuppressWarnings("empty-statement")
    public void profile(){
        String ename="",add="",dep="",phone="",gmail="",password="";
        JPanel p =new JPanel();
        p.setBackground(new Color(0,0,0,80));
        p.setBounds(0,0,900,100);
        JPanel p1 =new JPanel();
        p1.setBounds(270, 120,500,500);
        JTextArea a=new JTextArea();
        JLabel name=new JLabel(" EMPLOYEE INFO");
        name.setBounds(200,50, 400, 50);
        Font f=new Font("serif",Font.BOLD,24);
        name.setFont(f);
        p.add(name);
        try {
                     Class.forName("com.mysql.jdbc.Driver");
                     System.out.println("hi");
                     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","#S@v1ND33");
                      System.out.println("hi");
                     Statement stmt=con.createStatement();
                     ResultSet rs=stmt.executeQuery("SELECT *FROM employee");
                     while(rs.next()){
                         ename=rs.getString(1);
                     add=rs.getString(2);
                     dep=rs.getString(3);
                     phone=rs.getString(4);
                     gmail=rs.getString(5);
                     password=rs.getString(6);}
                     
                         
                     
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (SQLException ex) {
                 Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
             }catch(Exception te){
                 
             }
            
      
       
       String data[][]={{ename},{add},{dep},{phone},{gmail},{password}};
    String c[]={" "," info"};
     JTable t =new JTable(data,c);
     t.setBounds(270, 120,500,500);
     JScrollPane sp=new JScrollPane(t);
     
        
        
        
      setSize(900,600);
        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      ImageIcon background_img=new ImageIcon("D:\\images.jpg");
      
     
      Image img=background_img.getImage();
      Image temp=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
      background_img=new ImageIcon(temp);
     
      JLabel background =new JLabel(background_img,JLabel.CENTER);
      background.setBounds(0, 0, 900, 600);
      add(background);
      
    p1.add(sp);
    background.add(p1);
      
     background.add(p);
  
       setVisible(true);
    }
}
