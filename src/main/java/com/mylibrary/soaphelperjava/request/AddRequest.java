package com.mylibrary.soaphelperjava.request;


import io.github.jsoapdoc.annotation.Required;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "AddRequest")
public class AddRequest {

    @Required
    private int a;

    @Required
    private int b;

    private List<Integer> list = new ArrayList<>();

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

    @XmlElement
    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}

