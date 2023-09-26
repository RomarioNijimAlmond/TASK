package org.example.enums;

public enum ApplicationUrl {

    APP("https://jqueryui.com/datepicker/");

    private final String url;

    ApplicationUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
