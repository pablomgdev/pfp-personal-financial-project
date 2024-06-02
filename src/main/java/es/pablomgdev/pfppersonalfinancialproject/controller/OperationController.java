package es.pablomgdev.pfppersonalfinancialproject.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.pablomgdev.pfppersonalfinancialproject.dto.GetOperationsFilter;
import es.pablomgdev.pfppersonalfinancialproject.model.Operation;
import es.pablomgdev.pfppersonalfinancialproject.service.OperationService;

@RestController
@RequestMapping("/api/operations")
public class OperationController {
    @Autowired
    private OperationService operationService;

    @PostMapping
    public ResponseEntity<Operation> createOperation(@RequestBody Operation operation) {
        Operation createdOperation = operationService.createOperation(operation);
        return new ResponseEntity<>(createdOperation, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOperation(@PathVariable UUID id) {
        operationService.deleteOperation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Operation>> getAllOperations(GetOperationsFilter request) {
        // todo: get request data
        List<Operation> operations = operationService.getAllOperations();
        return new ResponseEntity<>(operations, HttpStatus.OK);
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Operation> getOperationById(@PathVariable UUID id) {
    //     Optional<Operation> operation = operationService.getOperationById(id);
    //     if (operation.isPresent()) {
    //         return new ResponseEntity<>(operation.get(), HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    // }
}
