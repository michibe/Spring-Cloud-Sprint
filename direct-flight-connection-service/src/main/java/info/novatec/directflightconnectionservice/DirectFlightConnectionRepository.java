package info.novatec.directflightconnectionservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "directFlightConnections", path = "direct-flight-connections")
interface DirectFlightConnectionRepository extends MongoRepository<DirectFlightConnection, String> {
}
