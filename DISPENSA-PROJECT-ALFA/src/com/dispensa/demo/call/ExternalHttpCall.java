package com.dispensa.demo.call;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ExternalHttpCall {
	
//	public String retrieveHttpGetExt(String endPointUrl, Map<String, String> headerParams) throws UnsupportedEncodingException {
//		
//		CloseableHttpClient httpClient = this.generateHttpClient(httpPoolingClientConnectionManager, httpConnectTimeout, httpConnectionRequestTimeout, httpConnectionSocketTimeout);
//		HttpGet httpGet = new HttpGet(endPointUrl);		
//		this.attachHeaders(headerParams, httpGet);
//		return executeHttpCall(httpClient, httpGet, HttpStatus.SC_OK, HttpStatus.SC_ACCEPTED);
//	}
//	
//	protected String executeHttpCall(CloseableHttpClient httpClient, HttpUriRequest request, int ... acceptedStatusCodes)
//	{
//		HttpEntity responseEntity = null;
//		int httpStatusCode = -1;		
//		LOG.debug("gonna call {}", request.getURI().toASCIIString());
//		try (					
//				CloseableHttpResponse httpResponse = httpClient.execute(request);
//			) 
//		{	LOG.info("httpResponse.getStatusLine()={}", httpResponse.getStatusLine());
//			httpStatusCode = httpResponse.getStatusLine().getStatusCode();
//			System.out.println("http status code : " + httpStatusCode);
////			responseObj.setHttpStatusCode(httpStatusCode);
//			HashMap<String, String> headersMap = getHeadersMap(httpResponse);
//			responseObj.setHeaders(headersMap);
//			
//			String responseString = null;
//			if (ArrayUtils.contains(acceptedStatusCodes, httpResponse.getStatusLine().getStatusCode())) {
//								
//				responseEntity = httpResponse.getEntity();
//				if(responseEntity!=null) {
//					responseString = EntityUtils.toString(responseEntity, StandardCharsets.UTF_8);
//					if((responseString != null) && (responseString.length() >= LOG_MAX_LENGTH)) {
//						LOG.debug("RESPONSE [{}]", responseString.substring(0, LOG_MAX_LENGTH - 1) + "...<CUT>");
//					} else {
//						LOG.debug("RESPONSE [{}]", responseString);
//					}
//				    EntityUtils.consume(responseEntity);
//				}	
//			} else {
//				LOG.error("STATUS CODE [{}] RESPONSE [{}]", httpResponse.getStatusLine().getStatusCode(),httpResponse.toString());
//
//				responseEntity = httpResponse.getEntity();
//				if(responseEntity!=null) {
//					responseString = EntityUtils.toString(responseEntity, StandardCharsets.UTF_8);
//					if((responseString != null) && (responseString.length() >= LOG_MAX_LENGTH)) {
//						LOG.debug("ERROR RESPONSE [{}]", responseString.substring(0, LOG_MAX_LENGTH - 1) + "...<CUT>");
//					} else {
//						LOG.debug("ERROR RESPONSE [{}]", responseString);
//					}
//				    EntityUtils.consume(responseEntity);
//				}	
//			}
//			responseObj.setResponse(responseString);
//			if((responseString != null) && (responseString.length() >= LOG_MAX_LENGTH)) {
//				LOG.info("gonna return HTTP STATUS={} - response={}", httpStatusCode, responseString.substring(0, LOG_MAX_LENGTH - 1) + "...<CUT>");
//			} else {
//				LOG.info("gonna return HTTP STATUS={} - response={}", httpStatusCode, responseString);
//			}
//		}
//		catch (ClientProtocolException e) {
//			LOG.error("ClientProtocolException : {}", e.getMessage());		
//		} 
//		catch (IOException e) {
//			LOG.error("IOException : {}", e.getMessage());
//		}
//		
//		
//		return responseObj;
//	}
//	
//	private void attachHeaders(Map<String, String> headerParams, HttpUriRequest request)
//	{
//		if(headerParams != null) {
//			for (HashMap.Entry<String, String> entry : headerParams.entrySet()) {
//			    String key = entry.getKey();
//			    String value = entry.getValue();
//			    request.setHeader(key, value);
//			}
//		}		
//	}
//	
//	public static String encodePath(String val) {
//		String encVal = val;
//	    try {
//	    	encVal = new URI(null, encVal, null).toURL().toString();
//	    } catch (Exception e) {
//	        System.out.println("Error encoding path " + e.getMessage());
//	    }
//	    return encVal;
//	} 
	
//	private static void call() throws IOException {
		
		
//		String endPointUrl = MessageFormat.format("https://www.ean-search.org/?q={0}", "8020458000300");
//		endPointUrl = encodePath(endPointUrl);
//		
//		HashMap<String, String> headerParams = new HashMap<String, String>();	
//		headerParams.put("User-Agent", " Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.142 Mobile Safari/537.36");
//		
//		String resposne = retrieveHttpGetExt(endPointUrl, headerParams);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String urlStringCont = "";
//		
//        URL url = new URL("https://www.ean-search.org/?q=8020458000300");
//        URLConnection urlConnection = url.openConnection();
//        HttpURLConnection connection = null;
//        connection = (HttpURLConnection) urlConnection;
//        connection.setRequestMethod("GET");
//        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
//		
//		
//     // we can check response code (200 OK is expected)
//        System.out.println(connection.getResponseCode() + " " + connection.getResponseMessage());
//        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String current;
//
//        while ((current = in.readLine()) != null) {
//            urlStringCont += current;
//        }
//		
//        System.out.println(urlStringCont);
		
		
		
		
		
//		
//		
//		
//		
//		
//		String urlString = "https://www.ean-search.org/?q=8020458000300";
//		
//		URL url = new URL(urlString);
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.setRequestMethod("GET");
//		con.setRequestProperty("User-Agent", "Mozilla/5.0");
//		
////		con.setDoOutput(true);
////		DataOutputStream out = new DataOutputStream(con.getOutputStream());
////		out.writeBytes("?q=8020458000300");
////		out.flush();
//		
//		con.setConnectTimeout(5000);
//		con.setReadTimeout(5000);
//		
//		int status = con.getResponseCode();
//		
//		BufferedReader in = new BufferedReader(  new InputStreamReader(con.getInputStream()) );
//		String inputLine;
//		StringBuffer content = new StringBuffer();
//		while ((inputLine = in.readLine()) != null) {
//		  content.append(inputLine);
//		}
//		
//		System.out.println(content);
//		
//		in.close();
//		con.disconnect();
//	}

//	private final String USER_AGENT = "Mozilla/5.0";

//	public static void main(String[] args) throws Exception {

//		ExternalHttpCall http = new ExternalHttpCall();
//
//		System.out.println("Testing 1 - Send Http GET request");
//		http.sendGet();
		
//		Scanner input = new Scanner(System.in);
//		String s = input.nextLine();
//		System.out.println("Ho letto: " + s);
		
//	}

	
	
	
	
	
	
	// HTTP GET request
//	private void sendGet() throws Exception {
//
//		String url = "https://www.ean-search.org/q=8020458000300";
//		
//		URL obj = new URL(url);
//		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//
//		// optional default is GET
//		con.setRequestMethod("GET");
//
//		//add request header
//		con.setRequestProperty("User-Agent", USER_AGENT);
//
//		int responseCode = con.getResponseCode();
//		System.out.println("\nSending 'GET' request to URL : " + url);
//		System.out.println("Response Code : " + responseCode);
//
//		BufferedReader in = new BufferedReader(
//		        new InputStreamReader(con.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		in.close();
//
//		//print result
//		System.out.println(response.toString());
//
//	}
}
