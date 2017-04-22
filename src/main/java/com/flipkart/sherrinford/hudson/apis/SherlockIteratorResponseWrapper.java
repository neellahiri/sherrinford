package com.flipkart.sherrinford.hudson.apis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.v1.SherlockIteratorResponse;

import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */

public class SherlockIteratorResponseWrapper {
    @JsonProperty("REQUEST")
    private Map<String, Object> request;
    @JsonProperty("STATUS")
    private Map<String, Integer> status;
    @JsonProperty("RESPONSE")
    private SherlockIteratorResponse sherlockSearchResponse;

    public SherlockIteratorResponseWrapper() {
    }

    public Map<String, Object> getRequest() {
        return request;
    }

    public void setRequest(Map<String, Object> request) {
        this.request = request;
    }

    public Map<String, Integer> getStatus() {
        return status;
    }

    public void setStatus(Map<String, Integer> status) {
        this.status = status;
    }

    public SherlockIteratorResponse getSherlockSearchResponse() {
        return sherlockSearchResponse;
    }

    public void setSherlockSearchResponse(SherlockIteratorResponse sherlockSearchResponse) {
        this.sherlockSearchResponse = sherlockSearchResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SherlockIteratorResponseWrapper that = (SherlockIteratorResponseWrapper) o;

        if (request != null ? !request.equals(that.request) : that.request != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return sherlockSearchResponse != null ? sherlockSearchResponse.equals(that.sherlockSearchResponse) : that.sherlockSearchResponse == null;
    }

    @Override
    public int hashCode() {
        int result = request != null ? request.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sherlockSearchResponse != null ? sherlockSearchResponse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SherlockIteratorResponseWrapper{" +
                "request=" + request +
                ", status=" + status +
                ", sherlockSearchResponse=" + sherlockSearchResponse +
                '}';
    }
}
