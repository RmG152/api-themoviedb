/*
 *      Copyright (c) 2004-2012 Stuart Boston
 *
 *      This software is licensed under a Creative Commons License
 *      See the LICENCE.txt file included in this package
 *
 *      For any reuse or distribution, you must make clear to others the
 *      license terms of this work.
 */
package com.moviejukebox.themoviedb.wrapper;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.moviejukebox.themoviedb.model.ReleaseInfo;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Stuart
 */
public class WrapperReleaseInfo {
    /*
     * Logger
     */

    private static final Logger LOGGER = Logger.getLogger(WrapperReleaseInfo.class);
    /*
     * Properties
     */
    @JsonProperty("id")
    private int id;
    @JsonProperty("countries")
    private List<ReleaseInfo> countries;

    //<editor-fold defaultstate="collapsed" desc="Getter methods">
    public List<ReleaseInfo> getCountries() {
        return countries;
    }

    public int getId() {
        return id;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setter methods">
    public void setCountries(List<ReleaseInfo> countries) {
        this.countries = countries;
    }

    public void setId(int id) {
        this.id = id;
    }
    //</editor-fold>

    /**
     * Handle unknown properties and print a message
     * @param key
     * @param value
     */
    @JsonAnySetter
    public void handleUnknown(String key, Object value) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown property: '").append(key);
        sb.append("' value: '").append(value).append("'");
        LOGGER.trace(sb.toString());
    }
}