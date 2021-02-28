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
	    	
	    	f.writeToFile(filename, data, isAppend);
	    	isAppend = true;
	    	data = " This is a test 2";
	    	f.writeToFile(filename, data, isAppend);
	    	filename = "testFile3.txt.";
	    	
	    	f.readToFile(filename);
	    }
	}
	 
}
