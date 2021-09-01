package edu.uptc.logic;

import java.time.*;

public class Registered extends Passenger {
	private double miles;
	private float discount = 15;
	private LocalDate dateRegister;

	public Registered(String idPassenger, String fisrtName, String lastName, String country, LocalDate dateBirthday,
			LocalDate dateRegister) {
		super(idPassenger, fisrtName, lastName, country, dateBirthday);
		this.dateRegister = dateRegister;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public LocalDate getDateRegister() {
		return dateRegister;
	}

	public void setDateRegister(LocalDate dateRegister) {
		this.dateRegister = dateRegister;
	}

	@Override
	public double getTicketCost() {
		
		return 0;
	}

	@Override
	public double calcOvercrowded() {
		
		return 0;
	}

}
