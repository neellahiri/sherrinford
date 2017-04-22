package com.flipkart.sherrinford.hudson.apis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.v1.SherlockFilterResponse;

import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SherlockFilterResponseWrapper {
    @JsonProperty("REQUEST")
    private Map<String, Object> request;
    @JsonProperty("STATUS")
    private Map<String, Integer> status;
    @JsonProperty("RESPONSE")
    private SherlockFilterResponse sherlockFilterResponse;

    public SherlockFilterResponseWrapper() {
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

    public SherlockFilterResponse getSherlockFilterResponse() {
        return sherlockFilterResponse;
    }

    public void setSherlockFilterResponse(SherlockFilterResponse sherlockFilterResponse) {
        this.sherlockFilterResponse = sherlockFilterResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SherlockFilterResponseWrapper that = (SherlockFilterResponseWrapper) o;

        if (request != null ? !request.equals(that.request) : that.request != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return sherlockFilterResponse != null ? sherlockFilterResponse.equals(that.sherlockFilterResponse) : that.sherlockFilterResponse == null;
    }

    @Override
    public int hashCode() {
        int result = request != null ? request.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sherlockFilterResponse != null ? sherlockFilterResponse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SherlockFilterResponseWrapper{" +
                "request=" + request +
                ", status=" + status +
                ", sherlockFilterResponse=" + sherlockFilterResponse +
                '}';
    }
}
