package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularFacet {
    @JsonProperty("facet-probability")
    private double facetProbability;
    @JsonProperty
    private String id;
    @JsonProperty
    private List<PopularFacetVal> values;

    public PopularFacet() {
    }

    public double getFacetProbability() {
        return facetProbability;
    }

    public void setFacetProbability(double facetProbability) {
        this.facetProbability = facetProbability;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PopularFacetVal> getValues() {
        return values;
    }

    public void setValues(List<PopularFacetVal> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PopularFacet that = (PopularFacet) o;

        if (Double.compare(that.facetProbability, facetProbability) != 0) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return values != null ? values.equals(that.values) : that.values == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(facetProbability);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (values != null ? values.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PopularFacet{" +
                "facetProbability=" + facetProbability +
                ", id='" + id + '\'' +
                ", values=" + values +
                '}';
    }
}
