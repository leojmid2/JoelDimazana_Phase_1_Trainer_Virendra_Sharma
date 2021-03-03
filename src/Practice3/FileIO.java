package Practice3;

import java.io.File;

public class FileIO {

	public static void main(String[] args) {
	    {
	    	FileFunction f = new FileFunction();
	    	boolean isAppend=false;
	    	String filename = "testFile2.txt.";
	    	String data = "This is a test 1.";
	    	
	    	File file = new File(filename);
	    	System.out.println("Your current directory:" + file.getAbsolutePath());
	
	    	System.out.println("\nWriting data to file");

	    	f.writeToFile(filename, data, isAppend);

	    	System.out.println("\nAppending data to file");

	    	isAppend = true;
	    	data = " This is a test 2";
	    	f.writeToFile(filename, data, isAppend);
	    	
	    	//filename = "testFile3.txt.";
	    	
	    	
	    	System.out.println("\nReading file");
	    	f.readToFile(filename);
	    }
	}
	 
}
