package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Products {
    @JsonProperty
    private int count;
    @JsonProperty("num_found")
    private int numFound;
    @JsonProperty("num_items")
    private int numItems;
    @JsonProperty("num_returned")
    private int numReturned;
    private List<String> ids;
    @JsonProperty("links")
    private List<Link> links = null;
    @JsonProperty("listing-ids")
    private List<ProductAttributes> productAttributesList;

    public Products() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public int getNumReturned() {
        return numReturned;
    }

    public void setNumReturned(int numReturned) {
        this.numReturned = numReturned;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<ProductAttributes> getProductAttributesList() {
        return productAttributesList;
    }

    public void setProductAttributesList(List<ProductAttributes> productAttributesList) {
        this.productAttributesList = productAttributesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (count != products.count) return false;
        if (numFound != products.numFound) return false;
        if (numItems != products.numItems) return false;
        if (numReturned != products.numReturned) return false;
        if (ids != null ? !ids.equals(products.ids) : products.ids != null) return false;
        if (links != null ? !links.equals(products.links) : products.links != null) return false;
        return productAttributesList != null ? productAttributesList.equals(products.productAttributesList) : products.productAttributesList == null;
    }

    @Override
    public int hashCode() {
        int result = count;
        result = 31 * result + numFound;
        result = 31 * result + numItems;
        result = 31 * result + numReturned;
        result = 31 * result + (ids != null ? ids.hashCode() : 0);
        result = 31 * result + (links != null ? links.hashCode() : 0);
        result = 31 * result + (productAttributesList != null ? productAttributesList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Products{" +
                "count=" + count +
                ", numFound=" + numFound +
                ", numItems=" + numItems +
                ", numReturned=" + numReturned +
                ", ids=" + ids +
                ", links=" + links +
                ", productAttributesList=" + productAttributesList +
                '}';
    }
}
