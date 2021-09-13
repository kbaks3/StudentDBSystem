
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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
public final class UI {

    public JFrame f;
    public JPanel panelTitle, panelOuterStudent, panelTable, panelButton, panelTest;
    public JLabel labelPanelTitle, labelId, labelName, labelSurname, labelAddress,
            labelGender, labelMaths, labelGames, labelCompsci, labelMedia, labelArt,
            labelDatabase, labelSci, labelEng, labelMob;
    public JButton btnAdd, btnPrint, btnUpd, btnReset, btnDel, btnExit;
    public JTextField txfId, txfName, txfSurname, txfAddress, txfMob;
    public JComboBox cbGender, cbMaths, cbGames, cbCompsci, cbMedia, cbArt, cbDatabase, cbSci, cbEng;
    public String[] defaultSubject = {"Yes", "No", "Core Unit", "Completed"};
    public String[] defaultGender = {"Male", "Female"};
    public JTable table;
    private JScrollPane sp;
    public String data[][] = {{"1", "1542372", "Kamal", "Bakar", "114 Blackpool lane",
        "Male", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes"}};
    public String[] cols = {"ID", "Stud-ID", "Fname", "Sname", "Address",
        "Gender", "Mob", "Maths", "Games", "CompSci", "Media", "Art"};
    //Create a line separate around each panel

    public UI() {
        f = new JFrame();
        initLabels();
        initPanels();
        initTextfields();
        initCombos();
        initButtons();
        panelTitleBound();
        panelWestBound();
        createTable();
        f.add(panelTitle, BorderLayout.NORTH);
        f.add(panelOuterStudent, BorderLayout.WEST);
        f.add(panelTable, BorderLayout.CENTER);
        f.add(panelButton, BorderLayout.SOUTH);
        //f.add(panelTest);
        f.setSize(900, 600);
        f.setResizable(true);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initPanels() {
        panelTitle = new JPanel();
        panelOuterStudent = new JPanel();
        panelTable = new JPanel();
        panelButton = new JPanel();
    }

    public void initLabels() {
        //Inside panelOuterStudent
        labelPanelTitle = new JLabel("Student Database Management Systems");
        labelId = new JLabel("Stud-ID:");
        labelName = new JLabel("F-Name:");
        labelSurname = new JLabel("S-name:");
        labelAddress = new JLabel("Address:");
        labelGender = new JLabel("Gender:");
        labelMob = new JLabel("Mobile:");
        //Inside panelInnerStudent1
        labelMaths = new JLabel("Maths");
        labelGames = new JLabel("Games");
        labelCompsci = new JLabel("CompSci");
        labelMedia = new JLabel("Media");
        //Inside panelInnerStudent2
        labelArt = new JLabel("Art");
        labelDatabase = new JLabel("Datab");
        labelSci = new JLabel("Sci");
        labelEng = new JLabel("Eng");
    }

    public void initTextfields() {
        txfId = new JTextField();
        txfName = new JTextField();
        txfSurname = new JTextField();
        txfAddress = new JTextField();
        txfMob = new JTextField();
    }

    public void initCombos() {
        cbGender = new JComboBox(defaultGender);
        cbMaths = new JComboBox(defaultSubject);
        cbGames = new JComboBox(defaultSubject);
        cbCompsci = new JComboBox(defaultSubject);
        cbMedia = new JComboBox(defaultSubject);
        cbArt = new JComboBox(defaultSubject);
        cbDatabase = new JComboBox(defaultSubject);
        cbSci = new JComboBox(defaultSubject);
        cbEng = new JComboBox(defaultSubject);
    }

    public void initButtons() {
        //Initialising
        btnAdd = new JButton("Add New");
        btnPrint = new JButton("Print");
        btnUpd = new JButton("Update");
        btnReset = new JButton("Reset");
        btnDel = new JButton("Delete");
        btnExit = new JButton("Exit");

        //Setting boundaries
        btnAdd.setBounds(50, 10, 120, 60);
        btnPrint.setBounds(180, 10, 120, 60);
        btnUpd.setBounds(310, 10, 120, 60);
        btnReset.setBounds(440, 10, 120, 60);
        btnDel.setBounds(570, 10, 120, 60);
        btnExit.setBounds(700, 10, 120, 60);

        //Resizing and new font
        btnAdd.setFont(new Font("", Font.BOLD, 20));
        btnPrint.setFont(new Font("", Font.BOLD, 20));
        btnUpd.setFont(new Font("", Font.BOLD, 20));
        btnReset.setFont(new Font("", Font.BOLD, 20));
        btnDel.setFont(new Font("", Font.BOLD, 20));
        btnExit.setFont(new Font("", Font.BOLD, 20));

        //Button listener (Add)
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Student ID: " + txfId.getText());
                System.out.println("First Name: " + txfName.getText());
                System.out.println("Surname: " + txfSurname.getText());
                System.out.println("Address: " + txfAddress.getText());
                System.out.println("Gender: " + cbGender.getSelectedItem().toString());
                System.out.println("Mobile: " + txfMob.getText());
            }
        });

        panelButton.add(btnAdd);
        panelButton.add(btnPrint);
        panelButton.add(btnUpd);
        panelButton.add(btnReset);
        panelButton.add(btnDel);
        panelButton.add(btnExit);
        panelButton.setBounds(0, 480, 890, 80);
        panelButton.setBackground(Color.cyan);
    }

    public void createTable() {
        //Set JTable boundaries in here to keep it clean
        //Right panel
        table = new JTable(data, cols);
        table.setBounds(20, 20, 500, 300);

        sp = new JScrollPane(table);
        //sp.setViewportView(table);
        sp.setBounds(20, 20, 550, 300);
        panelTable.add(sp);
        panelTable.setBounds(300, 60, 583, 420);
        panelTable.setBackground(Color.orange);
    }

    public void panelTitleBound() {
        //Title Panel
        //labelPanelTitle.setBounds(150, 70, 700, 200);
        labelPanelTitle.setFont(new Font("Arial", Font.BOLD, 30));
        Border cyanline = BorderFactory.createLineBorder(Color.CYAN, 3);
        panelTitle.setBorder(cyanline);
//        panelTitle.setBounds(0, 0, 884, 60);
        panelTitle.add(labelPanelTitle, BorderLayout.CENTER);
//        panelTitle.setBackground(Color.yellow);
    }

    public void panelWestBound() {
        JPanel pI = new JPanel();
        panelOuterStudent.setBorder(BorderFactory.createTitledBorder("Info"));        
        txfId.setPreferredSize(new Dimension(150, 23));
        pI.setLayout(new BoxLayout(pI, BoxLayout.Y_AXIS));
        pI.add(labelId);
        pI.add(txfId);
        pI.add(labelName);
        panelOuterStudent.add(pI);
//        panelOuterStudent.add(labelId);
//        panelOuterStudent.add(txfId);        
//        panelOuterStudent.add(labelName);
//        panelOuterStudent.add(labelSurname, BorderLayout.CENTER);
//        panelOuterStudent.add(labelAddress, BorderLayout.CENTER);
//        panelOuterStudent.add(labelGender);
//        panelOuterStudent.add(labelMob);
//        panelOuterStudent.add(labelMaths);
//        panelOuterStudent.add(labelGames);
//        panelOuterStudent.add(labelCompsci);
//        panelOuterStudent.add(labelMedia);     
//        panelOuterStudent.add(labelArt);
//        panelOuterStudent.add(labelDatabase);
//        panelOuterStudent.add(labelSci);
//        panelOuterStudent.add(labelEng);
//        panelOuterStudent.add(txfId);
//        panelOuterStudent.add(txfName);
//        panelOuterStudent.add(txfSurname);
//        panelOuterStudent.add(txfAddress);       
//        panelOuterStudent.add(cbGender);       
//        panelOuterStudent.add(txfMob);   
//        panelOuterStudent.add(cbMaths);
//        panelOuterStudent.add(cbGames);       
//        panelOuterStudent.add(cbCompsci);       
//        panelOuterStudent.add(cbMedia);           
//        panelOuterStudent.add(cbArt);
//        panelOuterStudent.add(cbDatabase);       
//        panelOuterStudent.add(cbSci);       
//        panelOuterStudent.add(cbEng);
//        panelOuterStudent.setBackground(Color.black);
    }
}











/*//Left panel
//        labelId.setBounds(10, 30, 80, 23);
        /*labelName.setBounds(10, 65, 80, 23);
        labelSurname.setBounds(10, 100, 80, 23);
        labelAddress.setBounds(10, 135, 80, 23);
        labelGender.setBounds(10, 170, 80, 23);
        labelMob.setBounds(10, 205, 80, 23); 
        
        //Need to set bounds for anything multicommented.
        labelMaths.setBounds(10, 240, 50, 23);
        labelGames.setBounds(10, 275, 50, 23);
        labelCompsci.setBounds(10, 310, 70, 23);
        labelMedia.setBounds(10, 345, 50, 23);
        
        labelArt.setBounds(165, 240, 50, 23);
        labelDatabase.setBounds(165, 275, 70, 23);
        labelSci.setBounds(165, 310, 50, 23);
        labelEng.setBounds(165, 345, 50, 23);
        
        txfId.setBounds(70, 30, 200, 23);
        txfName.setBounds(70, 65, 200, 23);
        txfSurname.setBounds(70, 100, 200, 23);
        txfAddress.setBounds(70, 135, 200, 23);        
        cbGender.setBounds(70, 170, 80, 23);
        txfMob.setBounds(70, 205, 200, 23); 
        
        cbMaths.setBounds(70, 240, 80, 23);
        cbGames.setBounds(70, 275, 80, 23);
        cbCompsci.setBounds(70, 310, 80, 23);
        cbMedia.setBounds(70, 345, 80, 23);   
        //On the right of ^^
        cbArt.setBounds(205, 240, 80, 23);
        cbDatabase.setBounds(205, 275, 80, 23);
        cbSci.setBounds(205, 310, 80, 23);
        cbEng.setBounds(205, 345, 80, 23);*/

//        panelOuterStudent.add(labelId);
//        panelOuterStudent.add(labelName);
//        panelOuterStudent.add(labelSurname);
//        panelOuterStudent.add(labelAddress);
//        panelOuterStudent.add(labelGender);
//        panelOuterStudent.add(labelMob);
//        panelOuterStudent.add(labelMaths);
//        panelOuterStudent.add(labelGames);
//        panelOuterStudent.add(labelCompsci);
//        panelOuterStudent.add(labelMedia);     
//        panelOuterStudent.add(labelArt);
//        panelOuterStudent.add(labelDatabase);
//        panelOuterStudent.add(labelSci);
//        panelOuterStudent.add(labelEng);

//        panelOuterStudent.add(txfId);
//        panelOuterStudent.add(txfName);
//        panelOuterStudent.add(txfSurname);
//        panelOuterStudent.add(txfAddress);       
//        panelOuterStudent.add(cbGender);       
//        panelOuterStudent.add(txfMob);   
//        panelOuterStudent.add(cbMaths);
//        panelOuterStudent.add(cbGames);       
//        panelOuterStudent.add(cbCompsci);       
//        panelOuterStudent.add(cbMedia);           
//        panelOuterStudent.add(cbArt);
//        panelOuterStudent.add(cbDatabase);       
//        panelOuterStudent.add(cbSci);       
//        panelOuterStudent.add(cbEng);
//        panelOuterStudent.setLayout(new BorderLayout());
//        panelOuterStudent.setBounds(0, 400, 300, 480);
//        panelOuterStudent.setBackground(Color.black);*/