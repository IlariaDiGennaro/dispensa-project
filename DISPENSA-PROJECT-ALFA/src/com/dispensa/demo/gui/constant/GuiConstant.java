package com.dispensa.demo.gui.constant;

import java.awt.Font;

public class GuiConstant {
	
	// FONT 
	public static final String FONT_NAME = "Tahoma";
	public static final int FONT_STYLE = 0;
	public static final int FONT_SIZE = 20;
	public static final Font FONT_GUI = new Font(FONT_NAME, FONT_STYLE, FONT_SIZE);
	
	// TEXT FIELD
	public static final int TEXT_FIELD_SIZE_20 = 20;
	
	// LABEL
	public static final String LABEL_BARCODE = "BARCODE :";
	public static final String LABEL_NOME = "NOME :";
	public static final String LABEL_MARCA = "MARCA :";
	public static final String LABEL_SCADENZA = "SCADENZA :";
	public static final String LABEL_QUANTITA = "QUANTITA' :";
	
	// REGEX
	public static final String REGEX_DAY = "^([0]?[1-9]|[1-2]\\d|[3][0-1])$";
	
	
}
