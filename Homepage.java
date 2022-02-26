/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;
import miniproject.*;

import AdminLogin.AdminLogin;
import java.awt.*;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.image.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
        
import javax.swing.border.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import miniproject.*;

/**
 *
 * @author shrusti
 */
public class Homepage extends JFrame{ 
    
    

    
    
    public void wlecome(){
 
        AdminLogin adminlogin=new AdminLogin();
        JPanel p =new JPanel();
        p.setForeground(Color.white);

        p.setBackground(new Color(0,0,0,80));
        p.setBounds(0,0,900,100);
        JLabel name=new JLabel("WELCOME TO ABC LIMITED");
        
        name.setBounds(200,50, 400, 50);
        Font f=new Font("serif",Font.BOLD,30);
        name.setFont(f);
        p.add(name);
        
        JPanel option=new JPanel();
        option.setLayout(null);
        option.setSize(400,350);
        option.setBackground(new Color(0,0,0,60));
        
        JRadioButton b1=new JRadioButton("ADMIN");
        JRadioButton b2=new JRadioButton("EMPLOYEE");
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b1.setBounds(50,50,300,50);
        option.add(b1);
        b2.setBounds(50,150,300,50);
        option.add(b2);
           
        JButton b=new JButton("proceed");
        b.setBounds(130,250,100,50);
        b.setBackground(Color.white);
        option.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
           
              if(b1.isSelected()){
                   adminlogin.display();
                 
                  
              }  
              if(b2.isSelected()){
                  
             
              }
            }
        });
    
        
      option.setBounds(250, 175,400,350);
      setSize(900,600);
        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      ImageIcon background_img=new ImageIcon("D:\\back.jpg");
      
     
      Image img=background_img.getImage();
      Image temp=img.getScaledInstance(900,600,Image.SCALE_SMOOTH);
      background_img=new ImageIcon(temp);
     
      JLabel background =new JLabel(background_img,JLabel.CENTER);
      background.setBounds(0, 0, 900, 600);
      add(background);
      
      background.add(option);
      
     background.add(p);
  
       setVisible(true);
       
    }
    
    
   }



