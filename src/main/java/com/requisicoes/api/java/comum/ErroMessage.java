package com.requisicoes.api.java.comum;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErroMessage {
    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String path;
    private String message;
}
