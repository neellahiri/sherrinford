package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SortOption {
    @JsonProperty
    private String title;
    @JsonProperty
    private Resource resource;

    public SortOption() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SortOption that = (SortOption) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return resource != null ? resource.equals(that.resource) : that.resource == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SortOption{" +
                "title='" + title + '\'' +
                ", resource=" + resource +
                '}';
    }
}
