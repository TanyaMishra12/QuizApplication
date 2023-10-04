package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    
    Score(String name,int score){
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
       
        JLabel heading = new JLabel("Thank You  " +name+"  for playing!!! ");
        heading.setBounds(45,80,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.PLAIN,26));
        add(heading);
        
        
        JLabel userScore = new JLabel("Your Score is "+score);
        userScore.setBounds(350,200,300,30);
        userScore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(userScore);
        
        JButton submit = new JButton("Next");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.addActionListener(this);
        submit.setForeground(Color.WHITE);
        add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new Login();
    }
    
    public static void main(String[] args){
        new Score("user",0);
    }
}
