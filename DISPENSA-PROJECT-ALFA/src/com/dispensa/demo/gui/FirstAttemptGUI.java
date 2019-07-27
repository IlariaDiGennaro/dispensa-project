package com.dispensa.demo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.dispensa.demo.gui.panel.InsertDispensaPanel;

public class FirstAttemptGUI {
	
	JFrame frame = new JFrame("DISPENSA");
	JPanel panel = null;
	
	public FirstAttemptGUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
            	try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) { 
					//do nothing
				}

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                
                frame.add(new InsertDispensaPanel());
                
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
	
	
	
	public static void main(String[] args) {
		new FirstAttemptGUI();
	}

}
