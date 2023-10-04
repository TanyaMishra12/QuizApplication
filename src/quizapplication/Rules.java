
package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome  "+name+"  to DoYouKnow?");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,24));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rules.setText(
             "<html>"+ 
                "1. There will be 10 Question based on Java programming language." + "<br><br>" +
                "2. For Each Correct answer you will get 10 points." + "<br><br>" +
                "3. No negative marking." + "<br><br>" +
                "4. Out of Four option one should be selcted, then click on Next Button. " + "<br><br>" +
                "5. All the best!!!!"+"<br><br>" +
            "<html>"
        );
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
     

    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
            
        }else if(ae.getSource() == back){
            setVisible(false);
            new Login();
        }
        
    }
    
    public static void main(String[] args){
        new Rules("User");
        
    }
    
}
