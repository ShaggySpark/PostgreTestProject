package com.postgresql.testtask.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.I_AM_A_TEAPOT, reason="I'm a teapot")  // 418
public class NotFoundException extends RuntimeException {
}
