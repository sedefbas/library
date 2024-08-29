package com.kitaplik.library_service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDto {
    private BookIdDto id;
    private String title;
    private int year;
    private String author;
    private String pressName;

    // Custom constructor
    public BookDto(BookIdDto id, String title, int year, String author, String pressName) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
        this.pressName = pressName;
    }

    public BookDto(BookIdDto id) {
        this.id = id;
    }


}
