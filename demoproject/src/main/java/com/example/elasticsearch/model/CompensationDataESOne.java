package com.example.elasticsearch.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "schema_for_compensation_data_1")
public class CompensationDataESOne {
    @Id
    private String timestamp;

    @Field(type = FieldType.Text, name = "age")
    private String age;

    @Field(type = FieldType.Text, name = "industry")
    private String industry;

    @Field(type = FieldType.Text, name = "job_title")
    private String jobTitle;

    @Field(type = FieldType.Text, name = "annual_salary")
    private String annualSalary;

    @Field(type = FieldType.Text, name = "currency")
    private String currency;

    @Field(type = FieldType.Text, name = "location")
    private String location;

    @Field(type = FieldType.Text, name = "work_experience")
    private String workExperience;

    @Field(type = FieldType.Text, name = "job_context")
    private String jobContext;

    @Field(type = FieldType.Text, name = "other_currency")
    private String otherCurrency;

    // Getters and setters

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getJobContext() {
        return jobContext;
    }

    public void setJobContext(String jobContext) {
        this.jobContext = jobContext;
    }

    public String getOtherCurrency() {
        return otherCurrency;
    }

    public void setOtherCurrency(String otherCurrency) {
        this.otherCurrency = otherCurrency;
    }




}
