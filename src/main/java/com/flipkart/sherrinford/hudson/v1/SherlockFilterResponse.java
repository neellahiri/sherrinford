package com.flipkart.sherrinford.hudson.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.*;
import com.flipkart.sherrinford.hudson.v1.Facet;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SherlockFilterResponse {
    private View view;
    @JsonProperty("substores")
    private List<Store> subStores;
    @JsonProperty("selectedFacets")
    private List<Facet> selectedFacets;
    @JsonProperty("store-path")
    private List<Store> storePath;
    @JsonProperty
    private Store store;
    @JsonProperty("partial-matches")
    private Object partialMatches;
    @JsonProperty
    private Products products;
    @JsonProperty
    private List<Facet> facets;
    @JsonProperty("resource-type")
    private String resourceType;
    @JsonProperty
    private List<Tag> tags;
    @JsonProperty("smart-classification")
    private List<SmartClassification> smartClassifications;

    public SherlockFilterResponse() {
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public List<Store> getSubStores() {
        return subStores;
    }

    public void setSubStores(List<Store> subStores) {
        this.subStores = subStores;
    }

    public List<Facet> getSelectedFacets() {
        return selectedFacets;
    }

    public void setSelectedFacets(List<Facet> selectedFacets) {
        this.selectedFacets = selectedFacets;
    }

    public List<Store> getStorePath() {
        return storePath;
    }

    public void setStorePath(List<Store> storePath) {
        this.storePath = storePath;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Object getPartialMatches() {
        return partialMatches;
    }

    public void setPartialMatches(Object partialMatches) {
        this.partialMatches = partialMatches;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<SmartClassification> getSmartClassifications() {
        return smartClassifications;
    }

    public void setSmartClassifications(List<SmartClassification> smartClassifications) {
        this.smartClassifications = smartClassifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SherlockFilterResponse that = (SherlockFilterResponse) o;

        if (view != null ? !view.equals(that.view) : that.view != null) return false;
        if (subStores != null ? !subStores.equals(that.subStores) : that.subStores != null) return false;
        if (selectedFacets != null ? !selectedFacets.equals(that.selectedFacets) : that.selectedFacets != null)
            return false;
        if (storePath != null ? !storePath.equals(that.storePath) : that.storePath != null) return false;
        if (store != null ? !store.equals(that.store) : that.store != null) return false;
        if (partialMatches != null ? !partialMatches.equals(that.partialMatches) : that.partialMatches != null)
            return false;
        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        if (facets != null ? !facets.equals(that.facets) : that.facets != null) return false;
        if (resourceType != null ? !resourceType.equals(that.resourceType) : that.resourceType != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        return smartClassifications != null ? smartClassifications.equals(that.smartClassifications) : that.smartClassifications == null;
    }

    @Override
    public int hashCode() {
        int result = view != null ? view.hashCode() : 0;
        result = 31 * result + (subStores != null ? subStores.hashCode() : 0);
        result = 31 * result + (selectedFacets != null ? selectedFacets.hashCode() : 0);
        result = 31 * result + (storePath != null ? storePath.hashCode() : 0);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        result = 31 * result + (partialMatches != null ? partialMatches.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (facets != null ? facets.hashCode() : 0);
        result = 31 * result + (resourceType != null ? resourceType.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (smartClassifications != null ? smartClassifications.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SherlockFilterResponse{" +
                "view=" + view +
                ", subStores=" + subStores +
                ", selectedFacets=" + selectedFacets +
                ", storePath=" + storePath +
                ", store=" + store +
                ", partialMatches=" + partialMatches +
                ", products=" + products +
                ", facets=" + facets +
                ", resourceType='" + resourceType + '\'' +
                ", tags=" + tags +
                ", smartClassifications=" + smartClassifications +
                '}';
    }
}
