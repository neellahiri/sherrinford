package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PopularSubstore {
    @JsonProperty
    private List<Store> substores;
    @JsonProperty("store-path")
    private List<Store> storePath;
    @JsonProperty
    private Store store;

    public PopularSubstore() {
    }

    public List<Store> getSubstores() {

        return substores;
    }

    public void setSubstores(List<Store> substores) {
        this.substores = substores;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PopularSubstore that = (PopularSubstore) o;

        if (substores != null ? !substores.equals(that.substores) : that.substores != null) return false;
        if (storePath != null ? !storePath.equals(that.storePath) : that.storePath != null) return false;
        return store != null ? store.equals(that.store) : that.store == null;
    }

    @Override
    public int hashCode() {
        int result = substores != null ? substores.hashCode() : 0;
        result = 31 * result + (storePath != null ? storePath.hashCode() : 0);
        result = 31 * result + (store != null ? store.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PopularSubstore{" +
                "substores=" + substores +
                ", storePath=" + storePath +
                ", store=" + store +
                '}';
    }
}

