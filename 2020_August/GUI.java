import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 19.08.2020
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JButton anzeigenBtn = new JButton();
  private JList schuelerList = new JList();
    private DefaultListModel schuelerListModel = new DefaultListModel();
    private JScrollPane schuelerListScrollPane = new JScrollPane(schuelerList);
  private JTextField nameTextField = new JTextField();
  private JButton addBtn = new JButton();
  private JTextField klasseTextField = new JTextField();
  
  private Verwaltung verw;
  private JTextField indexTextField = new JTextField();
  private JLabel lName = new JLabel();
  private JLabel lKlasse = new JLabel();
  private JLabel lIndex = new JLabel();
  private JTextField alterTextField = new JTextField();
  private JLabel lAlter = new JLabel();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 344; 
    int frameHeight = 298;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Hauptprogramm");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    anzeigenBtn.setBounds(-7, 208, 159, 49);
    anzeigenBtn.setText("Schüler anzeigen");
    anzeigenBtn.setMargin(new Insets(2, 2, 2, 2));
    anzeigenBtn.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        anzeigenBtn_ActionPerformed(evt);
      }
    });
    cp.add(anzeigenBtn);
    schuelerList.setModel(schuelerListModel);
    schuelerListScrollPane.setBounds(0, 0, 153, 209);
    schuelerList.addListSelectionListener(new ListSelectionListener() {
      @Override
      public void valueChanged(ListSelectionEvent event) {
          if (!event.getValueIsAdjusting()) {
            JList source = (JList)event.getSource();
            String selected = source.getSelectedValue().toString();
            update_textfields();
          }
        }
    });
    schuelerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    cp.add(schuelerListScrollPane);
    nameTextField.setBounds(160, 32, 161, 25);
    nameTextField.setText("Max Mustermann");
    nameTextField.setToolTipText("Name des Schülers");
    cp.add(nameTextField);
    addBtn.setBounds(160, 208, 161, 49);
    addBtn.setText("Schüler hinzufügen");
    addBtn.setMargin(new Insets(2, 2, 2, 2));
    addBtn.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addBtn_ActionPerformed(evt);
      }
    });
    cp.add(addBtn);
    klasseTextField.setBounds(208, 64, 33, 25);
    klasseTextField.setText("Q2.2");
    klasseTextField.setToolTipText("Klasse des Schülers");
    cp.add(klasseTextField);
    indexTextField.setBounds(208, 112, 33, 25);
    indexTextField.setText("99");
    indexTextField.setToolTipText("Index des Schülers");
    cp.add(indexTextField);
    lName.setBounds(160, 8, 110, 20);
    lName.setText("Name:");
    cp.add(lName);
    lKlasse.setBounds(160, 64, 46, 20);
    lKlasse.setText("Klasse:");
    cp.add(lKlasse);
    lIndex.setBounds(160, 112, 46, 20);
    lIndex.setText("Index:");
    cp.add(lIndex);
    alterTextField.setBounds(208, 88, 33, 25);
    alterTextField.setToolTipText("Alter des Schülers");
    alterTextField.setText("18");
    cp.add(alterTextField);
    lAlter.setBounds(160, 88, 49, 19);
    lAlter.setText("Alter:");
    cp.add(lAlter);
    // Ende Komponenten
    
    verw = new Verwaltung();
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void anzeigenBtn_ActionPerformed(ActionEvent evt) {
    update_textfields();
  } // end of anzeigenBtn_ActionPerformed

  public void addBtn_ActionPerformed(ActionEvent evt) {
    String name = nameTextField.getText();
    String klasse = klasseTextField.getText();
    int alter = Integer.parseInt(alterTextField.getText());
    int index = Integer.parseInt(indexTextField.getText())-1;
    if(name == "" || klasse == "" || index >= 30 || index < 0 ) {
      System.out.println("ERROR");
    } else {
      verw.setSchueler(index, name, alter, klasse);
    } // end of if-else
    update_list();
    
  } // end of addBtn_ActionPerformed
  
  public void update_list() {
    String[] schueler_strings = new String[30];
    for(int i = 0; i < verw.getAnzahlSchueler(); i++) {
      if(verw.getSchueler(i) != null) {
        schueler_strings[i] = verw.getSchueler(i).asString();
      } else {
        schueler_strings[i] = " ";
      } // end of if-else
    }
    schuelerList.setListData(schueler_strings);
  }
  public void update_textfields(){
    int index = schuelerList.getSelectedIndex();
    String name = verw.getSchueler(index).getName();
    String klasse = verw.getSchueler(index).getKlasse();
    int alter = verw.getSchueler(index).getAlter();
    nameTextField.setText(name);
    klasseTextField.setText(klasse);
    alterTextField.setText(""+alter);
    indexTextField.setText("" + (index+1));
  }

  // Ende Methoden
} // end of class GUI

