package com.mylibrary.soaphelperjava.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetSomethingResponse")
public class GetSomethingResponse {

    private String responseInfo;

    @XmlElement
    public String getResponseInfo() {
        return responseInfo;
    }

    public void setResponseInfo(String responseInfo) {
        this.responseInfo = responseInfo;
    }
}
