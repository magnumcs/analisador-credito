package com.portifolio.magnum.cadastropropostaapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

public class NoContentException extends HttpClientErrorException {

    private final String message;

    public NoContentException(String message) {
        super(HttpStatus.NO_CONTENT);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
