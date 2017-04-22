package com.flipkart.sherrinford.hudson.apis;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.PopularFacet;

import java.util.List;
import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularFacetResponseWrapper {
    @JsonProperty("REQUEST")
    private Map<String, Object> request;
    @JsonProperty("STATUS")
    private Map<String, Integer> status;
    @JsonProperty("RESPONSE")
    private List<PopularFacet> popularFacetList;

    public PopularFacetResponseWrapper() {
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

    public List<PopularFacet> getPopularFacetList() {
        return popularFacetList;
    }

    public void setPopularFacetList(List<PopularFacet> popularFacetList) {
        this.popularFacetList = popularFacetList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PopularFacetResponseWrapper that = (PopularFacetResponseWrapper) o;

        if (request != null ? !request.equals(that.request) : that.request != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        return popularFacetList != null ? popularFacetList.equals(that.popularFacetList) : that.popularFacetList == null;
    }

    @Override
    public int hashCode() {
        int result = request != null ? request.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (popularFacetList != null ? popularFacetList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PopularFacetResponseWrapper{" +
                "request=" + request +
                ", status=" + status +
                ", popularFacetList=" + popularFacetList +
                '}';
    }
}
