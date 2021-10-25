import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AddFrame implements ActionListener{
    
    JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,newEquip,overAll;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton submit, cancel;
    
    AddFrame() {
	f = new JFrame("Add Student");
        f.setBackground(Color.white);
        f.setLayout(null);
        
        overAll = new JLabel();
        overAll.setBounds(0,0,900,700);
        overAll.setLayout(null);
        
        newEquip = new JLabel("New Equipment Details");
        newEquip.setBounds(300,30,500,50);
        newEquip.setFont(new Font("Tahoma",Font.ITALIC,25));
        newEquip.setForeground(Color.black);
        overAll.add(newEquip);
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
        
        id4 = new JLabel("SUPPLIER");
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
        t10 = new JTextField();
        t10.setBounds(600,350,150,30);
        overAll.add(id10);
        overAll.add(t10);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,450,150,40);
        submit.setFocusable(false);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        overAll.add(submit);
        
        cancel=new JButton("Cancel");   
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450,450,150,40);
        cancel.setFocusable(false);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        overAll.add(cancel);

        f.setVisible(true);
        f.setSize(850,600);
        f.setLocation(400,150);
    }
    
    public void cancelActionPerformed(ActionEvent evt) {
	if (evt.getSource() == cancel) {
	    f.dispose();
	}
    }
    
    private void submitActionPerformed(ActionEvent evt) {                                         
        // THEM THIET BI VAO BANG
        if (evt.getSource() == submit){
	    try {
            if (t1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter name!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            }else{
                FileReader fileread = new FileReader("equips.txt");
                BufferedReader readfile = new BufferedReader(fileread);

                String[] equipline = new String[100];
                String name = "", manufacture = "", supplier = "", latestFix = "", condition = "", start= "", id="", year="", series="", operation="";
                boolean found = false;

                int x = 0;
                while ((equipline[x] = readfile.readLine()) != null) {
                    x++;
                }
                readfile.close();
		    
                if (!(x >= 100)) {
                    name = t1.getText();

                    for (int j = 0; equipline[j] != null; j++) {      //KIEM TRA XEM EQUIP CO TRONG DSACH HAY KHONG
                        String[] temp = equipline[j].split("\t");

                        if (name.equals(temp[0])) {
                            found = true;
                        }
                    }

                    if (found = true) {
                        JOptionPane.showMessageDialog(null, "Equipment already exist!\nPlease using UPDATE to change values", "", JOptionPane.WARNING_MESSAGE);
                    }else{
                        id = t2.getText();
                        manufacture = t3.getText();
                        supplier = t4.getText();
                        year = t5.getText();
                        series = t6.getText();
                        start = t7.getText();
                        latestFix = t8.getText();
                        operation = t9.getText();
                        condition = t10.getText();

                        equipline[x] = name + "\t" + id + "\t" + manufacture + "\t" + supplier  + "\t" + year  + "\t" + series  + "\t" + start  + "\t" + latestFix  + "\t" + operation + "\t" + condition;

                        FileWriter filewrite = new FileWriter("equips.txt");
                        PrintWriter writefile = new PrintWriter(filewrite);

                        for (int j = 0; equipline[j] != null; j++) {
                            writefile.println(equipline[j]);
                        }

                        writefile.close();

                        JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                        JOptionPane.showMessageDialog(null, "Storage Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            
        } catch (IOException e) {
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Some input may be invalid!", "Warning!", JOptionPane.WARNING_MESSAGE);

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
        }
    }}
    private void t1ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t2ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t3ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t4ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t5ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t6ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t7ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t8ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t9ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }
    private void t10ActionPerformed(ActionEvent evt){
        submitActionPerformed(evt);
    }

    /*public static void main(String[] args){
        new AddFrame().f.setVisible(true);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}