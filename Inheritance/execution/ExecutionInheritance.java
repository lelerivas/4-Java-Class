package execution;
import inheritance.EmployeeCLT;
import inheritance.EmployeePJ;

public class ExecutionInheritance {

	public static void main(String[] args) {
		
		EmployeeCLT emp1 = new EmployeeCLT();
		EmployeePJ  emp2 = new EmployeePJ(111, "Trace SA", 6700.,"123456789","Technology");
		
		// inheritance methods 
		emp1.setCod(101);
		emp1.setName("Sandy");
		emp1.setSalary(4500.);
		// subclass methods
		emp1.setRegistrationcod("11111111-99");
		emp1.setGender("Female");
		
		System.out.println("Name: "+emp1.getName());
		System.out.println("Reg. Cod: "+emp1.getRegistrationcod());
		System.out.println("Salary: "+emp1.getSalary());
		System.out.println("Net Wage: "+emp1.NetWage());
		System.out.println();
		
		System.out.println("Name: "+emp2.getName());
		System.out.println("Branch: "+emp2.getBranch());
		System.out.println("Reg. Cod: "+emp2.getRegistration_codpj());
		System.out.println("Salary: "+emp2.getSalary());
		System.out.println("Net Wage: "+emp2.NetWage());
		System.out.println();
		
	}	
}
