package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.discovery.model.content.views.ContentCollection;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchCards {
    @JsonProperty
    private ContentCollection content;
    @JsonProperty
    private int position = 0;

    public MerchCards() {
    }

    public ContentCollection getContent() {
        return content;
    }

    public void setContent(ContentCollection content) {
        this.content = content;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MerchCards that = (MerchCards) o;

        if (position != that.position) return false;
        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + position;
        return result;
    }

    @Override
    public String toString() {
        return "MerchCards{" +
                "content=" + content +
                ", position=" + position +
                '}';
    }
}
