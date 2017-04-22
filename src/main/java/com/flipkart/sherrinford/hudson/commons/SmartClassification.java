package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SmartClassification {
    @JsonProperty
    private String view;
    @JsonProperty
    private String viewId;
    @JsonProperty
    private String type;
    @JsonProperty("aggregation-type")
    private String aggregationType;
    @JsonProperty
    private Store store;
    @JsonProperty
    private List<String> products;
    @JsonProperty("store-path")
    private List<Store> storePath;
    @JsonProperty
    private double probability;

    public SmartClassification() {
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAggregationType() {
        return aggregationType;
    }

    public void setAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public List<Store> getStorePath() {
        return storePath;
    }

    public void setStorePath(List<Store> storePath) {
        this.storePath = storePath;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmartClassification that = (SmartClassification) o;

        if (Double.compare(that.probability, probability) != 0) return false;
        if (view != null ? !view.equals(that.view) : that.view != null) return false;
        if (viewId != null ? !viewId.equals(that.viewId) : that.viewId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (aggregationType != null ? !aggregationType.equals(that.aggregationType) : that.aggregationType != null)
            return false;
        if (store != null ? !store.equals(that.store) : that.store != null) return false;
        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        return storePath != null ? storePath.equals(that.storePath) : that.storePath == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = view != null ? view.hashCode() : 0;
        result = 31 * result + (viewId != null ? viewId.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (aggregationType != null ? aggregationType.hashCode() : 0);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (storePath != null ? storePath.hashCode() : 0);
        temp = Double.doubleToLongBits(probability);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SmartClassification{" +
                "view='" + view + '\'' +
                ", viewId='" + viewId + '\'' +
                ", type='" + type + '\'' +
                ", aggregationType='" + aggregationType + '\'' +
                ", store=" + store +
                ", products=" + products +
                ", storePath=" + storePath +
                ", probability=" + probability +
                '}';
    }
}
