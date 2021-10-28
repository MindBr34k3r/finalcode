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
    
    private JLabel addLabel, updateLabel, deleteLabel, searchLabel, displayLabel;
    private JButton addButton, updateButton, deleteButton, searchButton, displayButton;
    private JTextField deleteField, searchField, displayField;
    private JTable mainTable;
    
    int j = 0;

    public MainMenu() {
        super("Equipment Management System");
        setSize(1260,650);
        setLocation(200, 200);
        setLayout(null);
        
        //String header[] = new String[] {"NAME", "ID", "MANUFACTURE", "SUPLIER", "YEAR", "SERIES ",
        //              "START USING ", "LASTEST FIX ", "OPERATION REPAIR", "CONDITION "};
        //Object[][] data = new Object[100][10];

        mainTable = new JTable(/*data, header*/);
        mainTable.setBounds(30,40,200,300);
        JScrollPane tableScroll = new JScrollPane(mainTable);
        tableScroll.setBounds(20,60,1200,330);
        add(tableScroll);
        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { 
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
            },
            new String[] {"NAME", "ID", "MANUFACTURE", "SUPLIER", "YEAR", "SERIES ",
                        "START USING ", "LASTEST FIX ", "OPERATION REPAIR", "CONDITION "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, 
                java.lang.String.class, java.lang.String.class, java.lang.String.class, 
                java.lang.String.class, java.lang.String.class, java.lang.String.class, 
                java.lang.String.class
            };
            
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };
            
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mainTable.getTableHeader().setReorderingAllowed(false);

        deleteLabel = new JLabel("Enter roll number to delete: ");
        deleteLabel.setBounds(50,400,400,30);
        deleteLabel.setFont(new Font("Tahoma",Font.BOLD,20));
        add(deleteLabel);
        
	    deleteField = new JTextField();
        deleteField.setBounds(400,400,200,30);
        add(deleteField);
        
        deleteButton = new JButton("Delete");
        deleteButton.setBackground(Color.BLACK);
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setBounds(620, 400, 100 ,30);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);

        displayButton = new JButton("Display");
        displayButton.setBackground(Color.BLACK);
        displayButton.setForeground(Color.WHITE);
        displayButton.setBounds(210, 25, 85 ,25);
        displayButton.setFocusable(false);
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });
        add(displayButton);
        
        displayLabel = new JLabel("Display Equipments");
	    displayLabel.setBounds(20,25,200,25);
	    displayLabel.setFont(new Font("Tahoma",Font.BOLD,18));
	    add(displayLabel);
        
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
	    
	    searchLabel = new JLabel("Enter ID to search");
        searchLabel.setBounds(850,8,400,20);
        searchLabel.setFont(new Font("Tahoma",Font.ITALIC,12));
        add(searchLabel);
        
        searchField = new JTextField();
        searchField.setBounds(850,25,230,25);
        add(searchField);
        
        searchButton = new JButton("Search");
        searchButton.setBackground(Color.BLACK);
        searchButton.setForeground(Color.WHITE);
        searchButton.setBounds(1085, 25, 85 ,25);
        searchButton.setFocusable(false);
	    /*searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });*/
        add(searchButton);
        
        getContentPane().setBackground(Color.WHITE);
        
        this.setVisible(true);
    }
    
    private void deleteButtonActionPerformed(ActionEvent evt) {                                         
        //Xóa Thiết Bị Khỏi Danh Sách
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

    private void displayButtonActionPerformed(ActionEvent evt) {
        // Hiển thị thông tin
            if(evt.getSource() == displayButton){
                try {
                    //Xóa bảng
                    for (int x = 0; x < 100; x++) {
                        for (int j = 0; j < 10; j++) { 
                            mainTable.setValueAt("", x, j);
                        }
                    }
                    // Đọc -> ghi dữ liệu ra bảng
                    BufferedReader rdfile = new BufferedReader(new FileReader("equips.txt"));

                    String[] equipline = new String[100];
                    String[] temp;

                    for (int x = 0; (equipline[x] = rdfile.readLine()) != null; x++) {
                        temp = equipline[x].split("\t");
                        for (int j = 0; j < 10; j++) {
                            mainTable.setValueAt(temp[j], x, j);
                        }
                    }
                    rdfile.close();

                } catch (IOException e) {
                }
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
