package com.flipkart.sherrinford.hudson.commons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.flipkart.sherrinford.hudson.commons.GuidedSearchSherlockInfo;

import java.util.List;

/**
 * Created by neel.lahiri on 19/04/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GuidedSearchSherlockResponse {
    @JsonProperty
    private List<GuidedSearchSherlockInfo> current;
    @JsonProperty
    private List<GuidedSearchSherlockInfo> selected;

    public GuidedSearchSherlockResponse() {
    }

    public List<GuidedSearchSherlockInfo> getCurrent() {
        return current;
    }

    public void setCurrent(List<GuidedSearchSherlockInfo> current) {
        this.current = current;
    }

    public List<GuidedSearchSherlockInfo> getSelected() {
        return selected;
    }

    public void setSelected(List<GuidedSearchSherlockInfo> selected) {
        this.selected = selected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuidedSearchSherlockResponse that = (GuidedSearchSherlockResponse) o;

        if (current != null ? !current.equals(that.current) : that.current != null) return false;
        return selected != null ? selected.equals(that.selected) : that.selected == null;
    }

    @Override
    public int hashCode() {
        int result = current != null ? current.hashCode() : 0;
        result = 31 * result + (selected != null ? selected.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GuidedSearchSherlockResponse{" +
                "current=" + current +
                ", selected=" + selected +
                '}';
    }
}
