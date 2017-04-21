package info.novatec.directflightcostservice;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "direct_flight_costs", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "airline", "departureAirport", "arrivalAirport" }) })
public class DirectFlightCost {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private final Long id;

	@CreatedDate
	private final Instant instantOfCreation;
	private final String airline;
	private final String departureAirport;
	private final String arrivalAirport;
	private final Integer cost;

	@SuppressWarnings("unused")
	private DirectFlightCost() {
		this.id = null;
		this.instantOfCreation = null;
		this.airline = null;
		this.departureAirport = null;
		this.arrivalAirport = null;
		this.cost = null;
	}

	public DirectFlightCost(String airline, String from, String to, Integer cost) {
		super();
		this.id = null;
		this.instantOfCreation = null;
		this.airline = airline;
		this.departureAirport = from;
		this.arrivalAirport = to;
		this.cost = cost;
	}

	public Long getId() {
		return id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public Integer getCost() {
		return cost;
	}

}
