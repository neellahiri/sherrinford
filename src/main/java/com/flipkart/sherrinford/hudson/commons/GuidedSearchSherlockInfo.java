package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.Store;
import com.flipkart.sherrinford.hudson.v0.Facet;

import java.util.List;
import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GuidedSearchSherlockInfo {
    @JsonProperty("store-path")
    private List<Store> storePath;
    @JsonProperty
    private List<Facet> facets;
    @JsonProperty
    private String query;
    @JsonProperty
    private String title;
    @JsonProperty
    private Map<String,Object> params;

    public GuidedSearchSherlockInfo() {
    }

    public List<Store> getStorePath() {
        return storePath;
    }

    public void setStorePath(List<Store> storePath) {
        this.storePath = storePath;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuidedSearchSherlockInfo that = (GuidedSearchSherlockInfo) o;

        if (storePath != null ? !storePath.equals(that.storePath) : that.storePath != null) return false;
        if (facets != null ? !facets.equals(that.facets) : that.facets != null) return false;
        if (query != null ? !query.equals(that.query) : that.query != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return params != null ? params.equals(that.params) : that.params == null;
    }

    @Override
    public int hashCode() {
        int result = storePath != null ? storePath.hashCode() : 0;
        result = 31 * result + (facets != null ? facets.hashCode() : 0);
        result = 31 * result + (query != null ? query.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GuidedSearchSherlockInfo{" +
                "storePath=" + storePath +
                ", facets=" + facets +
                ", query='" + query + '\'' +
                ", title='" + title + '\'' +
                ", params=" + params +
                '}';
    }
}
