package com.mark.Beans;

import java.awt.datatransfer.StringSelection;

/**
 * Created by mark on 4/13/15.
 */
public class Sources {

    private int source_number;
    private String source_name;
    private String source_street;
    private String source_city;
    private String source_state;
    private String source_zip;
    private String source_phone;

    public Sources(){

    }

    public String getSource_city() {
        return source_city;
    }

    public void setSource_city(String source_city) {
        this.source_city = source_city;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public int getSource_number() {
        return source_number;
    }

    public void setSource_number(int source_number) {
        this.source_number = source_number;
    }

    public String getSource_phone() {
        return source_phone;
    }

    public void setSource_phone(String source_phone) {
        this.source_phone = source_phone;
    }

    public String getSource_state() {
        return source_state;
    }

    public void setSource_state(String source_state) {
        this.source_state = source_state;
    }

    public String getSource_street() {
        return source_street;
    }

    public void setSource_street(String source_street) {
        this.source_street = source_street;
    }

    public String getSource_zip() {
        return source_zip;
    }

    public void setSource_zip(String source_zip) {
        this.source_zip = source_zip;
    }
}
