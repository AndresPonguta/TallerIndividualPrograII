package edu.uptc.logic;

import java.time.*;
import java.util.*;

public abstract class Passenger{
	protected String idPassenger;
	protected String fistName;
	protected String lastName;
	protected String country;
	protected LocalDate dateBirthday;
	protected ArrayList<Ticket> tickets;

	public Passenger(String idPassenger, String fisrtName, String lastName, String country, LocalDate dateBirthday) {
		this.idPassenger = idPassenger;
		this.fistName = fisrtName;
		this.lastName = lastName;
		this.country = country;
		this.dateBirthday = dateBirthday;
	}

	public String getIdPassenger() {
		return idPassenger;
	}

	public void setIdPassenger(String idPassenger) {
		this.idPassenger = idPassenger;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(LocalDate dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public LocalDate age() {
		return null;
	}

	public boolean addToFly(Fly x, short y) {
		return true;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public abstract double calcOvercrowded();

	public abstract double getTicketCost();

}
