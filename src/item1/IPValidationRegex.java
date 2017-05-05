package item1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	
	private static final String FILENAME = "ipAddresses.txt";
	private static final String IPADDRESS_PATTERN =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";


    
	public void validateIp(){

		BufferedReader br = null;
		FileReader fr = null;
		
		Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
		Matcher matcher;

		try {
			//read file from the same package
			br = new BufferedReader(new InputStreamReader(IPValidationRegex.class.getResourceAsStream(FILENAME), "UTF-8"));

			String sCurrentLine;
			
			System.out.println("\n***Item 1:Display Invalid IPs***\n");

			while ((sCurrentLine = br.readLine()) != null) {
				matcher = pattern.matcher(sCurrentLine);
		    	if (!matcher.matches()){
		    		System.out.println(sCurrentLine);
		    	}
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
	