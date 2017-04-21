package info.novatec.flightaggregationfrontend.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import info.novatec.flightaggregationfrontend.model.DirectFlightCost;

@Component
public class DirectFlightCostServiceClientFallback implements DirectFlightCostServiceClient {

	private final static String PLACEHOLDER_NOT_AVAILABLE = "not available";

	private final Map<String, String> directFlightCostHistory = new HashMap<String, String>();

	@Override
	public Resource<DirectFlightCost> findByAirlineAndDepartureAirportAndArrivalAirport(
			@RequestParam(value = "airline") String airline,
			@RequestParam(value = "departureAirport") String departureAirport,
			@RequestParam(value = "arrivalAirport") String arrivalAirport) {

		String costFallback = Optional
				.ofNullable(directFlightCostHistory.get(airline + ":" + departureAirport + " -> " + arrivalAirport))
				.orElse(PLACEHOLDER_NOT_AVAILABLE);

		return new Resource<DirectFlightCost>(
				new DirectFlightCost(airline, departureAirport, arrivalAirport, costFallback));
	}

	public DirectFlightCostServiceClientFallback addDirectFlightCost(DirectFlightCost directFlightCost) {
		if (!directFlightCost.getCost().equals(PLACEHOLDER_NOT_AVAILABLE)) {
			this.directFlightCostHistory.put(directFlightCost.getAirline() + ":"
					+ directFlightCost.getDepartureAirport() + " -> " + directFlightCost.getArrivalAirport(),
					"~ " + directFlightCost.getCost().replace("~", ""));
		}
		return this;
	}
}