package abstractClass;

public class HourlyEmployee extends Employee {
	
	
	int hourlyRate;
	int workedHours;
	int annualSalary;
	
	public HourlyEmployee(int id, String name, int hourlyRate, int workedHours) {
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
	}

	@Override
	public int calculateAnnualSalary() {
		// TODO Auto-generated method stub
		
		annualSalary = hourlyRate * workedHours;
		
		return annualSalary;
	}
	
	
	
	

}
