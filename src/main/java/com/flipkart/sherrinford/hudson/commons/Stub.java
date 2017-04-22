package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stub {
    @JsonProperty
    private String stub;
    @JsonProperty("metadata")
    private Map metaData;

    public Stub() {
    }

    public String getStub() {
        return stub;
    }

    public void setStub(String stub) {
        this.stub = stub;
    }

    public Map getMetaData() {
        return metaData;
    }

    public void setMetaData(Map metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stub stub1 = (Stub) o;

        if (stub != null ? !stub.equals(stub1.stub) : stub1.stub != null) return false;
        return metaData != null ? metaData.equals(stub1.metaData) : stub1.metaData == null;
    }

    @Override
    public int hashCode() {
        int result = stub != null ? stub.hashCode() : 0;
        result = 31 * result + (metaData != null ? metaData.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stub{" +
                "stub='" + stub + '\'' +
                ", metaData=" + metaData +
                '}';
    }
}
