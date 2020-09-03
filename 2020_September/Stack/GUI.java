import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03.09.2020
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JLabel lObersteRechnung = new JLabel();
  private JButton topBtn = new JButton();
  private JButton popBtn = new JButton();
  private JNumberField sumNumberField = new JNumberField();
  private JButton bRechnungaufdenStapellegen = new JButton();
  private JLabel sumLabel = new JLabel();
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
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
    
    lObersteRechnung.setBounds(8, 24, 113, 17);
    lObersteRechnung.setText("Oberste Rechnung: ");
    cp.add(lObersteRechnung);
    topBtn.setBounds(0, 56, 185, 33);
    topBtn.setText("Oberste Rechnung ausgeben");
    topBtn.setMargin(new Insets(2, 2, 2, 2));
    topBtn.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        topBtn_ActionPerformed(evt);
      }
    });
    cp.add(topBtn);
    popBtn.setBounds(8, 88, 201, 41);
    popBtn.setText("Oberste Rechnung entfernen");
    popBtn.setMargin(new Insets(2, 2, 2, 2));
    popBtn.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        popBtn_ActionPerformed(evt);
      }
    });
    cp.add(popBtn);
    sumNumberField.setBounds(8, 136, 81, 33);
    sumNumberField.setText("");
    cp.add(sumNumberField);
    bRechnungaufdenStapellegen.setBounds(88, 136, 195, 33);
    bRechnungaufdenStapellegen.setText("Rechnung auf den Stapel legen");
    bRechnungaufdenStapellegen.setMargin(new Insets(2, 2, 2, 2));
    bRechnungaufdenStapellegen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRechnungaufdenStapellegen_ActionPerformed(evt);
      }
    });
    cp.add(bRechnungaufdenStapellegen);
    sumLabel.setBounds(120, 24, 110, 20);
    sumLabel.setText("999.99");
    cp.add(sumLabel);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void topBtn_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of topBtn_ActionPerformed

  public void popBtn_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of popBtn_ActionPerformed

  public void bRechnungaufdenStapellegen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bRechnungaufdenStapellegen_ActionPerformed

  // Ende Methoden
} // end of class GUI

