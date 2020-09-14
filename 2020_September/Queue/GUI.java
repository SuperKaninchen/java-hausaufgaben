import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 10.09.2020
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JLabel nameLabel = new JLabel();
  private JButton enqueueButton = new JButton();
  private JButton dequeueButton = new JButton();
  private JTextField nameTextfield = new JTextField();
  private JTextField krankenkasseTextfield = new JTextField();
  private JLabel statusLabel = new JLabel();
  private JLabel krankenkasseLabel = new JLabel();
  // Ende Attribute
  
  private Verwaltung verw;
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 246; 
    int frameHeight = 277;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    nameLabel.setBounds(8, 8, 209, 33);
    nameLabel.setText("Name");
    cp.add(nameLabel);
    enqueueButton.setBounds(8, 88, 97, 49);
    enqueueButton.setText("Enqueue");
    enqueueButton.setMargin(new Insets(2, 2, 2, 2));
    enqueueButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        enqueueButton_ActionPerformed(evt);
      }
    });
    cp.add(enqueueButton);
    dequeueButton.setBounds(120, 88, 105, 49);
    dequeueButton.setText("Dequeue");
    dequeueButton.setMargin(new Insets(2, 2, 2, 2));
    dequeueButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        dequeueButton_ActionPerformed(evt);
      }
    });
    cp.add(dequeueButton);
    nameTextfield.setBounds(8, 144, 217, 25);
    cp.add(nameTextfield);
    krankenkasseTextfield.setBounds(8, 176, 217, 25);
    cp.add(krankenkasseTextfield);
    statusLabel.setBounds(8, 208, 217, 25);
    statusLabel.setText("Status");
    cp.add(statusLabel);
    krankenkasseLabel.setBounds(8, 48, 209, 33);
    krankenkasseLabel.setText("Krankenkasse");
    cp.add(krankenkasseLabel);
    // Ende Komponenten
    verw = new Verwaltung();
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void enqueueButton_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
	String vorname;
	String nachname;
	String krankenkasse;
    try {
      vorname = nameTextfield.getText().split(" ")[0];
      nachname = nameTextfield.getText().split(" ")[1];
      krankenkasse = krankenkasseTextfield.getText();
    } catch (Exception e) {
      updateLabels("ERROR: Wrong input!");
      return;
    }
    verw.enqueue(new Patient(vorname, nachname, krankenkasse));
    nameTextfield.setText("");
    krankenkasseTextfield.setText("");
    updateLabels("Patient added to Queue!");
  } // end of enqueueButton_ActionPerformed

  public void dequeueButton_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    verw.dequeue();
    if(verw.isEmpty())
    	updateLabels("Queue is empty!");
    else
    	updateLabels("Patient removed from Queue!");
  } // end of dequeueButton_ActionPerformed
  
  void updateLabels(String pStatus) {
    statusLabel.setText(pStatus);
    String name;
    String kasse;
    if(verw.front() == null) {
      name = "";
      kasse = "";
    } else {
      name = verw.front().getName();
      kasse = verw.front().getKrankenkasse();  
    } // end of if-else
    nameLabel.setText(name);
    krankenkasseLabel.setText(kasse);
  }
  
  // Ende Methoden
} // end of class GUI

