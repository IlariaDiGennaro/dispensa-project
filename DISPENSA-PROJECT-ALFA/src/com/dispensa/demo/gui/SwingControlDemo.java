package com.dispensa.demo.gui;

import java.awt.*;
import java.awt.event.*;

import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.*;
 
public class SwingControlDemo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JPanel statusLabel;
   private JPanel controlPanel;
   
   public SwingControlDemo(){
      prepareGUI();
   }
   
   public static void main(String[] args){
      SwingControlDemo  swingControlDemo = new SwingControlDemo();      
      swingControlDemo.showTextFieldDemo();
   }
   
   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing Examples");
      mainFrame.setSize(1000,1000);
//      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.setLayout(new FlowLayout());
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JPanel();  
//      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new GridLayout(5,2));

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      
      mainFrame.setVisible(true);  
   }
   
   private void showTextFieldDemo(){
      headerLabel.setText("Control in action: JTextField"); 

      JLabel barcodelabel 	= new JLabel("BARCODE: ", JLabel.CENTER);
      JLabel marcalabel 	= new JLabel("MARCA: ", JLabel.CENTER);
      JLabel nomelabel 		= new JLabel("NOME: ", JLabel.CENTER);
      JLabel scadenzalabel 	= new JLabel("SCADENZA: ", JLabel.CENTER); //TODO da rivedere
      JLabel quantitalabel 	= new JLabel("QUANTITA': ", JLabel.CENTER);//TODO da rivedere
      
    
      
      final JTextField barcodeText	= new JTextField(13);
      final JTextField marcaText 	= new JTextField(50);
      final JTextField nomeText 	= new JTextField(50);
      final JTextField scadenzaText = new JTextField(50);
      final JTextField quantitaText = new JTextField(50);
      
//      JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
//      final JPasswordField passwordText = new JPasswordField(6);      

      JButton finishButton = new JButton("IN DISPENSA !");
//      loginButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {     
//            String data = "Username " + userText.getText();
//            data += ", Password: " + new String(passwordText.getPassword()); 
//            statusLabel.setText(data);        
//         }
//      });
      
      controlPanel.add(barcodelabel);
      controlPanel.add(barcodeText);
      controlPanel.add(marcalabel);
      controlPanel.add(marcaText);
      controlPanel.add(nomelabel);
      controlPanel.add(nomeText);
      controlPanel.add(scadenzalabel);
      controlPanel.add(scadenzaText);
      controlPanel.add(quantitalabel);
      controlPanel.add(quantitaText);
      
//      controlPanel.add(barcodeText);
//      controlPanel.add(marcaText);
//      controlPanel.add(nomeText);
//      controlPanel.add(scadenzaText);
//      controlPanel.add(quantitaText);
      
      statusLabel.add(finishButton);
      
      mainFrame.setVisible(true);  
      
      barcodeText.requestFocusInWindow();
   }
}
