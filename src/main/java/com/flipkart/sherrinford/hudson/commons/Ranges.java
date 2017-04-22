package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ranges {
    @JsonProperty
    private FacetType facetType;
    @JsonProperty
    private SelectedRange selectedRange;
    @JsonProperty
    private List<RangeValue> values;
    @JsonProperty
    private List<Integer> histogramValues;
    @JsonProperty
    private Resource resource;

    public Ranges() {
    }

    public FacetType getFacetType() {
        return facetType;
    }

    public void setFacetType(FacetType facetType) {
        this.facetType = facetType;
    }

    public SelectedRange getSelectedRange() {
        return selectedRange;
    }

    public void setSelectedRange(SelectedRange selectedRange) {
        this.selectedRange = selectedRange;
    }

    public List<RangeValue> getValues() {
        return values;
    }

    public void setValues(List<RangeValue> values) {
        this.values = values;
    }

    public List<Integer> getHistogramValues() {
        return histogramValues;
    }

    public void setHistogramValues(List<Integer> histogramValues) {
        this.histogramValues = histogramValues;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ranges ranges = (Ranges) o;

        if (facetType != null ? !facetType.equals(ranges.facetType) : ranges.facetType != null) return false;
        if (selectedRange != null ? !selectedRange.equals(ranges.selectedRange) : ranges.selectedRange != null)
            return false;
        if (values != null ? !values.equals(ranges.values) : ranges.values != null) return false;
        if (histogramValues != null ? !histogramValues.equals(ranges.histogramValues) : ranges.histogramValues != null)
            return false;
        return resource != null ? resource.equals(ranges.resource) : ranges.resource == null;
    }

    @Override
    public int hashCode() {
        int result = facetType != null ? facetType.hashCode() : 0;
        result = 31 * result + (selectedRange != null ? selectedRange.hashCode() : 0);
        result = 31 * result + (values != null ? values.hashCode() : 0);
        result = 31 * result + (histogramValues != null ? histogramValues.hashCode() : 0);
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ranges{" +
                "facetType=" + facetType +
                ", selectedRange=" + selectedRange +
                ", values=" + values +
                ", histogramValues=" + histogramValues +
                ", resource=" + resource +
                '}';
    }
}
