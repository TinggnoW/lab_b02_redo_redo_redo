package com.fsse2401.lab_b02_redo_redo_redo.EXCEPTION;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (code=HttpStatus.BAD_REQUEST)

public class DataMissingException extends RuntimeException{
}
