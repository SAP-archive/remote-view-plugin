package com.sap.jenkinsci.plugin.remote_view;

/**
 * Created by @NutellaMitBrezel on 12.06.2015. This class is used for saving the checkboxes of each job in a list
 */
public class Wrapper {

  private String jobName;
  private boolean checked;

  public Wrapper(String jobName, boolean checked) {
    this.jobName = jobName;
    this.checked = checked;
  }

  public String getJobName() {
    return this.jobName;
  }

  public boolean getStatus() {
    return this.checked;
  }

}
