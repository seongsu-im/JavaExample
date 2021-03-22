package example0302.Employee;

import java.util.Scanner;

public class EmployeeEx {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		
		Employee[] employee = new Employee[3]; 
		
		for(int i =0; i<employee.length; i++) {
			
			int id = scan.nextInt();
			String name = scan.next();
			int salary = scan.nextInt();
			
			Employee emp = new Employee(id,name,salary);
			
			employee[i] = emp;
		}
		
		
	System.out.println(employee[0].toString());	
	System.out.println(employee[1].toString());	
	System.out.println(employee[2].toString());	
		

	
//		Employee emp = new  Employee(scan.nextInt(),scan.next(),scan.nextInt());
//		Employee emp1 = new Employee(scan.nextInt(),scan.next(),scan.nextInt());
//		Employee emp2 = new Employee(scan.nextInt(),scan.next(),scan.nextInt());
//		
//		System.out.println(emp.toString());
//		System.out.println(emp1.toString());
//		System.out.println(emp2.toString());
//		
	}

}
