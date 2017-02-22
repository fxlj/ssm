package com.fx.supplier.basedata.model;

import java.io.Serializable;

/**
 * Created by H on 2017/2/18.
 */
public class Department implements Serializable {

    private static final long serialVersionUID = -2558791826986933876L;
    private Long id;
    private String name;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
