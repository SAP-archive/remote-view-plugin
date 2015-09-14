package com.sap.jenkinsci.plugin.remote_view;

/**
 * Created by @NutellaMitBrezel on 09.06.2015.
 */
public class RemoteJob {

    private String name;
    private String status;
    private String jobUrl;

    public RemoteJob(String name, String status, String jobUrl){
        this.name = name;
        this.status = status;
        this.jobUrl = jobUrl;
    }

    public String getStatus(){
        return status;
    }

    public String getUrl() {
        return jobUrl;
    }

    public String getName() {
        return name;
    }

}

