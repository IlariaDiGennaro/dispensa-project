package com.dispensa.demo.gui.data.service;

import java.awt.Toolkit;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class InputAndSizeFilter extends DocumentFilter {

    private int maxCharacters;    

    public InputAndSizeFilter(int maxChars) {
        maxCharacters = maxChars;
    }

    public void insertString(FilterBypass fb, int offs, String str, AttributeSet a)
            throws BadLocationException {

        if ((fb.getDocument().getLength() + str.length()) <= maxCharacters && isNumber(str))
            super.insertString(fb, offs, str, a);
        else
            Toolkit.getDefaultToolkit().beep();
    }

    private boolean isNumber(String str) {
    	try {
    		Integer.parseInt(str);
    		return true;
    	} catch (NumberFormatException e) {
    		return false;
    	}
	}

	public void replace(FilterBypass fb, int offs, int length, String str, AttributeSet a)
            throws BadLocationException {

        if ((fb.getDocument().getLength() + str.length() - length) <= maxCharacters && isNumber(str))
            super.replace(fb, offs, length, str, a);
        else
            Toolkit.getDefaultToolkit().beep();
    }
}