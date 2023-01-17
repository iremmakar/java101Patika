package maasHesapla;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name,double salary,int workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	
	

	public double tax() {
		double vergi;
		vergi=this.salary*0.03;
		return vergi;
		
	}
	
	public double bonus() {
		int h =this.workHours - 40;
		int bonus = h*30;
		return bonus;
	}
	
	public double raiseSalary() {
		int fark = 2021 - this.hireYear;
		double artıs;
		if(fark<10) {
			artıs=this.salary*0.05;
			
		}else if(fark>9 && fark<20) {
			artıs=this.salary*0.10;
		}else {
			artıs=this.salary*0.15;
		}
		return artıs;
	}
	
	public void tooString() {
		System.out.println("Adı : "+this.name);
		System.out.println("Maaşı : "+this.salary);
		System.out.println("Çalışma saati : "+this.workHours);
		System.out.println("Vergi : "+this.tax());
		System.out.println("Bonus : "+this.bonus());
		System.out.println("Maasş artışı : "+this.raiseSalary());
		double vergiBonus = this.bonus()-this.tax()+this.salary;
		System.out.println("Vergi ve bonuslar ile birlikte maaş : "+vergiBonus);
		double kalan = this.bonus()+this.raiseSalary()-this.tax();
		double son = this.salary + kalan;
		System.out.println("Toplam Maaş : "+son);
		
	}

}
