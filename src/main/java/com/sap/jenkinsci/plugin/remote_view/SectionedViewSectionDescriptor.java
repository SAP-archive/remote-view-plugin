package com.sap.jenkinsci.plugin.remote_view;

/**
 * Created by @NutellaMitBrezel on 09.06.2015.
 */

import hudson.model.Descriptor;
import net.sf.json.JSONObject;

import org.kohsuke.stapler.StaplerRequest;

public abstract class SectionedViewSectionDescriptor extends Descriptor<SectionedViewSection> {

  protected SectionedViewSectionDescriptor(Class<? extends SectionedViewSection> clazz) {
    super(clazz);
  }

  protected SectionedViewSectionDescriptor() {
  }

  @Override
  public SectionedViewSection newInstance(StaplerRequest req, JSONObject formData) throws FormException {
    SectionedViewSection section = (SectionedViewSection) req.bindJSON(getClass().getDeclaringClass(), formData);
    return section;
  }

}
