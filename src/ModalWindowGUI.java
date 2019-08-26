import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   Diese Klasse dient der Bereitstellung einer Schaltfläche, um über diese
   Aktion ein neues, modales Fenster (einen Dialog) zu öffnen.
   
   Es soll bewusst nicht die Möglichkeit des JOptionPane genutzt werden!
  */
public class ModalWindowGUI extends JFrame{
  
  private JButton aButton;
  
  public ModalWindowGUI(){
    super("Modales Fenster");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //
    JPanel infoPanel = new JPanel(new BorderLayout());
    JLabel info = new JLabel();
    info.setText("Über die Schaltfläche \"Open Window\" wird ein neues modales Fenster geöffnet");
    infoPanel.add(info, BorderLayout.NORTH);
    infoPanel.add(new JSeparator(), BorderLayout.SOUTH);
    getContentPane().add(infoPanel, BorderLayout.NORTH);
    //
    JPanel btnPanel = new JPanel(new BorderLayout());
    aButton= new JButton("Open Window");
    btnPanel.add(aButton, BorderLayout.EAST);
    getContentPane().add(btnPanel, BorderLayout.SOUTH);
    //
    aButton.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent ae){
               onOpenWindow();
             }
         });
    //
    pack();
    setVisible(true);
  }
  
  private void onOpenWindow(){
    //DEBUG//
    System.out.println("Button pressed");
    /* Fügen Sie hier den Code bei, der ein modales Fenster (als Dialog) öffnet.
       Das Fenster soll eine beliebige Komponente enthalten (vergl. dazu ÜbunG L1-1)
       
       Bitte beachten, dass sich das Fenster gegenüber dem Hauptfenster modal
       verhält. Modal? Sehen Sie in der Theorie nach.
    */
    //do it
    /*
     * 
    JDialog modalDialog = new JDialog();
    modalDialog.setTitle("WARNUNG!!!");
    modalDialog.setSize(200,200);
    modalDialog.setModal(true);
    modalDialog.setVisible(true);
    
     */
    ChildWindow modalChildWindow = new ChildWindow(this);
    modalChildWindow.setSize(600,200);
    modalChildWindow.setTitle("Modales Fenster");
    modalChildWindow.setModal(true);
    modalChildWindow.setVisible(true);
  }
  
  public static void main(String[] args){
    new ModalWindowGUI();
  }
}