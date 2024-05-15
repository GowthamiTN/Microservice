package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {
    @Schema(
            name = "ErrorResponse",
            description = "Schema to hold error response information"
    )

    private  String apiPath;
    @Schema(
            description = "API path invoked by client"
    )
    private HttpStatus errorCode;
    @Schema(
            description = "Error code representing the error happened"
    )
    private  String errorMessage;
    @Schema(
            description = "Time representing when the error happened"
    )
    private LocalDateTime errorTime;
}