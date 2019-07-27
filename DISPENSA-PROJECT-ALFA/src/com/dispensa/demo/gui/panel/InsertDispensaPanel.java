package com.dispensa.demo.gui.panel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;

import com.dispensa.demo.gui.constant.GuiConstant;
import com.dispensa.demo.gui.data.service.SizeFilter;

public class InsertDispensaPanel extends JPanel {
	
	private static final long serialVersionUID = 3558981725817442091L;
	
	JPanel panel = null;
	GridBagLayout layout = null;
	BorderLayout externalLayout = null;
	
	JTextField barcode = null;
	JTextField marca = null;
	JTextField nome = null;
	JTextField textFieldDAY = null;
	JTextField textFieldMONTH = null;
	JTextField textFieldYEAR = null;
	JTextField quantita = null;
	
	boolean editable = false;

	public InsertDispensaPanel() {
		externalLayout = new BorderLayout();
		setLayout(externalLayout);
		
		layout = new GridBagLayout();
		panel = new JPanel(layout);
		
		GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        
		initLayout(gbc);
		
		add(panel);
		
		
		JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));    
        buttons.add(new JButton("Save"));
        add(buttons, BorderLayout.SOUTH);
		
	}

	private void initLayout(GridBagConstraints gridBagConstraints) {
		gridBagConstraints.insets = new Insets(8, 8, 8, 8);
		gridBagConstraints.anchor = GridBagConstraints.CENTER;
		
		// BARCODE section start
		panel.add(createJLabel(GuiConstant.LABEL_BARCODE), gridBagConstraints);
		gridBagConstraints.gridx++;
		barcode = new JTextField(GuiConstant.TEXT_FIELD_SIZE_20);
		barcode.setFont(GuiConstant.FONT_GUI);
		panel.add(barcode, gridBagConstraints);
		((AbstractDocument)barcode.getDocument()).setDocumentFilter(new SizeFilter(13));
		barcode.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				editable = false;
				marca.setEditable(editable);
				nome.setEditable(editable);
				textFieldDAY.setEditable(editable);
				textFieldMONTH.setEditable(editable);
				textFieldYEAR.setEditable(editable);
				quantita.setEditable(editable);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				
				if(barcode.getText().length() == 13) {
					System.out.println("STO CERCANDO");
					
					if((barcode.getText().equalsIgnoreCase("1234567890123"))){
						editable = false;
						marca.setEditable(editable);
						nome.setEditable(editable);
					}else {
						editable = true;
						marca.setEditable(editable);
						nome.setEditable(editable);
					}
					
					editable = true;
					textFieldDAY.setEditable(editable);
					textFieldMONTH.setEditable(editable);
					textFieldYEAR.setEditable(editable);
					quantita.setEditable(editable);
				}
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {}
		});
		// BARCODE section end
		
		
		//MARCA
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy++;
        panel.add(createJLabel(GuiConstant.LABEL_MARCA), gridBagConstraints);
        gridBagConstraints.gridx++;
        marca = new JTextField(GuiConstant.TEXT_FIELD_SIZE_20);
		marca.setFont(GuiConstant.FONT_GUI);
		marca.setEditable(editable);
		panel.add(marca, gridBagConstraints);
		
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy++;
        panel.add(createJLabel(GuiConstant.LABEL_NOME), gridBagConstraints);
        gridBagConstraints.gridx++;
        nome = new JTextField(GuiConstant.TEXT_FIELD_SIZE_20);
        nome.setFont(GuiConstant.FONT_GUI);
        nome.setEditable(editable);
		panel.add(nome, gridBagConstraints);
		
		gridBagConstraints.gridx=0;
        gridBagConstraints.gridy++;
        
        panel.add(createJLabel("SCADENZA : "), gridBagConstraints);
        gridBagConstraints.gridx++;
        
        GridBagLayout scadenzaLayout = new GridBagLayout();
        JPanel scadenzaPanel = new JPanel(scadenzaLayout);
        GridBagConstraints scadenzaGBC = new GridBagConstraints();
        scadenzaGBC.gridx=0;
        scadenzaGBC.gridy=0;
        scadenzaGBC.insets = new Insets(8, 8, 8, 8);
        scadenzaGBC.anchor = GridBagConstraints.CENTER;
        
	        textFieldDAY = new JTextField(2);
	        textFieldDAY.setFont(GuiConstant.FONT_GUI);
	        textFieldDAY.setEditable(editable);
	        
	        scadenzaPanel.add(textFieldDAY, scadenzaGBC);
	        scadenzaGBC.gridx++;
	        scadenzaPanel.add(createJLabel("/"), scadenzaGBC);
	        scadenzaGBC.gridx++;
	        textFieldMONTH = new JTextField(2);
	        textFieldMONTH.setFont(GuiConstant.FONT_GUI);
	        textFieldMONTH.setEditable(editable);
	        scadenzaPanel.add(textFieldMONTH, scadenzaGBC);
	        scadenzaGBC.gridx++;
	        scadenzaPanel.add(createJLabel("/"), scadenzaGBC);
	        scadenzaGBC.gridx++;
	        textFieldYEAR = new JTextField(4);
	        textFieldYEAR.setFont(GuiConstant.FONT_GUI);
	        textFieldYEAR.setEditable(editable);
	        scadenzaPanel.add(textFieldYEAR, scadenzaGBC);
	        
	    panel.add(scadenzaPanel, gridBagConstraints);
        
	    
	    //	QUANTITA' 
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy++;
        panel.add(createJLabel(GuiConstant.LABEL_QUANTITA), gridBagConstraints);
        gridBagConstraints.gridx++;
        quantita = new JTextField(20);
        quantita.setFont(GuiConstant.FONT_GUI);
        quantita.setEditable(editable);
		panel.add(quantita, gridBagConstraints);
			
        add(panel);
//        externalLayout.
	}
	
	private JLabel createJLabel(String labelName) {
    	JLabel label = new JLabel(labelName);
        label.setFont(GuiConstant.FONT_GUI);
        return label;
    }

}
