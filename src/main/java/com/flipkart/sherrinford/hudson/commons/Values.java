package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.FacetValue;
import com.flipkart.sherrinford.hudson.commons.FacetType;
import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Values {
    @JsonProperty
    private String title;
    @JsonProperty
    private FacetType type;
    @JsonProperty
    private List<FacetValue> values;
    @JsonProperty
    private String id;

    public Values() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FacetType getType() {
        return type;
    }

    public void setType(FacetType type) {
        this.type = type;
    }

    public List<FacetValue> getValues() {
        return values;
    }

    public void setValues(List<FacetValue> values) {
        this.values = values;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Values values1 = (Values) o;

        if (title != null ? !title.equals(values1.title) : values1.title != null) return false;
        if (type != null ? !type.equals(values1.type) : values1.type != null) return false;
        if (values != null ? !values.equals(values1.values) : values1.values != null) return false;
        return id != null ? id.equals(values1.id) : values1.id == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (values != null ? values.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Values{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", values=" + values +
                ", id='" + id + '\'' +
                '}';
    }
}
