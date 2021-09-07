
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author KBK
 */

/* 4 Separate panels:
    *1st Panel will be text saying "Student Database Management Systems in a large font size and bold
    *2nd panel (on the left) will show an empty field of labels: "studentId, fName, sName, Address, Gender, Maths, games, compSci, media, art, database, english, science there will be jcombox for the subjects regarding m/f or Core unit, complete, yes or no.
    *3rd panel: it will have a jtable created and it will store it in a database.
    *4th panel: full of jbutton: "Add, print, update, reset, delete, exit".
    */

public class UI {
    public JFrame f;
    public JPanel panelTitle, panelOuterStudent, panelInnerStudent1, panelInnerStudent2, panelTable, panelButton, panelTest;
    public JLabel labelPanelTitle, labelId, labelName, labelSurname, labelAddress, 
            labelGender, labelMaths, labelGames, labelCompsci, labelMedia, labelArt, 
            labelDatabase, labelSci, labelEng;
    public JTable table;
    public JButton btnAdd, btnPrint, btnUpd, btnReset, btnDel, btnExit;
    public JTextField txfId, txfName, txfSurname, txfAddress,
            txfGender, txfMaths, txfGames, txfCompsci, txfMedia, txfArt,
            txfDatabase, txfSci, txfEng;
    //Create a line separate around each panel
    
    public UI() {  
        f = new JFrame();
        initLabels();
        initPanels();     
        initTextfields();
        initBoundary();                
        f.add(panelTitle);
        f.add(panelOuterStudent);
        f.add(panelTable);
        f.add(panelButton);
        f.add(panelTest);
        f.setSize(900, 600);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void initPanels() {
        panelTitle = new JPanel();
        panelOuterStudent = new JPanel();
        panelInnerStudent1 = new JPanel();
        panelInnerStudent2 = new JPanel();
        panelTable = new JPanel();
        panelButton = new JPanel();
        panelTest = new JPanel();
    }
    
    public void initLabels() {
        //Inside panelOuterStudent
        labelPanelTitle = new JLabel("Student Database Management Systems");
        labelId = new JLabel("Student ID:");
        labelName = new JLabel("First Name:");
        labelSurname = new JLabel("Surname:");
        labelAddress = new JLabel("Address:");
        labelGender = new JLabel("Gender:");
        //Inside panelInnerStudent1
        labelMaths = new JLabel("Maths");
        labelGames = new JLabel("Games");
        labelCompsci = new JLabel("Comp Sci");
        labelMedia = new JLabel("Media");        
        //Inside panelInnerStudent2
        labelArt = new JLabel("Art");    
        labelDatabase = new JLabel("Database");    
        labelSci = new JLabel("Science");    
        labelEng = new JLabel("English");
    }
    
    public void initTextfields() {
        txfId = new JTextField();
        txfName = new JTextField();
        txfSurname = new JTextField();
        txfAddress = new JTextField();
        txfGender = new JTextField();
        txfMaths = new JTextField();
        txfGames = new JTextField();
        txfCompsci = new JTextField();
        txfMedia = new JTextField();
        txfArt = new JTextField();
        txfDatabase = new JTextField();
        txfSci = new JTextField();
        txfEng = new JTextField();
    }
    
    public void initBoundary() {
        //Top Panel
        labelPanelTitle.setBounds(150, -70, 700, 200);
        labelPanelTitle.setFont(new Font("Arial", Font.BOLD, 30));
        Border cyanline = BorderFactory.createLineBorder(Color.CYAN, 3);
        panelTitle.setBorder(cyanline);
        panelTitle.setBounds(0, 0, 900, 60);
        panelTitle.add(labelPanelTitle);
        panelTitle.setBackground(Color.yellow);
        panelTitle.setLayout(null);
        
        //Left panel
        labelId.setBounds(30, 10, 80, 23);
        txfId.setBounds(110, 10, 150, 23);
        labelName.setBounds(30, 45, 80, 23);
        txfName.setBounds(110, 45, 150, 23);
        
        panelOuterStudent.add(labelId);
        panelOuterStudent.add(labelName);
        panelOuterStudent.add(txfId);
        panelOuterStudent.add(txfName);
        
        
        panelOuterStudent.setBounds(0, 60, 300, 420);
        //panelOuterStudent.setBackground(Color.black);
        panelOuterStudent.setLayout(null);
        
        //Right panel
        panelTable.setBounds(300, 60, 585, 420);
        panelTable.setBackground(Color.orange);
        panelTable.setLayout(null);
        
        //Bottom panel
        panelButton.setBounds(0, 480, 900, 80);
        panelButton.setBackground(Color.cyan);
        panelButton.setLayout(null);
    }
    
}
