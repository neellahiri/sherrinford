package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AugmentationObject {
    @JsonProperty("show-augment-results-section")
    private boolean showAugmentResultsSection;
    @JsonProperty("augment-sort-options")
    private List<SortOption> sortOptions;
    @JsonProperty("augment-products")
    private Products augmentProducts;
    @JsonProperty("augment-suggestions")
    private List<String> augmentSuggestions;
    @JsonProperty
    private String type;
    @JsonProperty("show-augmentation")
    private boolean showAugmentation;
    @JsonProperty
    private String confidence;
    @JsonProperty("qc-query")
    private String correctedQuery;

    public AugmentationObject() {
    }

    public boolean isShowAugmentResultsSection() {
        return showAugmentResultsSection;
    }

    public void setShowAugmentResultsSection(boolean showAugmentResultsSection) {
        this.showAugmentResultsSection = showAugmentResultsSection;
    }

    public List<SortOption> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOption> sortOptions) {
        this.sortOptions = sortOptions;
    }

    public Products getAugmentProducts() {
        return augmentProducts;
    }

    public void setAugmentProducts(Products augmentProducts) {
        this.augmentProducts = augmentProducts;
    }

    public List<String> getAugmentSuggestions() {
        return augmentSuggestions;
    }

    public void setAugmentSuggestions(List<String> augmentSuggestions) {
        this.augmentSuggestions = augmentSuggestions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isShowAugmentation() {
        return showAugmentation;
    }

    public void setShowAugmentation(boolean showAugmentation) {
        this.showAugmentation = showAugmentation;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getCorrectedQuery() {
        return correctedQuery;
    }

    public void setCorrectedQuery(String correctedQuery) {
        this.correctedQuery = correctedQuery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AugmentationObject that = (AugmentationObject) o;

        if (showAugmentResultsSection != that.showAugmentResultsSection) return false;
        if (showAugmentation != that.showAugmentation) return false;
        if (sortOptions != null ? !sortOptions.equals(that.sortOptions) : that.sortOptions != null) return false;
        if (augmentProducts != null ? !augmentProducts.equals(that.augmentProducts) : that.augmentProducts != null)
            return false;
        if (augmentSuggestions != null ? !augmentSuggestions.equals(that.augmentSuggestions) : that.augmentSuggestions != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (confidence != null ? !confidence.equals(that.confidence) : that.confidence != null) return false;
        return correctedQuery != null ? correctedQuery.equals(that.correctedQuery) : that.correctedQuery == null;
    }

    @Override
    public int hashCode() {
        int result = (showAugmentResultsSection ? 1 : 0);
        result = 31 * result + (sortOptions != null ? sortOptions.hashCode() : 0);
        result = 31 * result + (augmentProducts != null ? augmentProducts.hashCode() : 0);
        result = 31 * result + (augmentSuggestions != null ? augmentSuggestions.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (showAugmentation ? 1 : 0);
        result = 31 * result + (confidence != null ? confidence.hashCode() : 0);
        result = 31 * result + (correctedQuery != null ? correctedQuery.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AugmentationObject{" +
                "showAugmentResultsSection=" + showAugmentResultsSection +
                ", sortOptions=" + sortOptions +
                ", augmentProducts=" + augmentProducts +
                ", augmentSuggestions=" + augmentSuggestions +
                ", type='" + type + '\'' +
                ", showAugmentation=" + showAugmentation +
                ", confidence='" + confidence + '\'' +
                ", correctedQuery='" + correctedQuery + '\'' +
                '}';
    }
}
