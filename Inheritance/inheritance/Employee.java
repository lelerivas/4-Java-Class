package inheritance;

public class Employee {

	private Integer cod;
	private String name;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer cod, String name, Double salary) {
		super();
		this.cod = cod;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double NetWage(){
		return this.salary;
	}
	
}
