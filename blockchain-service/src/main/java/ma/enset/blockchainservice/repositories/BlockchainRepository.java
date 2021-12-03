package ma.enset.blockchainservice.repositories;

import ma.enset.blockchainservice.entities.Blockchain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface BlockchainRepository extends JpaRepository<Blockchain,String> {
}
