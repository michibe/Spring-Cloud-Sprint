package info.novatec.flightaggregationfrontend.model;

import java.util.Date;

public class UiAggregatedFlight {

	private final String airline;
	private final String departureAirport;
	private final String arrivalAirport;
	private final Date departureTime;
	private final Date arrivalTime;
	private final String cost;

	public UiAggregatedFlight(String airline, String departureAirport, String arrivalAirport, Date departureTime,
			Date arrivalTime, String cost) {
		super();
		this.airline = airline;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.cost = cost;
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

	public String getCost() {
		return cost;
	}
}
