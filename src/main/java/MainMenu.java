import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        add(updateButton);
        
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        
        mainTable = new JTable(data, header);
        
        JScrollPane tableScroll = new JScrollPane(mainTable);
        tableScroll.setBounds(20,20,1200,330);
        add(tableScroll);
        
        getContentPane().setBackground(Color.WHITE);
        
        deleteButton.addActionListener(this);
        this.setVisible(true);
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == addButton) {
	    new AddFrame().f.setVisible(true);
	}
	if (e.getSource() == updateButton) {
	    new UpdateFrame().f.setVisible(true);
	}
    }
    
    public static void main(String[] args) {
	new MainMenu().setVisible(true);
    }
    
}