package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Classification {
    @JsonProperty
    private String queryType;
    @JsonProperty
    private List<String> queryFields;
    @JsonProperty
    private List<String> superCategoryType;
    @JsonProperty
    private Map<String,Object> superCategoryTypeDistribution;

    public Classification() {
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public List<String> getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(List<String> queryFields) {
        this.queryFields = queryFields;
    }

    public List<String> getSuperCategoryType() {
        return superCategoryType;
    }

    public void setSuperCategoryType(List<String> superCategoryType) {
        this.superCategoryType = superCategoryType;
    }

    public Map<String, Object> getSuperCategoryTypeDistribution() {
        return superCategoryTypeDistribution;
    }

    public void setSuperCategoryTypeDistribution(Map<String, Object> superCategoryTypeDistribution) {
        this.superCategoryTypeDistribution = superCategoryTypeDistribution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classification that = (Classification) o;

        if (queryType != null ? !queryType.equals(that.queryType) : that.queryType != null) return false;
        if (queryFields != null ? !queryFields.equals(that.queryFields) : that.queryFields != null) return false;
        if (superCategoryType != null ? !superCategoryType.equals(that.superCategoryType) : that.superCategoryType != null)
            return false;
        return superCategoryTypeDistribution != null ? superCategoryTypeDistribution.equals(that.superCategoryTypeDistribution) : that.superCategoryTypeDistribution == null;
    }

    @Override
    public int hashCode() {
        int result = queryType != null ? queryType.hashCode() : 0;
        result = 31 * result + (queryFields != null ? queryFields.hashCode() : 0);
        result = 31 * result + (superCategoryType != null ? superCategoryType.hashCode() : 0);
        result = 31 * result + (superCategoryTypeDistribution != null ? superCategoryTypeDistribution.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "queryType='" + queryType + '\'' +
                ", queryFields=" + queryFields +
                ", superCategoryType=" + superCategoryType +
                ", superCategoryTypeDistribution=" + superCategoryTypeDistribution +
                '}';
    }
}
