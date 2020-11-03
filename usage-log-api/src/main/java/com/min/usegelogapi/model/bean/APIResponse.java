package com.min.usegelogapi.model.bean;

import lombok.Data;

@Data
public class APIResponse {
    private int Status;
    private String message;
    private Object data;
}
