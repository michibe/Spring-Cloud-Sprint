package info.novatec.flightaggregationfrontend.model;

import java.util.Date;

public class DirectFlightConnection {

	private final String id;
	private final Date instantOfCreation;
	private final String airline;
	private final String departureAirport;
	private final String arrivalAirport;
	private final Date departureTime;
	private final Date arrivalTime;

	@SuppressWarnings("unused")
	private DirectFlightConnection() {
		super();
		this.id = null;
		this.instantOfCreation = null;
		this.airline = null;
		this.departureAirport = null;
		this.arrivalAirport = null;
		this.departureTime = null;
		this.arrivalTime = null;
	}

	public DirectFlightConnection(String airline, String from, String to, Date departureTime, Date arrivalTime) {
		super();
		this.id = null;
		this.instantOfCreation = null;
		this.airline = airline;
		this.departureAirport = from;
		this.arrivalAirport = to;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public String getId() {
		return id;
	}

	public Date getInstantOfCreation() {
		return instantOfCreation;
	}

	public String getAirline() {
		return airline;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

}
