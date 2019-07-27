package com.dispensa.demo.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

@Deprecated
public class DispensaMainDemo {
	
	public DispensaMainDemo() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        public TestPane() {

            setLayout(new BorderLayout());

            JPanel content = new JPanel(new GridBagLayout());
            
//            JLabel label = new JLabel("BARCODE : ");
//            label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 20));
            
            JTextField textField = new JTextField(20);
//            textField.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 20));
            // draw label border to verify the new label size
//            label.setBorder(new LineBorder(Color.BLACK));
            // change label size
//            label.setPreferredSize(new Dimension(200, 200));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(8, 8, 8, 8);
            gbc.anchor = GridBagConstraints.EAST;
            
            content.add(createJLabel("BARCODE"), gbc);
            gbc.gridy++;
            content.add(createJLabel("MARCA"), gbc);
            gbc.gridy++;
            content.add(createJLabel("NOME"), gbc);
            gbc.gridy++;
            content.add(createJLabel("SCADENZA"), gbc);
            gbc.gridy++;
            content.add(createJLabel("QUANTITA'"), gbc);
//            gbc.gridy++;
            

            gbc.anchor = GridBagConstraints.WEST;
            gbc.gridy = 0;
            gbc.gridx++;
            gbc.gridwidth = GridBagConstraints.REMAINDER;

            content.add(createJTextField(20), gbc);
            gbc.gridy++;
            content.add(createJTextField(20), gbc);
            gbc.gridy++;
            content.add(createJTextField(20), gbc);
            gbc.gridy++;
            content.add(createJTextField(20), gbc);
            gbc.gridy++;
            content.add(createJTextField(20), gbc);

            JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));    
            buttons.add(new JButton("Save"));
//            buttons.add(new JButton("Close"));

            add(content);
            add(buttons, BorderLayout.SOUTH);
        }            
    }
    
    private JLabel createJLabel(String labelName) {
    	JLabel label = new JLabel(labelName);
        label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 20));
        return label;
    }
    
    private JTextField createJTextField(Integer length) {
    	JTextField textField = new JTextField(20);
    	textField.setFont(new Font(textField.getFont().getName(), textField.getFont().getStyle(), 20));
    	
    	textField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
				cercaOnDB();
			}
			
			private void cercaOnDB() {
				System.out.println("sto cercando : "+textField.getText());
				
			}
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				// TODO Auto-generated method stub
			}
		});
    	
//    	textField.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String barcode = textField.getText();
//				System.out.println("sto cercando : "+barcode);
//				System.out.println("size : "+barcode.length());
//			}
//		});
    	return textField;
    }
	
    public static void main(String[] args) {
        new DispensaMainDemo();
    }
}
