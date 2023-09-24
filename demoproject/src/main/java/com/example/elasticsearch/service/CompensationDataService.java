package com.example.elasticsearch.service;

import com.example.elasticsearch.model.CompensationDataESOne;
import java.util.List;
public interface CompensationDataService {
    List<CompensationDataESOne> getAll();

    CompensationDataESOne add(CompensationDataESOne compensationData);

    CompensationDataESOne getById(String id);

    CompensationDataESOne update(CompensationDataESOne book, String id);

    void deleteById(String id);
}
