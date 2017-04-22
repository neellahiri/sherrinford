package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class View {
    @JsonProperty
    private String title;
    @JsonProperty
    private Resource resource;
    @JsonProperty
    private Map<String, Object> metadata;

    public View() {
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

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        View view = (View) o;

        if (title != null ? !title.equals(view.title) : view.title != null) return false;
        if (resource != null ? !resource.equals(view.resource) : view.resource != null) return false;
        return metadata != null ? metadata.equals(view.metadata) : view.metadata == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "View{" +
                "title='" + title + '\'' +
                ", resource=" + resource +
                ", metadata=" + metadata +
                '}';
    }
}
