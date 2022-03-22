package com.jmoncayo.template.sitecontent;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Document(collection = "site-content")
public class SiteContent {

    @Id
    private String id;
    private String name;

    private HashMap<String, String> siteContent = new HashMap<>();

    public SiteContent() {
    }

    public SiteContent(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getSiteContent() {
        return siteContent;
    }

    public void setSiteContent(HashMap<String, String> siteContent) {
        this.siteContent = siteContent;
    }
}
