package com.requisicoes.api.java.comum;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErroRequest extends RuntimeException {

    public ErroRequest(String message) {
        super(message);
    }
}
