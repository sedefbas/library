package com.kitaplik.book_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookIdDto {

    private String bookId ;
    private String isbn;

    public static BookIdDto convert(String id, String isbn) {
        return new BookIdDto(id, isbn);
    }
}
