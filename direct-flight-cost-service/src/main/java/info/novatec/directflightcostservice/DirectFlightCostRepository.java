package info.novatec.directflightcostservice;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "directFlightCosts", path = "direct-flight-costs")
public interface DirectFlightCostRepository extends JpaRepository<DirectFlightCost, Long> {

	Collection<DirectFlightCost> findByAirline(@Param("airline") String airline);

	DirectFlightCost findByAirlineAndDepartureAirportAndArrivalAirport(@Param("airline") String airline,
			@Param("departureAirport") String departureAirport, @Param("arrivalAirport") String arrivalAirport);
}
