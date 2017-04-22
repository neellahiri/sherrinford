package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetType {
    @JsonProperty
    private String start;
    @JsonProperty
    private String end;
    @JsonProperty
    private String title;

    public FacetType() {
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacetType facetType = (FacetType) o;

        if (start != null ? !start.equals(facetType.start) : facetType.start != null) return false;
        if (end != null ? !end.equals(facetType.end) : facetType.end != null) return false;
        return title != null ? title.equals(facetType.title) : facetType.title == null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FacetType{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
