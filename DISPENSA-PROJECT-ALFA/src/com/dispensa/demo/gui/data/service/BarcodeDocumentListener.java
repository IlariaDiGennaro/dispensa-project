package com.dispensa.demo.gui.data.service;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

@Deprecated
public class BarcodeDocumentListener implements DocumentListener {

	JTextField barcode;
	boolean editable = false;
	
	public BarcodeDocumentListener(JTextField barcode) {
		this.barcode = barcode;
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		if(barcode.getText().length() == 13) {
			System.out.println("STO CERCANDO");
			
			if((barcode.getText().equalsIgnoreCase("1234567890123"))){
				editable = false;
			}else {
				editable = true;
			}
			
		}

	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
	}

	public boolean nowEditable() {
		return editable;
	}
}
