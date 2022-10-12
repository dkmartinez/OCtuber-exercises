package oops_concepts;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(); 
		Employee emp2 = new Employee();
		
		emp1.employeeId ="123";
		emp1.employeeName = "Maria";
		emp1.employeeSalary = 2345;
		
		System.out.println(emp1.employeeBonus(emp1.employeeSalary));
		
		emp2.employeeName = "Jose";
		emp2.employeeId = "234";
		emp2.employeeSalary = 25;
		
		System.out.println(emp2.employeeBonus(emp2.employeeSalary));
		
		

	}

}
