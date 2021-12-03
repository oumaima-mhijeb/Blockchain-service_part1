package ma.enset.blockchainservice.repositories;

import ma.enset.blockchainservice.entities.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface BlockRepository extends JpaRepository<Block,String> {
}
