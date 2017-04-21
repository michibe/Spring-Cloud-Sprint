package info.novatec.flightaggregationfrontend.client;

import java.util.Collections;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.novatec.flightaggregationfrontend.model.DirectFlightConnection;

@FeignClient(name = "direct-flight-connection-service", fallback = DirectFlightConnectionServiceClientFallback.class)
public interface DirectFlightConnectionServiceClient {
	@RequestMapping(value = "/direct-flight-connections", method = RequestMethod.GET)
	PagedResources<DirectFlightConnection> getDirectFlightConnections();
}

@Component
class DirectFlightConnectionServiceClientFallback implements DirectFlightConnectionServiceClient {

	@Override
	public PagedResources<DirectFlightConnection> getDirectFlightConnections() {
		return new PagedResources<DirectFlightConnection>(Collections.emptyList(), null);
	}
}
