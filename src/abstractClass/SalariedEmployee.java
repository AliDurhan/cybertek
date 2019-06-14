package abstractClass;

public class SalariedEmployee extends Employee{
	
	int monthlySalary;
	int annualSalary;

	public SalariedEmployee(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public int calculateAnnualSalary() {
		
		// TODO Auto-generated method stub
		
		annualSalary = monthlySalary*12;
		
		return annualSalary;
	}
	



}
