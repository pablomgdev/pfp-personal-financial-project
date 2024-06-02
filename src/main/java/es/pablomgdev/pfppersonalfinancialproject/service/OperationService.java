package es.pablomgdev.pfppersonalfinancialproject.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pablomgdev.pfppersonalfinancialproject.model.Operation;
import es.pablomgdev.pfppersonalfinancialproject.repository.OperationRepository;

@Service
public class OperationService {
    @Autowired
    private OperationRepository operationRepository;

    public Operation createOperation(Operation operation) {
        // todo: validations or business logic if needed
        return operationRepository.save(operation);
    }

    public void deleteOperation(UUID id) {
        operationRepository.deleteById(id);
    }

    public List<Operation> getAllOperations() {
        return operationRepository.findAll();
    }

    public Optional<Operation> getOperationById(UUID id) {
        return operationRepository.findById(id);
    }
}
