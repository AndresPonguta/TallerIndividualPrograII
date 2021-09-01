package edu.uptc.logic;

public class Ticket {
	private short chairNumber;
	private boolean baggage;
	private float weight;
	private Fly fly;
	private Passenger passenger;

	public Ticket(short chairNumber, boolean baggage, float weight, Fly fly, Passenger passenger) {
		this.chairNumber = chairNumber;
		this.baggage = baggage;
		this.weight = weight;
		this.fly = fly;
		this.passenger = passenger;
	}

	public Ticket(short chairNumber, boolean baggage, Fly fly, Passenger passenger) {
		this.chairNumber = chairNumber;
		this.baggage = baggage;
		this.fly = fly;
		this.passenger = passenger;
	}

	public short getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(short chairNumber) {
		this.chairNumber = chairNumber;
	}

	public boolean isBaggage() {
		return baggage;
	}

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Fly getFly() {
		return fly;
	}

	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

}
