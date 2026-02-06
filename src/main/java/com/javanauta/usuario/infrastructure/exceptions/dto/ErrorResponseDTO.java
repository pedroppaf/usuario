package com.javanauta.usuario.infrastructure.exceptions.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ErrorResponseDTO {

    private LocalDateTime timestamp;
    private int status;
    private String message;
    private String error;
    private String path;
}
