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



public class UpdateFrame implements ActionListener {
    JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,lab1,updateEquip,overAll;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,findText;
    JButton cancel, find, submit;
    
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
        
        /* String condition[] = {"GOOD","BAD","NEW","BROKE"};
        c1 = new JComboBox<>(condition);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,350,150,30);      
        overAll.add(c1);   
        */
        
        lab1 = new JLabel("Enter name to Update:");
        lab1.setBounds(450,55,200,30);
        lab1.setFont(new Font("Tahoma",Font.ITALIC,12));
        lab1.setForeground(Color.black);
        overAll.add(lab1);
        
        findText = new JTextField();
        findText.setBounds(450,80,250,30);
        overAll.add(findText);
        
        
        find=new JButton("Find");   
        find.setBackground(Color.BLACK);
        find.setForeground(Color.WHITE);
        find.setBounds(710,80,80,30);
        find.setFocusable(false);
        find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });
        overAll.add(find);

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

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,450,150,40);
        submit.setFocusable(false);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        overAll.add(submit);

        id1 = new JLabel("NAME");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("Tahoma",Font.BOLD,16));        
        t1 = new JTextField();
        t1.setBounds(250,150,150,30);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        
        overAll.add(id1);
        overAll.add(t1);
        
        id2 = new JLabel("ID");
        id2.setBounds(450,150,200,30);
        id2.setFont(new Font("Tahoma",Font.BOLD,16));        
        t2 = new JTextField();
        t2.setBounds(600,150,150,30);
        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        overAll.add(id2);
        overAll.add(t2);
        
        id3 = new JLabel("MANUFACTURE");
        id3.setBounds(50,200,130,30);
        id3.setFont(new Font("Tahoma",Font.BOLD,16));      
        t3 = new JTextField();
        t3.setBounds(250,200,150,30);
        t3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        overAll.add(id3);
        overAll.add(t3);
        
        id4 = new JLabel("SUPPLIER");
        id4.setBounds(450,200,200,30);
        id4.setFont(new Font("Tahoma",Font.BOLD,16));      
        t4 = new JTextField();
        t4.setBounds(600,200,150,30);
        overAll.add(id4);
        overAll.add(t4);
        t4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        
        id5 = new JLabel("YEAR");                    
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("Tahoma",Font.BOLD,16));      
        t5 = new JTextField();
        t5.setBounds(250,250,150,30);
        overAll.add(id5);
        overAll.add(t5);
        t5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        
        id6 = new JLabel("SERIES");
        id6.setBounds(450,250,100,30);
        id6.setFont(new Font("Tahoma",Font.BOLD,16));      
        t6 = new JTextField();
        t6.setBounds(600,250,150,30);
        overAll.add(id6);
        overAll.add(t6);
        t6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        
        id7 = new JLabel("START USING");
        id7.setBounds(50,300,130,30);
        id7.setFont(new Font("Tahoma",Font.BOLD,16));      
        t7 = new JTextField();
        t7.setBounds(250,300,150,30);
        overAll.add(id7);
        overAll.add(t7);
        t7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        
        id8 = new JLabel("LASTEST FIX ");
        id8.setBounds(450,300,130,30);
        id8.setFont(new Font("Tahoma",Font.BOLD,16));      
        t8 = new JTextField();
        t8.setBounds(600,300,150,30);
        overAll.add(id8);
        overAll.add(t8);
        t8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        
        id9 = new JLabel("OPERATION REPAIR");
        id9.setBounds(50,350,170,30);
        id9.setFont(new Font("Tahoma",Font.BOLD,16));      
        t9 = new JTextField();
        t9.setBounds(250,350,150,30);
        overAll.add(id9);
        overAll.add(t9);
        t9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });
        
        id10 = new JLabel("CONDITION");
        id10.setBounds(450,350,150,30);
        id10.setFont(new Font("Tahoma",Font.BOLD,16)); 
        t10 = new JTextField();
        t10.setBounds(600,350,150,30);
        overAll.add(id10);
        overAll.add(t10);
        t10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });
        
        f.setVisible(true);
        f.setSize(850,600);
        f.setLocation(400,150);
    }
    
    public void cancelActionPerformed(ActionEvent evt) {
        if (evt.getSource() == cancel) {
            f.dispose();
        }
    }

    public void findActionPerformed(ActionEvent evt) {
        if (evt.getSource() == cancel) {
            f.dispose();
        }
    }

    private void findButtonActionPerformed(ActionEvent evt){
        // Tìm kiếm Equip
        if(evt.getSource() == find){
            try{
                if(findText.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Enter name!", "Ooops Wait...!", JOptionPane.ERROR_MESSAGE);
               
                else{
                    FileReader fileread = new FileReader("equips.txt");
                    BufferedReader readfile = new BufferedReader(fileread);
    
                    String[] equipline = new String[100];
                    String temp[];
                    int x = 0;
                    boolean found = false;
                    
                    String search = "";
                    search = findText.getText();

                    while ((equipline[x] = readfile.readLine()) != null) {
                        temp = equipline[x].split("\t");
                                
                        if(search.equals(temp[0])){
                            t1.setText(temp[0]);
                            t2.setText(temp[1]);
                            t3.setText(temp[2]);
                            t4.setText(temp[3]);
                            t5.setText(temp[4]);
                            t6.setText(temp[5]);
                            t7.setText(temp[6]);
                            t8.setText(temp[7]);
                            t9.setText(temp[8]);
                            t10.setText(temp[9]);
                            found = true;
                            }
                            x++;
                        }
                        readfile.close();
                        
                        if(!found)
                            JOptionPane.showMessageDialog(null, "Equipment Not Found!","Warning!",JOptionPane.WARNING_MESSAGE);
            }
                    
        }catch(IOException e){} catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Some input may be invalid!","Warning!", JOptionPane.WARNING_MESSAGE);
                
                findText.setText("");
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
        }
    }
    
    private void submitButtonActionPerformed(ActionEvent evt) {                                         
        //Cập nhật thông tin
        if(evt.getSource() == submit){
            try{
                if(t1.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Enter name!", "Ooops Wait...!", JOptionPane.ERROR_MESSAGE);
               
                else{
                    FileReader fileread = new FileReader("equips.txt");
                    BufferedReader readfile = new BufferedReader(fileread);
    
                    String[] equipline = new String[100];
                    String temp[];
                    int x = 0;  
                    String name = "", manufacture = "", supplier = "", latestFix = "", condition = "", start= "", id="", year="", series="", operation="";

                    name = t1.getText();
                    id = t2.getText();
                    manufacture = t3.getText();
                    supplier = t4.getText();
                    year = t5.getText();
                    series = t6.getText();
                    start = t7.getText();
                    latestFix = t8.getText();
                    operation = t9.getText();
                    condition = t10.getText();

                    if( (!(name.equals(""))) || (!(manufacture.equals(""))) || (!(supplier.equals(""))) || (!(latestFix.equals(""))) || (!(condition.equals(""))) || (!(start.equals(""))) || (!(id.equals(""))) || (!(year.equals(""))) || (!(series.equals(""))) || (!(operation.equals(""))) ){
                            while((equipline[x] = readfile.readLine()) != null) {
                                temp = equipline[x].split("\t");
                                
                                if(name.equals(temp[0])){
                                    if(manufacture.equals(""))
                                       manufacture = temp[1];
                                    if(supplier.equals(""))
                                       supplier = temp[2];
                                    if(latestFix.equals(""))
                                       latestFix = temp[3];
                                    if(condition.equals(""))
                                       condition = temp[4];
                                    if(start.equals(""))
                                       start = temp[5];
                                    if(id.equals(""))
                                       id = temp[6];
                                    if(year.equals(""))
                                       year = temp[7];
                                    if(series.equals(""))
                                       series = temp[8];
                                    if(operation.equals(""))
                                       operation = temp[9];                                    
                                    
                                    equipline[x] = name + "\t" + id + "\t" + manufacture + "\t" + supplier  + "\t" + year  + "\t" + series  + "\t" + start  + "\t" + latestFix  + "\t" + operation + "\t" + condition;
                            }
                            x++;
                        }
                        readfile.close();
    
                        FileWriter filewrite = new FileWriter("equips.txt");
                        PrintWriter writefile = new PrintWriter(filewrite);
                            
                        for (int j = 0; equipline[j] != null; j++) {
                            writefile.println(equipline[j]);
                        }
    
                        writefile.close();
    
                        JOptionPane.showMessageDialog(null, "Changes Saved!"," Ok!  :-)",JOptionPane.INFORMATION_MESSAGE);
                        
                        findText.setText("");    
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
                }
                    
            }catch(IOException e){} catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Some input may be invalid!","Warning!", JOptionPane.WARNING_MESSAGE);
                
                findText.setText("");
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
        }
    }

    private void t1ActionPerformed(ActionEvent evt){
        // submitActionPerformed(evt);
     }
     private void t2ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t3ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t4ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t5ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t6ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t7ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t8ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }
     private void t9ActionPerformed(ActionEvent evt){
        // submitActionPerformed(evt);
     }
     private void t10ActionPerformed(ActionEvent evt){
         //submitActionPerformed(evt);
     }

    /*public static void main(String[ ] arg){
        new UpdateFrame().f.setVisible(true);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new Error("Code sai roi lam lai di"); //To change body of generated methods, choose Tools | Templates.
    }
 
}  
                                 
 