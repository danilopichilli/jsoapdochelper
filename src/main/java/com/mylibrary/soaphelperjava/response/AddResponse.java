package com.mylibrary.soaphelperjava.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddResponse")
public class AddResponse {
    private int result;

    @XmlElement
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
