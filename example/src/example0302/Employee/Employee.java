package example0302.Employee;

public class Employee {


	private int id;
	private String name;
	private int salary;


	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}




	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}


	
	public int getSalary() {
		return salary;
	}
					//연봉
	public int getAnnualSalary() {
		
		return salary*12;
		
	}

	public int raiseSalray(int percent) {
		
		return salary/100*id*10;
		
	}



	@Override
	public String toString() {
		return String.format("Employee[id=%d, name=%s, salary = %d]의 연봉은 %d 월급 인상분은 %d", id,name,salary,getAnnualSalary(),raiseSalray(id));
	}
	
	

}
