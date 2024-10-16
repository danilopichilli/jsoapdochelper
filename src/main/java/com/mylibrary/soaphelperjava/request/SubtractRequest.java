package com.mylibrary.soaphelperjava.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SubtractRequest")
public class SubtractRequest {
    private int a;
    private int b;

    @XmlElement
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @XmlElement
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
