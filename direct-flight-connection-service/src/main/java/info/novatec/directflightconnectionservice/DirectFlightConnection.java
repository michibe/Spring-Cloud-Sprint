package info.novatec.directflightconnectionservice;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;

public class DirectFlightConnection {
	@Id
	private final String id;
	@CreatedDate
	private final Instant instantOfCreation;
	private final String airline;
	private final String departureAirport;
	private final String arrivalAirport;
	private final Instant departureTime;
	private final Instant arrivalTime;

	@SuppressWarnings("unused")
	private DirectFlightConnection() {
		this.id = null;
		this.instantOfCreation = null;
		this.airline = null;
		this.departureAirport = null;
		this.arrivalAirport = null;
		this.departureTime = null;
		this.arrivalTime = null;
	}

	public DirectFlightConnection(String airline, String from, String to, Instant departureTime, Instant arrivalTime) {
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

	public Instant getInstantOfCreation() {
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

	public Instant getDepartureTime() {
		return departureTime;
	}

	public Instant getArrivalTime() {
		return arrivalTime;
	}

}
