package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.InlineFilters;
import com.flipkart.sherrinford.hudson.commons.InlineGuides;
import com.flipkart.sherrinford.hudson.commons.MerchCards;
import com.flipkart.sherrinford.hudson.v1.Facet;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UniversalSearch {
    @JsonProperty("inline-guides")
    private List<InlineGuides> inlineGuides;
    @JsonProperty("inline-filters")
    private List<InlineFilters> inlineFilters;
    @JsonProperty("merch-content")
    private List<MerchCards> merchCards;
    @JsonProperty("serviceability-filter")
    private Facet serviceabilityFilter;

    public UniversalSearch() {
    }

    public List<InlineGuides> getInlineGuides() {
        return inlineGuides;
    }

    public void setInlineGuides(List<InlineGuides> inlineGuides) {
        this.inlineGuides = inlineGuides;
    }

    public List<InlineFilters> getInlineFilters() {
        return inlineFilters;
    }

    public void setInlineFilters(List<InlineFilters> inlineFilters) {
        this.inlineFilters = inlineFilters;
    }

    public List<MerchCards> getMerchCards() {
        return merchCards;
    }

    public void setMerchCards(List<MerchCards> merchCards) {
        this.merchCards = merchCards;
    }

    public Facet getServiceabilityFilter() {
        return serviceabilityFilter;
    }

    public void setServiceabilityFilter(Facet serviceabilityFilter) {
        this.serviceabilityFilter = serviceabilityFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UniversalSearch that = (UniversalSearch) o;

        if (inlineGuides != null ? !inlineGuides.equals(that.inlineGuides) : that.inlineGuides != null) return false;
        if (inlineFilters != null ? !inlineFilters.equals(that.inlineFilters) : that.inlineFilters != null)
            return false;
        if (merchCards != null ? !merchCards.equals(that.merchCards) : that.merchCards != null) return false;
        return serviceabilityFilter != null ? serviceabilityFilter.equals(that.serviceabilityFilter) : that.serviceabilityFilter == null;
    }

    @Override
    public int hashCode() {
        int result = inlineGuides != null ? inlineGuides.hashCode() : 0;
        result = 31 * result + (inlineFilters != null ? inlineFilters.hashCode() : 0);
        result = 31 * result + (merchCards != null ? merchCards.hashCode() : 0);
        result = 31 * result + (serviceabilityFilter != null ? serviceabilityFilter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UniversalSearch{" +
                "inlineGuides=" + inlineGuides +
                ", inlineFilters=" + inlineFilters +
                ", merchCards=" + merchCards +
                ", serviceabilityFilter=" + serviceabilityFilter +
                '}';
    }
}
