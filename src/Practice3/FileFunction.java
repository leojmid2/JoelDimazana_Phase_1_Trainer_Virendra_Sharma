package Practice3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileFunction implements IFileFunction {

	@Override
	public void writeToFile(String filename, String data, boolean isAppend) {
		
        File file = new File(filename);
        
        if (file.exists() && !isAppend) {
        	file.delete();
        }
        
	    FileWriter writer = null;
	    BufferedWriter bw = null;
	    
	    try
	    {
	    	if (isAppend) {
	    		writer = new FileWriter (file, true);
		    	bw = new BufferedWriter(writer);
	    		bw.write(data);
	    		System.out.println("Data Succefully Appended");
	    	}
	    	else 
	    	{
	    	 	writer = new FileWriter(file);
		    	bw = new BufferedWriter(writer);
	    		bw.write(data);
	    		System.out.println("Data Succefully Written");
	    	}	
	    }
	    catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
	    finally
	    {
	    	try
	        {
	    		bw.close();
	            writer.close();
	        } 
	        catch (IOException e) 
	        {
	        	e.printStackTrace();
	        }
	    }
	}



	@Override
	public void readToFile(String filename) {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		BufferedReader reader = null;
		String line = null;
		
		File file = new File(filename);
		
	    if (file.exists()) {
			try {
				
				fr = new FileReader(file);
				reader = new BufferedReader(fr);
				line = reader.readLine();
				while (line != null) 
				{
					System.out.println(line);
					line = reader.readLine(); //to determine the next line is null
				}
			}	
			catch (IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					reader.close();
				    fr.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
	    }
	    else {
	    	System.out.println(filename + " File doesn't exist");
	    }
			

	}
	

}
