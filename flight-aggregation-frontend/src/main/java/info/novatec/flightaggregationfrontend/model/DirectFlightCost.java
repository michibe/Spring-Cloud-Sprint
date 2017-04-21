package info.novatec.flightaggregationfrontend.model;

import java.io.Serializable;
import java.util.Date;

public class DirectFlightCost implements Serializable {

	private static final long serialVersionUID = 1L;

	private final Long id;
	private final Date instantOfCreation;
	private final String airline;
	private final String departureAirport;
	private final String arrivalAirport;
	private final String cost;

	@SuppressWarnings("unused")
	private DirectFlightCost() {
		this.id = null;
		this.instantOfCreation = null;
		this.airline = null;
		this.departureAirport = null;
		this.arrivalAirport = null;
		this.cost = null;
	}

	public DirectFlightCost(String airline, String from, String to, String cost) {
		super();
		this.id = null;
		this.instantOfCreation = null;
		this.airline = airline;
		this.departureAirport = from;
		this.arrivalAirport = to;
		this.cost = cost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
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

	public String getCost() {
		return cost;
	}

	public String getCompositeKey() {
		return this.airline + ":" + this.departureAirport + " -> " + this.arrivalAirport;
	}

}
