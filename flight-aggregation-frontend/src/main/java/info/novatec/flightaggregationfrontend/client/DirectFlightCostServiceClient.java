package info.novatec.flightaggregationfrontend.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import info.novatec.flightaggregationfrontend.model.DirectFlightCost;

@FeignClient(name = "direct-flight-cost-service", fallback = DirectFlightCostServiceClientFallback.class)
public interface DirectFlightCostServiceClient {
	@RequestMapping(value = "/direct-flight-costs/search/findByAirlineAndDepartureAirportAndArrivalAirport", method = RequestMethod.GET)
	Resource<DirectFlightCost> findByAirlineAndDepartureAirportAndArrivalAirport(
			@RequestParam(value = "airline") String airline,
			@RequestParam(value = "departureAirport") String departureAirport,
			@RequestParam(value = "arrivalAirport") String arrivalAirport);
}
