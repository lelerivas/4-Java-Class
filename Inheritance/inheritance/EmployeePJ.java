package inheritance;

public class EmployeePJ extends Employee {

	private String registration_codpj;
	private String branch;
	
	public EmployeePJ() {
		// TODO Auto-generated constructor stub
	}

	public EmployeePJ(Integer cod, String name, Double salary, String registration_codpj, String branch) {
		super(cod, name, salary);
		this.registration_codpj = registration_codpj;
		this.branch = branch;
	}

	public String getRegistration_codpj() {
		return registration_codpj;
	}

	public void setRegistration_codpj(String registration_codpj) {
		this.registration_codpj = registration_codpj;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
		
}
