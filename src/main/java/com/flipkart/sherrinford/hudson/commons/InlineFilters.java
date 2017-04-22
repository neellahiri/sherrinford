package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.v1.Facet;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InlineFilters {
    @JsonProperty
    private List<Facet> facets;
    @JsonProperty
    private int position;

    public InlineFilters() {
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InlineFilters that = (InlineFilters) o;

        if (position != that.position) return false;
        return facets != null ? facets.equals(that.facets) : that.facets == null;
    }

    @Override
    public int hashCode() {
        int result = facets != null ? facets.hashCode() : 0;
        result = 31 * result + position;
        return result;
    }

    @Override
    public String toString() {
        return "InlineFilters{" +
                "facets=" + facets +
                ", position=" + position +
                '}';
    }
}
