package Practice3;

public interface IFileFunction {
	
	void writeToFile(String filename, String data, boolean append);
	void readToFile(String filename);
}
