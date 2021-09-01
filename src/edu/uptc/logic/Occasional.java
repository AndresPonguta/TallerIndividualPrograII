package edu.uptc.logic;

import java.time.*;

public class Occasional extends Passenger{
	private LocalDate dateLastFly;

	public Occasional(String idPassenger, String fisrtName, String lastName, String country, LocalDate dateBirthday,
			LocalDate dateLastFly) {
		super(idPassenger, fisrtName, lastName, country, dateBirthday);
		this.dateLastFly = dateLastFly;
	}

	public LocalDate getDateLastFly() {
		return dateLastFly;
	}

	public void setDateLastFly(LocalDate dateLastFly) {
		this.dateLastFly = dateLastFly;
	}

	@Override
	public double getTicketCost() {

		return 0;
	}

	@Override
	public double calcOvercrowded() {
		// TODO Auto-generated method stub
		return 0;
	}

}
