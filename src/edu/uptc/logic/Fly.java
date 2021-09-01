package edu.uptc.logic;

import edu.uptc.exceptions.*;
import java.time.*;
import java.util.*;

public class Fly {
	private String number;
	private LocalDate date;
	private LocalTime time;
	private Airplane airplane;
	private Target target;
	private ArrayList<Ticket> tickets;

	public Fly(String number, LocalDate date, LocalTime time, Airplane airplane, Target target) {
		this.number = number;
		this.date = date;
		this.time = time;
		this.airplane = airplane;
		this.target = target;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public boolean addPassenger(ArrayList<Passenger> passengers, short chairNumber) {

		return true;
	}

	public boolean addPassenger(Passenger x, short y, float n) {
		return true;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public double calcTotal() {
		return 0;
	}

	public Passenger getLessAge() {
		return null;
	}

	public Passenger getGreaterAge() {
		return null;
	}

}
