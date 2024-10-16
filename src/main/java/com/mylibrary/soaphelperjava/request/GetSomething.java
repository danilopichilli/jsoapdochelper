package com.mylibrary.soaphelperjava.request;


import com.jsoapdoc.soaplib.annotation.Required;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetSomethingRequest")
public class GetSomething {

    @Required
    private String requestInfo;

    private AddRequest addRequest;

    @XmlElement
    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    @XmlElement
    public AddRequest getAddRequest() {
        return addRequest;
    }

    public void setAddRequest(AddRequest addRequest) {
        this.addRequest = addRequest;
    }
}
