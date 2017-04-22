package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.GuidedSearchSherlockResponse;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InlineGuides {
    @JsonProperty
    private GuidedSearchSherlockResponse guides;
    @JsonProperty
    private int position;

    public InlineGuides() {
    }

    public GuidedSearchSherlockResponse getGuides() {
        return guides;
    }

    public void setGuides(GuidedSearchSherlockResponse guides) {
        this.guides = guides;
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

        InlineGuides that = (InlineGuides) o;

        if (position != that.position) return false;
        return guides != null ? guides.equals(that.guides) : that.guides == null;
    }

    @Override
    public int hashCode() {
        int result = guides != null ? guides.hashCode() : 0;
        result = 31 * result + position;
        return result;
    }

    @Override
    public String toString() {
        return "InlineGuides{" +
                "guides=" + guides +
                ", position=" + position +
                '}';
    }
}
