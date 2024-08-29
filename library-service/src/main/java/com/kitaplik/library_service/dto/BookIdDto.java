package com.kitaplik.library_service.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookIdDto {
    private String bookId;
    private String isbn;

    // Custom constructor
    public BookIdDto(String bookId, String isbn) {
        this.bookId = bookId;
        this.isbn = isbn;
    }

    public static BookIdDto convert(String id, String isbn) {
        return new BookIdDto(id, isbn);
    }
}
