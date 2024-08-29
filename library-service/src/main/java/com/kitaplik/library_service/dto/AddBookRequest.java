package com.kitaplik.library_service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddBookRequest {
    private String id;
    private String isbn;

    // Custom constructor
    public AddBookRequest(String id, String isbn) {
        this.id = id;
        this.isbn = isbn;
    }
}
