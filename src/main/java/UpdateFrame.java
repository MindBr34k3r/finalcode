import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UpdateFrame implements ActionListener {
    JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,lab1,updateEquip,overAll;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,findText;
    JButton submit, cancel, find;
    
    UpdateFrame() {
	f = new JFrame("Update Equipment Info");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        overAll = new JLabel();
        overAll.setBounds(0,0,900,700);
        overAll.setLayout(null);
        
        updateEquip = new JLabel("Update Equipment Details");
        updateEquip.setBounds(50,30,500,50);
        updateEquip.setFont(new Font("Tahoma",Font.ITALIC,25));
        updateEquip.setForeground(Color.black);
        overAll.add(updateEquip);
        f.add(overAll);
        
        id1 = new JLabel("NAME");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("Tahoma",Font.BOLD,16));        
        t1 = new JTextField();
        t1.setBounds(250,150,150,30);
        overAll.add(id1);
        overAll.add(t1);
        
        id2 = new JLabel("ID");
        id2.setBounds(450,150,200,30);
        id2.setFont(new Font("Tahoma",Font.BOLD,16));        
        t2 = new JTextField();
        t2.setBounds(600,150,150,30);
        overAll.add(id2);
        overAll.add(t2);
        
        id3 = new JLabel("MANUFACTURE");
        id3.setBounds(50,200,130,30);
        id3.setFont(new Font("Tahoma",Font.BOLD,16));      
        t3 = new JTextField();
        t3.setBounds(250,200,150,30);
        overAll.add(id3);
        overAll.add(t3);
        
        id4 = new JLabel("SUPLIER");
        id4.setBounds(450,200,200,30);
        id4.setFont(new Font("Tahoma",Font.BOLD,16));      
        t4 = new JTextField();
        t4.setBounds(600,200,150,30);
        overAll.add(id4);
        overAll.add(t4);
        
        id5 = new JLabel("YEAR");                    
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("Tahoma",Font.BOLD,16));      
        t5 = new JTextField();
        t5.setBounds(250,250,150,30);
        overAll.add(id5);
        overAll.add(t5);
        
        id6 = new JLabel("SERIES");
        id6.setBounds(450,250,100,30);
        id6.setFont(new Font("Tahoma",Font.BOLD,16));      
        t6 = new JTextField();
        t6.setBounds(600,250,150,30);
        overAll.add(id6);
        overAll.add(t6);
        
        id7 = new JLabel("START USING");
        id7.setBounds(50,300,130,30);
        id7.setFont(new Font("Tahoma",Font.BOLD,16));      
        t7 = new JTextField();
        t7.setBounds(250,300,150,30);
        overAll.add(id7);
        overAll.add(t7);
        
        id8 = new JLabel("LASTEST FIX ");
        id8.setBounds(450,300,130,30);
        id8.setFont(new Font("Tahoma",Font.BOLD,16));      
        t8 = new JTextField();
        t8.setBounds(600,300,150,30);
        overAll.add(id8);
        overAll.add(t8);
        
        id9 = new JLabel("OPERATION REPAIR");
        id9.setBounds(50,350,170,30);
        id9.setFont(new Font("Tahoma",Font.BOLD,16));      
        t9 = new JTextField();
        t9.setBounds(250,350,150,30);
        overAll.add(id9);
        overAll.add(t9);
        
        id10 = new JLabel("CONDITION");
        id10.setBounds(450,350,150,30);
        id10.setFont(new Font("Tahoma",Font.BOLD,16)); 
        t11 = new JTextField();
        t11.setBounds(600,350,150,30);
        overAll.add(id10);
        overAll.add(t11);
        /* String condition[] = {"GOOD","BAD","NEW","BROKE"};
        c1 = new JComboBox<>(condition);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,350,150,30);      
        overAll.add(c1);   
        */
        
        lab1 = new JLabel("Enter an ID to Update:");
        lab1.setBounds(450,55,200,30);
        lab1.setFont(new Font("Tahoma",Font.ITALIC,12));
        lab1.setForeground(Color.black);
        overAll.add(lab1);
        
        findText = new JTextField();
        findText.setBounds(450,80,250,30);
        overAll.add(findText);
        
        
        find = new JButton("FIND");
        find.setBackground(Color.BLACK);
        find.setForeground(Color.WHITE);
        find.setBounds(710,80,80,30);
        find.setFocusable(false);
        overAll.add(find);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,450,150,40);
        submit.setFocusable(false);
        overAll.add(submit);
        
        cancel=new JButton("Cancel");   
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450,450,150,40);
        cancel.setFocusable(false);
        overAll.add(cancel);
        
        find.addActionListener(this);
        submit.addActionListener(this);
        cancel.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(850,600);
        f.setLocation(400,150);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == cancel) {
	    f.dispose();
	}
    }

    /*
    public static void main(String[ ] arg){
        new UpdateFrame().f.setVisible(true);
    }*/
}
 