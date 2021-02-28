package Practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	
	private static final String emailPattern = "(^(.+))@([a-zA-Z0-9]+)\\.(\\S+)$"; 
	private static List<Employee> employees = new ArrayList<Employee>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		boolean isAdd = true;
		String email = null;
		String response = null;
		
		Scanner s = new Scanner(System.in);
		Pattern pattern = Pattern.compile(emailPattern);
		
		
		do {
			System.out.print("Please enter employee name: ");
			employee.setName(s.next());
			
			boolean isValid = false;
			
			do {
				System.out.print("Please enter an email: ");
				email = s.next();
				//Email Validation
				Matcher matcher = pattern.matcher(email);
				
				if (matcher.matches()) {
					employee.setEmail(email);
					employees.add(employee);
					isValid=true;
					System.out.println("Employee details added");
				}	
				else {
					System.out.println("Please enter a valid email");
				}
			}while (!isValid);

			System.out.println("Do you want to add more employee? [Y/N]");

			do {
				response = s.next();
				if (response.equalsIgnoreCase("y")) {
					break;
				}
				else if (response.equalsIgnoreCase("n")){
					System.out.println("n");
					isAdd=false;
					break;
				}
				else {
					System.out.println("Please enter a valid option [Y/N]");
				}
				
			} while (true);	
		} while (isAdd);
		s.close();
		
		System.out.println("Display all employees");
		for (Employee emp:employees) {
			System.out.println("Name:" +emp.getName() + "  Email:" + emp.getEmail());
		}
	}

}
