package com.dispensa.demo.call;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.dispensa.demo.beans.response.BrandProduct;
import com.google.gson.Gson;

public class ExternalHttpCall {
	
	private static final String HTTP_GET = "GET";
	
	public BrandProduct findByBarcode(String barcode) throws IOException {

		StringBuffer urlString = new StringBuffer(ConnectionConstant.URL);
		urlString.append(ConnectionConstant.FIND_BY_BARCODE);
		
		if(barcode != null) {
			urlString.append("?").append(ConnectionConstant.BARCODE).append(barcode);
			
			URL url = new URL(urlString.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod(HTTP_GET);
	        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
			
	        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	        String current;
	        String urlStringCont = "";
	        while ((current = in.readLine()) != null) {
	            urlStringCont += current;
	        }
			
	        return new Gson().fromJson(urlStringCont,BrandProduct.class);
		}
		return new BrandProduct();
	}

}
