package com.kitaplik.library_service.exception;

public class LibraryNotFoundException extends RuntimeException{

    public LibraryNotFoundException(String message) {
        super(message);
    }
}
