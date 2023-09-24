package com.example.elasticsearch.service.impl;

import com.example.elasticsearch.model.CompensationDataESOne;
import com.example.elasticsearch.repository.CompensationDataRepository;
import com.example.elasticsearch.service.CompensationDataService;
import com.example.elasticsearch.exception.DataNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

@Slf4j
@Service
public class CompensationDataServiceImpl implements CompensationDataService {

    private final CompensationDataRepository repository;

    public CompensationDataServiceImpl(CompensationDataRepository repository){

        this.repository = repository;
    }

    @Override
    public List<CompensationDataESOne> getAll() {
        return StreamSupport.stream(
                        Spliterators.spliteratorUnknownSize(repository.findAll().iterator(), 0), false)
                .toList();
    }

    @Override
    public CompensationDataESOne add(CompensationDataESOne compensationData) {
        log.info("addCompensationData : {} " , compensationData );
        return repository.save(compensationData);
    }

    @Override
    public CompensationDataESOne getById(String id) {
        return repository.findById(id).orElseThrow(() -> new DataNotFoundException("Book id not found"));
    }

    @Override
    public CompensationDataESOne update(CompensationDataESOne compensationData, String id) {
        repository.findById(id)
                .ifPresentOrElse(compensationData1 -> {
                    compensationData1.setAge(compensationData.getAge());
                    compensationData1.setIndustry(compensationData.getIndustry());
                    compensationData1.setJobTitle(compensationData.getJobTitle());
                    compensationData1.setAnnualSalary(compensationData.getAnnualSalary());
                    compensationData1.setCurrency(compensationData.getCurrency());
                    compensationData1.setLocation(compensationData.getLocation());
                    compensationData1.setWorkExperience(compensationData.getWorkExperience());
                    compensationData1.setJobContext(compensationData.getJobContext());
                    compensationData1.setOtherCurrency(compensationData.getOtherCurrency());
                    repository.save(compensationData1);
                },() -> {throw new DataNotFoundException("Compensation Data id not found");});

        return compensationData;
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
