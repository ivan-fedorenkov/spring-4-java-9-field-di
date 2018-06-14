package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanParent {
    @Autowired
    private BeanChild child;

    public BeanParent() {
    }

    public BeanChild getChild() {
        return child;
    }
}
