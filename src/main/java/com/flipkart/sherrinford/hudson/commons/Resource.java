package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {
    @JsonProperty
    private boolean selected;
    @JsonProperty
    private String params;
    @JsonProperty
    private String uri;

    public Resource() {
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resource resource = (Resource) o;

        if (selected != resource.selected) return false;
        if (params != null ? !params.equals(resource.params) : resource.params != null) return false;
        return uri != null ? uri.equals(resource.uri) : resource.uri == null;
    }

    @Override
    public int hashCode() {
        int result = (selected ? 1 : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "selected=" + selected +
                ", params='" + params + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
