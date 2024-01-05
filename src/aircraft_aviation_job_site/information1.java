/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aircraft_aviation_job_site;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */

public class information1 extends JFrame implements ActionListener {
    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane scroll;
    private JButton button;
    private String[] colm ={"Company-Name","Flight-Name","path","Date","Time"};
    private String[][] row ={
        {"Bangladesh_Airline","bd009","Dhaka to Shylet","01/01/2021","9:00AM"},
        {"Singapur_Airline","SA034","singapur to London","01/01/2021","5:15PM"},
    };
    information1(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(280, 150, 850, 700);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
       font = new Font("Arial",Font.BOLD,22);
        label = new JLabel("Flight Information");
        label.setFont(font);
        label.setBounds(250, 20, 200, 50);
        c.add(label);
        table = new JTable(row,colm);
        table.setSelectionBackground(Color.yellow);
        scroll = new JScrollPane(table);
        scroll.setBounds(50, 80, 700, 250);
        c.add(scroll);
        button = new JButton("CLOSE");
        button.setBounds(700, 550, 100, 50);
         c.add(button);
       button.addActionListener(this);
    }
    @Override
     public void actionPerformed(ActionEvent e) {
      //To change body of generated methods, choose Tools | Templates.
      if(e.getSource()== button){
          setVisible(false);
            new Information().setVisible(true); 
      }
    }

 public static void main(String[] args){
     information1 frame = new information1();
     frame.setVisible(true);
 }

    
  
    
}
