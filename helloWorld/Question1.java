package helloWorld;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * This program will read the data from text file and output the result as per req.
 */


public class Question1 {

	public static void main(String[] args) {
		
		String word = "";
		String meaning= "";
		
		
	try {	
		FileReader file = new FileReader("C:/users/Sanjay/Desktop/testme/testme2.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = "";

		
		while ((line = reader.readLine()) != null)  {
			
			String tmp[] = line.split("-");
	
			word = tmp[0];
			
			meaning = tmp[1];
								
			System.out.println(word);
								
			String tmp2 = meaning;
					
			String mean[] = tmp2.split(",");
			
			for (String val:mean)
				
				System.out.println(val);
						
			
		}
		file.close();
		reader.close();
		
		
	} catch (Exception e) {
		System.out.print("cound not find file");
	}
		
	
			
		} //main close

	}//class close




		
		
		

	


