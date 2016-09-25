package inheritance;

public class EmployeeCLT extends Employee {
	
	private String registrationcod;
	private String gender;
	
	public EmployeeCLT() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeCLT(Integer cod, String name, Double salary, String registrationcod, String gender) {
		super(cod, name, salary);
		this.registrationcod = registrationcod;
		this.gender = gender;
	}

	public String getRegistrationcod() {
		return registrationcod;
	}

	public void setRegistrationcod(String registrationcod) {
		this.registrationcod = registrationcod;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public Double NetWage() {
		return getSalary()*0.97;
	}
		
}
