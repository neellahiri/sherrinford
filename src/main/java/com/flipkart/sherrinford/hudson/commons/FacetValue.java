package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetValue {
    @JsonProperty
    private String title;
    @JsonProperty
    private int count;
    @JsonProperty
    private Resource resource;
    @JsonProperty
    private String color;
    @JsonProperty
    private String image;
    @JsonProperty
    private String displayTitle;
    @JsonProperty
    private String displaySubTitle;

    public FacetValue() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    public String getDisplaySubTitle() {
        return displaySubTitle;
    }

    public void setDisplaySubTitle(String displaySubTitle) {
        this.displaySubTitle = displaySubTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FacetValue that = (FacetValue) o;

        if (count != that.count) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (resource != null ? !resource.equals(that.resource) : that.resource != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (displayTitle != null ? !displayTitle.equals(that.displayTitle) : that.displayTitle != null) return false;
        return displaySubTitle != null ? displaySubTitle.equals(that.displaySubTitle) : that.displaySubTitle == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + count;
        result = 31 * result + (resource != null ? resource.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (displayTitle != null ? displayTitle.hashCode() : 0);
        result = 31 * result + (displaySubTitle != null ? displaySubTitle.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FacetValue{" +
                "title='" + title + '\'' +
                ", count=" + count +
                ", resource=" + resource +
                ", color='" + color + '\'' +
                ", image='" + image + '\'' +
                ", displayTitle='" + displayTitle + '\'' +
                ", displaySubTitle='" + displaySubTitle + '\'' +
                '}';
    }
}
