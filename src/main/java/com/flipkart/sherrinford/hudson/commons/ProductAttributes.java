package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAttributes {
    @JsonProperty("item-id")
    private String itemId;
    @JsonProperty("listing-id")
    private String listingId;
    @JsonProperty("product-id")
    private String productId;
    @JsonProperty("is-available")
    private Boolean isAvailable;
    @JsonProperty("is-serviceable")
    private Boolean isServiceable;

    public ProductAttributes() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Boolean getServiceable() {
        return isServiceable;
    }

    public void setServiceable(Boolean serviceable) {
        isServiceable = serviceable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductAttributes that = (ProductAttributes) o;

        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (listingId != null ? !listingId.equals(that.listingId) : that.listingId != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (isAvailable != null ? !isAvailable.equals(that.isAvailable) : that.isAvailable != null) return false;
        return isServiceable != null ? isServiceable.equals(that.isServiceable) : that.isServiceable == null;
    }

    @Override
    public int hashCode() {
        int result = itemId != null ? itemId.hashCode() : 0;
        result = 31 * result + (listingId != null ? listingId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (isAvailable != null ? isAvailable.hashCode() : 0);
        result = 31 * result + (isServiceable != null ? isServiceable.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductAttributes{" +
                "itemId='" + itemId + '\'' +
                ", listingId='" + listingId + '\'' +
                ", productId='" + productId + '\'' +
                ", isAvailable=" + isAvailable +
                ", isServiceable=" + isServiceable +
                '}';
    }
}
