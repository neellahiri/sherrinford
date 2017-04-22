package com.flipkart.sherrinford.hudson.v0;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.FacetValue;

import java.util.List;
import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facet {
    @JsonProperty
    private String title;
    @JsonProperty
    private String id;
    @JsonProperty
    private Map<String,Object> metadata;
    @JsonProperty
    private List<FacetValue> values;

    public Facet() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public List<FacetValue> getValues() {
        return values;
    }

    public void setValues(List<FacetValue> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facet facet = (Facet) o;

        if (title != null ? !title.equals(facet.title) : facet.title != null) return false;
        if (id != null ? !id.equals(facet.id) : facet.id != null) return false;
        if (metadata != null ? !metadata.equals(facet.metadata) : facet.metadata != null) return false;
        return values != null ? values.equals(facet.values) : facet.values == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (values != null ? values.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Facet{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", metadata=" + metadata +
                ", values=" + values +
                '}';
    }
}
