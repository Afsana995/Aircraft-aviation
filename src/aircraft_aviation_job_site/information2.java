/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aircraft_aviation_job_site;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
/**
 *
 * @author ASUS
 */
public class information2 extends JFrame implements ActionListener{
    private CardLayout card;
    private Container c;
    private JPanel panel;
    private ImageIcon icons;
    private JTable table;
    private JButton prevButton,nextButton,closeButton;
    private JLabel label1,label2;
    private JScrollPane scroll;
    private String[] cols = {"Course-Title","Course-cost"};
    private String[][] rows={
        {"Comunication skill","3000"},
        {"Safety and First Aidproccess","5000"},
        {"Introduction to Aviation Hospitality","4500"},
        {"Fornt officer operation","9000"},
        {"Cargo Mangment and landind process","5600"},
    };
    information2(){
        initComponents();
        showimage();
    
    }
   
    
    public void showimage(){
        String[] ImageName = {"003.jpg","004.jpg","005.jpg","006.jpg","007.jpg"};
        for(String n:ImageName){
            icons = new ImageIcon("src/slideImage/"+n);
            Image img = icons.getImage();
            label1 = new JLabel(icons);
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icons = new ImageIcon(newImage);
            panel.add(label1);
        }
       
    }
    public void initComponents(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setBounds(280, 150, 1550, 850);
       this.setTitle("COURSE INFORMATION");
       c = this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.white);
       label2 = new JLabel();
       label2.setBounds(1000, 10, 300, 250);
       c.add(label2);
       table = new JTable(rows,cols);
      // table.setEnabled(false);
       table.setSelectionBackground(Color.YELLOW);
       scroll = new JScrollPane(table);
       scroll.setBounds(950, 250, 600, 150);
       c.add(scroll);
       card = new CardLayout();
       panel = new JPanel(card);
       panel.setBounds(10,10,900,640);
           c.add(panel);
         
           prevButton = new JButton("Previous");
           prevButton.setBounds(10, 650, 100, 50);
       c.add(prevButton);
        nextButton = new JButton("Next");
           nextButton.setBounds(800, 650, 100, 50);
       c.add(nextButton);
        closeButton = new JButton("Close");
           closeButton.setBounds(1350, 732, 100, 50);
           
       c.add(closeButton);
       prevButton.addActionListener(this);
        nextButton.addActionListener(this);
        closeButton.addActionListener(this);
       
    }

 @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==prevButton){
            card.previous(panel);
        }
        if(e.getSource()==nextButton){
        card.next(panel);
        }
        if(e.getSource()==closeButton){
            setVisible(false);
            new Information().setVisible(true);
        }
    }


      
           
   
   public static void main(String[] args){
    information2 frame = new information2() ; 
    frame.setVisible(true);
    }

}