package justin.speedread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TxtReader implements Reader{

	public ArrayList<String> readFile(File file) {
		ArrayList<String> storyArray = new ArrayList<String>();
		
		
		FileReader fileReader = null; 
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			String currentLine;
			while ((currentLine = bufferedReader.readLine()) != null){
				
				System.out.println(currentLine);
				//storyArray = (ArrayList<String>) Arrays.asList(currentLine.split("\\s*,\\s*"));
				//delimiter defined as: zero or more whitespace, a literal comma, zero or more whitespace
				
			}
			
		} catch (IOException e) {
			e.printStackTrace(); //TODO what is stack trace
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				if (fileReader != null)
					fileReader.close();
				
			} catch (IOException ex) {
				ex.printStackTrace(); //TODO what is ex
			}
		}
		
		
		return storyArray;
	}
	
	
	

}
