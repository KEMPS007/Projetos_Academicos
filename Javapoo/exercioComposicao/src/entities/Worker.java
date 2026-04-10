package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departmant departmant;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departmant departmant) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departmant = departmant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departmant getDepartmant() {
		return departmant;
	}

	public void setDepartmant(Departmant departmant) {
		this.departmant = departmant;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		for (HourContract c : contracts) {
			if (year == c.getDate().getYear() && month == c.getDate().getMonthValue()) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

}
