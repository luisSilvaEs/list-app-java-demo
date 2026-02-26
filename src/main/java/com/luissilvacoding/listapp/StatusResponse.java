package com.luissilvacoding.listapp;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "API status response")
public class StatusResponse {

    @Schema(description = "Current API status", example = "API is running :)")
    private String status;

    public StatusResponse(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}