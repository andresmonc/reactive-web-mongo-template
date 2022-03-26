package com.jmoncayo.template.caching;

public enum Caches {
    SITECONTENT(Constants.SITECONTENT);

    Caches(String cacheName) {
        if (!cacheName.equals(this.name()))
            throw new IllegalArgumentException();
    }

    public static class Constants {
        public static final String SITECONTENT = "SITECONTENT";
    }
}
