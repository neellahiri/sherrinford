package com.flipkart.sherrinford.hudson.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.*;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SherlockIteratorResponse {
    @JsonProperty
    public boolean isSuperStore;
    @JsonProperty("substores")
    private List<Store> subStores;
    @JsonProperty("store-path")
    private List<Store> storePath;
    @JsonProperty
    private Store store;
    @JsonProperty
    private Products products;
    @JsonProperty("sort-options")
    private List<SortOption> sortOptions;
    @JsonProperty
    private List<Facet> facets;
    @JsonProperty("selectedFacets")
    private List<Facet> selectedFacets;
    @JsonProperty
    private String uri;
    @JsonProperty
    private String href;
    @JsonProperty("resource-type")
    private String resourceType;
    @JsonProperty
    private List<Tag> tags;
    @JsonProperty("smart-classification")
    private List<SmartClassification> smartClassifications;
    @JsonProperty("spell-suggestions")
    private List<LinkedHashMap<String, String>> spellSuggestions;
    @JsonProperty("augmentation-object")
    private AugmentationObject augmentationObject;
    @JsonProperty("guide")
    private GuidedSearchSherlockResponse guide;
    @JsonProperty
    private List<Stub> stubs;
    @JsonProperty
    private Classification classification;
    @JsonProperty
    private Store superstore;
    @JsonProperty("superstore-path")
    private List<Store> superstorePath;
    @JsonProperty("debug")
    private Object debug;
    @JsonProperty("universal-search-content")
    private UniversalSearch universalSearchContent;

    public SherlockIteratorResponse() {
    }

    public boolean isSuperStore() {
        return isSuperStore;
    }

    public void setSuperStore(boolean superStore) {
        isSuperStore = superStore;
    }

    public List<Store> getSubStores() {
        return subStores;
    }

    public void setSubStores(List<Store> subStores) {
        this.subStores = subStores;
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

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public List<SortOption> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOption> sortOptions) {
        this.sortOptions = sortOptions;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    public List<Facet> getSelectedFacets() {
        return selectedFacets;
    }

    public void setSelectedFacets(List<Facet> selectedFacets) {
        this.selectedFacets = selectedFacets;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
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

    public List<LinkedHashMap<String, String>> getSpellSuggestions() {
        return spellSuggestions;
    }

    public void setSpellSuggestions(List<LinkedHashMap<String, String>> spellSuggestions) {
        this.spellSuggestions = spellSuggestions;
    }

    public AugmentationObject getAugmentationObject() {
        return augmentationObject;
    }

    public void setAugmentationObject(AugmentationObject augmentationObject) {
        this.augmentationObject = augmentationObject;
    }

    public GuidedSearchSherlockResponse getGuide() {
        return guide;
    }

    public void setGuide(GuidedSearchSherlockResponse guide) {
        this.guide = guide;
    }

    public List<Stub> getStubs() {
        return stubs;
    }

    public void setStubs(List<Stub> stubs) {
        this.stubs = stubs;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Store getSuperstore() {
        return superstore;
    }

    public void setSuperstore(Store superstore) {
        this.superstore = superstore;
    }

    public List<Store> getSuperstorePath() {
        return superstorePath;
    }

    public void setSuperstorePath(List<Store> superstorePath) {
        this.superstorePath = superstorePath;
    }

    public Object getDebug() {
        return debug;
    }

    public void setDebug(Object debug) {
        this.debug = debug;
    }

    public UniversalSearch getUniversalSearchContent() {
        return universalSearchContent;
    }

    public void setUniversalSearchContent(UniversalSearch universalSearchContent) {
        this.universalSearchContent = universalSearchContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SherlockIteratorResponse that = (SherlockIteratorResponse) o;

        if (isSuperStore != that.isSuperStore) return false;
        if (subStores != null ? !subStores.equals(that.subStores) : that.subStores != null) return false;
        if (storePath != null ? !storePath.equals(that.storePath) : that.storePath != null) return false;
        if (store != null ? !store.equals(that.store) : that.store != null) return false;
        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        if (sortOptions != null ? !sortOptions.equals(that.sortOptions) : that.sortOptions != null) return false;
        if (facets != null ? !facets.equals(that.facets) : that.facets != null) return false;
        if (selectedFacets != null ? !selectedFacets.equals(that.selectedFacets) : that.selectedFacets != null)
            return false;
        if (uri != null ? !uri.equals(that.uri) : that.uri != null) return false;
        if (href != null ? !href.equals(that.href) : that.href != null) return false;
        if (resourceType != null ? !resourceType.equals(that.resourceType) : that.resourceType != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (smartClassifications != null ? !smartClassifications.equals(that.smartClassifications) : that.smartClassifications != null)
            return false;
        if (spellSuggestions != null ? !spellSuggestions.equals(that.spellSuggestions) : that.spellSuggestions != null)
            return false;
        if (augmentationObject != null ? !augmentationObject.equals(that.augmentationObject) : that.augmentationObject != null)
            return false;
        if (guide != null ? !guide.equals(that.guide) : that.guide != null) return false;
        if (stubs != null ? !stubs.equals(that.stubs) : that.stubs != null) return false;
        if (classification != null ? !classification.equals(that.classification) : that.classification != null)
            return false;
        if (superstore != null ? !superstore.equals(that.superstore) : that.superstore != null) return false;
        if (superstorePath != null ? !superstorePath.equals(that.superstorePath) : that.superstorePath != null)
            return false;
        if (debug != null ? !debug.equals(that.debug) : that.debug != null) return false;
        return universalSearchContent != null ? universalSearchContent.equals(that.universalSearchContent) : that.universalSearchContent == null;
    }

    @Override
    public int hashCode() {
        int result = (isSuperStore ? 1 : 0);
        result = 31 * result + (subStores != null ? subStores.hashCode() : 0);
        result = 31 * result + (storePath != null ? storePath.hashCode() : 0);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (sortOptions != null ? sortOptions.hashCode() : 0);
        result = 31 * result + (facets != null ? facets.hashCode() : 0);
        result = 31 * result + (selectedFacets != null ? selectedFacets.hashCode() : 0);
        result = 31 * result + (uri != null ? uri.hashCode() : 0);
        result = 31 * result + (href != null ? href.hashCode() : 0);
        result = 31 * result + (resourceType != null ? resourceType.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (smartClassifications != null ? smartClassifications.hashCode() : 0);
        result = 31 * result + (spellSuggestions != null ? spellSuggestions.hashCode() : 0);
        result = 31 * result + (augmentationObject != null ? augmentationObject.hashCode() : 0);
        result = 31 * result + (guide != null ? guide.hashCode() : 0);
        result = 31 * result + (stubs != null ? stubs.hashCode() : 0);
        result = 31 * result + (classification != null ? classification.hashCode() : 0);
        result = 31 * result + (superstore != null ? superstore.hashCode() : 0);
        result = 31 * result + (superstorePath != null ? superstorePath.hashCode() : 0);
        result = 31 * result + (debug != null ? debug.hashCode() : 0);
        result = 31 * result + (universalSearchContent != null ? universalSearchContent.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SherlockIteratorResponse{" +
                "isSuperStore=" + isSuperStore +
                ", subStores=" + subStores +
                ", storePath=" + storePath +
                ", store=" + store +
                ", products=" + products +
                ", sortOptions=" + sortOptions +
                ", facets=" + facets +
                ", selectedFacets=" + selectedFacets +
                ", uri='" + uri + '\'' +
                ", href='" + href + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", tags=" + tags +
                ", smartClassifications=" + smartClassifications +
                ", spellSuggestions=" + spellSuggestions +
                ", augmentationObject=" + augmentationObject +
                ", guide=" + guide +
                ", stubs=" + stubs +
                ", classification=" + classification +
                ", superstore=" + superstore +
                ", superstorePath=" + superstorePath +
                ", debug=" + debug +
                ", universalSearchContent=" + universalSearchContent +
                '}';
    }
}
