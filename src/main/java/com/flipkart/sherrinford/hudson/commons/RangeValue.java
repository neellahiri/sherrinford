package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RangeValue {
    @JsonProperty
    private String key;
    @JsonProperty
    private String displayValue;

    public RangeValue() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RangeValue that = (RangeValue) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return displayValue != null ? displayValue.equals(that.displayValue) : that.displayValue == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (displayValue != null ? displayValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RangeValue{" +
                "key='" + key + '\'' +
                ", displayValue='" + displayValue + '\'' +
                '}';
    }
}
