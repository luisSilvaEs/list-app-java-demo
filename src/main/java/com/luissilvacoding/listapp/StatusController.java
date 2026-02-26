package com.luissilvacoding.listapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@Tag(name = "Status", description = "Endpoints for checking API status")
public class StatusController {
    @GetMapping("/status")
    @Operation(summary = "Check API status", description = "Returns a simple status message indicating the API is running")
    @ApiResponse(responseCode = "200", description = "API is running successfully")
    public StatusResponse status() {
        return new StatusResponse("API is running :)");
    }
}