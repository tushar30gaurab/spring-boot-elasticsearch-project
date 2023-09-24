package com.example.elasticsearch.controller;

import com.example.elasticsearch.model.CompensationDataESOne;
import com.example.elasticsearch.service.CompensationDataService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api")
@Slf4j
public class CompensationDataController {

    private final CompensationDataService compensationDataService;

    public CompensationDataController(CompensationDataService compensationDataService) {
        this.compensationDataService = compensationDataService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CompensationDataESOne>> getAll() {
        return ResponseEntity.ok().body(compensationDataService.getAll());
    }

    @PostMapping("/schema_for_compensation_data_1")
    @ResponseStatus(HttpStatus.CREATED)
    public CompensationDataESOne addCompensationData(@RequestBody @Valid CompensationDataESOne compensationData) {
        return compensationDataService.add(compensationData);

    }

    @DeleteMapping("/schema_for_compensation_data_1/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<?> deleteBookById(@PathVariable String id){
        compensationDataService.deleteById(id);

        return ResponseEntity.ok().body("Done");
    }

    @GetMapping("/schema_for_compensation_data_1/{id}")
    public ResponseEntity<CompensationDataESOne> getBookById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(compensationDataService.getById(id));
    }


    @PutMapping("/schema_for_compensation_data_1/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CompensationDataESOne> updateBook(@RequestBody CompensationDataESOne book, @PathVariable String id) {
        var updatedBook =  compensationDataService.update(book, id);
        return ResponseEntity.ok().body(updatedBook);

    }
}
