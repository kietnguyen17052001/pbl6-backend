package com.backend.pbl6schoolsystem.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "set")
public class NoContentResponse {
    private Boolean success;
    private ErrorResponse errorResponse;
}
