package com.example.elasticsearch.repository;

import com.example.elasticsearch.model.CompensationDataESOne;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompensationDataRepository extends ElasticsearchRepository<CompensationDataESOne, String> {

}
