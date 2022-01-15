package com.domain.DTO;

import javax.validation.constraints.NotEmpty;

public class CategoryData {
    
    @NotEmpty(message = "Name is not required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
