package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularFacetVal {
    @JsonProperty
    private String title;
    @JsonProperty("value-probability")
    private double valueProbability;

    public PopularFacetVal() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getValueProbability() {
        return valueProbability;
    }

    public void setValueProbability(double valueProbability) {
        this.valueProbability = valueProbability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PopularFacetVal that = (PopularFacetVal) o;

        if (Double.compare(that.valueProbability, valueProbability) != 0) return false;
        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(valueProbability);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "PopularFacetVal{" +
                "title='" + title + '\'' +
                ", valueProbability=" + valueProbability +
                '}';
    }
}
