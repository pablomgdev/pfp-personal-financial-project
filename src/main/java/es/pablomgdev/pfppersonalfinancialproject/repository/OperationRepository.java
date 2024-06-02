package es.pablomgdev.pfppersonalfinancialproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.pablomgdev.pfppersonalfinancialproject.model.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, UUID> {
}
