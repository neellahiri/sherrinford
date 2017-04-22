package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag {
    @JsonProperty
    private Map<String, Object> metadata;
    @JsonProperty
    private int count;
    @JsonProperty
    private String title;
    @JsonProperty
    private Resource resource;

    public Tag() {
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

        Tag tag = (Tag) o;

        if (count != tag.count) return false;
        if (metadata != null ? !metadata.equals(tag.metadata) : tag.metadata != null) return false;
        if (title != null ? !title.equals(tag.title) : tag.title != null) return false;
        return resource != null ? resource.equals(tag.resource) : tag.resource == null;
    }

    @Override
    public int hashCode() {
        int result = metadata != null ? metadata.hashCode() : 0;
        result = 31 * result + count;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "metadata=" + metadata +
                ", count=" + count +
                ", title='" + title + '\'' +
                ", resource=" + resource +
                '}';
    }
}
