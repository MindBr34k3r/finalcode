import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MainMenu extends JFrame implements ActionListener {
    
    JLabel addLabel, updateLabel, deleteLabel;
    JButton addButton, updateButton, deleteButton;
    JTextField deleteField;
    JTable mainTable;
    
    String header[] = {"NAME", "ID", "MANUFACTURE", "SUPLIER", "YEAR", "SERIES ",
	       		"START USING ", "LASTEST FIX ", "OPERATION REPAIR", "CONDITION "};
    String data[][] = new String[20][10];
    int i = 0, j = 0;
    
    public MainMenu() {
	super("Equipment Management System");
	setSize(1260,650);
	setLocation(200, 200);
	setLayout(null);
	
	deleteLabel = new JLabel("Enter roll number to delete: ");
	deleteLabel.setBounds(50,360,400,30);
	deleteLabel.setFont(new Font("Tahoma",Font.BOLD,20));
	add(deleteLabel);
	
	deleteField = new JTextField();
        deleteField.setBounds(400,360,200,30);
        add(deleteField);
        
        deleteButton = new JButton("Delete");
        deleteButton.setBackground(Color.BLACK);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBounds(620, 360, 100 ,30);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        
        addLabel = new JLabel("Add new Equipment");
	    addLabel.setBounds(50,450,400,30);
	    addLabel.setFont(new Font("Tahoma",Font.BOLD,20));
	    add(addLabel);
	
	    addButton = new JButton("Add Equipment");
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.WHITE);
        addButton.setBounds(330, 450, 150 ,30);
        addButton.setFocusable(false);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        add(addButton);
        
        updateLabel = new JLabel("Update Equipment Details");
        updateLabel.setBounds(50,490,400,30);
        updateLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        add(updateLabel);
        
        updateButton = new JButton("Update Equipment");
        updateButton.setBackground(Color.BLACK);
        updateButton.setForeground(Color.WHITE);
        updateButton.setBounds(330, 490, 150 ,30);
        updateButton.setFocusable(false);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(updateButton);
        
        mainTable = new JTable(data, header);
        
        JScrollPane tableScroll = new JScrollPane(mainTable);
        tableScroll.setBounds(20,20,1200,330);
        add(tableScroll);
        
        getContentPane().setBackground(Color.WHITE);
        
        this.setVisible(true);
    }
    
    private void deleteButtonActionPerformed(ActionEvent evt) {                                         
        //Xóa Thiết Bị Khỏi Bảng
        if (evt.getSource() == deleteButton){
        try{
            if (deleteField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Enter equips!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            }else{
                FileReader fileread = new FileReader("equips.txt");
                BufferedReader readfile = new BufferedReader(fileread);

                String[] equipline = new String[100];
                String[] temp;
                String delete = deleteField.getText();
                boolean found = false;

                int x = 0;
                while ((equipline[x] = readfile.readLine()) != null){
                    temp = equipline[x].split("\t");

                    if(delete.equals(temp[0])){
                        found = true;
                    }else{
                        x++;
                    }
                }
                readfile.close();

                FileWriter filewrite = new FileWriter("equips.txt");
                PrintWriter writefile = new PrintWriter(filewrite);
                for (int j = 0; equipline[j] != null; j++){
                    writefile.println(equipline[j]);
                }
                
                writefile.close();

                if (!found){
                    JOptionPane.showMessageDialog(null, "Equipment isn't in the list!", "Ooops!", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Succesfully Deleted!", "Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                }      
                deleteField.setText("");
            }
        } catch (IOException e) {}
    }}
     
    /*private void deleteFieldActionPerformed(ActionEvent evt){
        //deleteButtonActionPerformed(evt);
    }*/
 
    private void addActionPerformed(ActionEvent evt) {
	if (evt.getSource() == addButton) {
	    new AddFrame().f.setVisible(true);
	}
    }
    private void updateActionPerformed(ActionEvent evt) {
    	if (evt.getSource() == updateButton) {
	    new UpdateFrame().f.setVisible(true);
	}
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        throw new Error("Code sai rồi làm lại đi."); //To change body of generated methods, choose Tools | Templates.
    
    }
    public static void main(String[] args) {
	new MainMenu().setVisible(true);
    }
    
}