package com.sap.jenkinsci.plugin.remote_view;

/**
 * Created by @NutellaMitBrezel on 09.06.2015.
 */

import hudson.Extension;
import hudson.util.FormValidation;

import java.io.IOException;

import javax.servlet.ServletException;

import net.sf.json.JSONObject;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.StaplerRequest;


public class RemoteJobsSection extends SectionedViewSection{


    @DataBoundConstructor
    public RemoteJobsSection(String name, Width width, Positioning alignment, String remoteURL) {
        super(name, width, alignment, remoteURL);
    }

    public static int var = 0;

    @Extension
    public static final class DescriptorImpl extends SectionedViewSectionDescriptor {

        @Override
        public SectionedViewSection newInstance(StaplerRequest req, JSONObject formData) throws FormException {
            RemoteJobsSection section = (RemoteJobsSection) super.newInstance(req, formData);

            return section;
        }

        @Override
        public String getDisplayName() {
            return "Remote Jobs Section";
        }

        public FormValidation doCheckRemoteURL(@QueryParameter String value) throws IOException, ServletException {
                if(value.isEmpty()) {
                    return FormValidation.error("Do not forget to specify the URL of your remote Jenkins!");
                }
            return FormValidation.ok();
        }
    }

}

