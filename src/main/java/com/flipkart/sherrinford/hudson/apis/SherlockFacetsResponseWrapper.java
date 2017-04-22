package com.flipkart.sherrinford.hudson.apis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.v0.SherlockFacetsResponse;
import com.flipkart.sherrinford.hudson.v1.SherlockFilterResponse;

import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SherlockFacetsResponseWrapper {
    @JsonProperty("REQUEST")
    private Map<String, Object> request;
    @JsonProperty("STATUS")
    private Map<String, Integer> status;
    @JsonProperty("RESPONSE")
    private SherlockFacetsResponse sherlockFacetsResponse;

    public SherlockFacetsResponseWrapper() {
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

    public SherlockFacetsResponse getSherlockFacetsResponse() {
        return sherlockFacetsResponse;
    }

    public void setSherlockFacetsResponse(SherlockFacetsResponse sherlockFacetsResponse) {
        this.sherlockFacetsResponse = sherlockFacetsResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SherlockFacetsResponseWrapper that = (SherlockFacetsResponseWrapper) o;

        if (request != null ? !request.equals(that.request) : that.request != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return sherlockFacetsResponse != null ? sherlockFacetsResponse.equals(that.sherlockFacetsResponse) : that.sherlockFacetsResponse == null;
    }

    @Override
    public int hashCode() {
        int result = request != null ? request.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sherlockFacetsResponse != null ? sherlockFacetsResponse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SherlockFacetsResponseWrapper{" +
                "request=" + request +
                ", status=" + status +
                ", sherlockFacetsResponse=" + sherlockFacetsResponse +
                '}';
    }
}
