package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Store {
    @JsonProperty
    private String id;
    @JsonProperty("categories")
    private List<String> categoryNodeIds;
    @JsonProperty
    private String title;
    @JsonProperty
    private Products products;
    @JsonProperty
    private Map<String, Object> metadata;
    @JsonProperty
    private Resource resource = new Resource();
    @JsonProperty
    private double probability;
    @JsonProperty("canonical-title")
    private String canonicalTitle;

    public Store() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCategoryNodeIds() {
        return categoryNodeIds;
    }

    public void setCategoryNodeIds(List<String> categoryNodeIds) {
        this.categoryNodeIds = categoryNodeIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public String getCanonicalTitle() {
        return canonicalTitle;
    }

    public void setCanonicalTitle(String canonicalTitle) {
        this.canonicalTitle = canonicalTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Store store = (Store) o;

        if (Double.compare(store.probability, probability) != 0) return false;
        if (id != null ? !id.equals(store.id) : store.id != null) return false;
        if (categoryNodeIds != null ? !categoryNodeIds.equals(store.categoryNodeIds) : store.categoryNodeIds != null)
            return false;
        if (title != null ? !title.equals(store.title) : store.title != null) return false;
        if (products != null ? !products.equals(store.products) : store.products != null) return false;
        if (metadata != null ? !metadata.equals(store.metadata) : store.metadata != null) return false;
        if (resource != null ? !resource.equals(store.resource) : store.resource != null) return false;
        return canonicalTitle != null ? canonicalTitle.equals(store.canonicalTitle) : store.canonicalTitle == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (categoryNodeIds != null ? categoryNodeIds.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        temp = Double.doubleToLongBits(probability);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (canonicalTitle != null ? canonicalTitle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id='" + id + '\'' +
                ", categoryNodeIds=" + categoryNodeIds +
                ", title='" + title + '\'' +
                ", products=" + products +
                ", metadata=" + metadata +
                ", resource=" + resource +
                ", probability=" + probability +
                ", canonicalTitle='" + canonicalTitle + '\'' +
                '}';
    }
}
