package com.emc.awg.demo.model;

import java.util.List;

/**
 * Created by imamchishty on 20/04/2016.
 */
public class Parcel {

    private List<String> districts;
    private SecretDocument document;

    public Parcel() {
    }

    public Parcel(SecretDocument document, List<String> districts) {
        this.document = document;
        this.districts = districts;
    }

    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }

    public void setDocument(SecretDocument document) {
        this.document = document;
    }

    public List<String> getDistricts() {
        return districts;
    }

    public SecretDocument getDocument() {
        return document;
    }

    @Override
    public String toString() {
        return "{\"Parcel\":{"
                + "\"districts\":" + districts
                + ", \"document\":" + document
                + "}}";
    }
}
