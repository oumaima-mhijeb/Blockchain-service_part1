package ma.enset.blockchainservice.repositories;

import ma.enset.blockchainservice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
