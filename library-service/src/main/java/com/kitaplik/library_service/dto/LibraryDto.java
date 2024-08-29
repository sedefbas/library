package com.kitaplik.library_service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class LibraryDto {
    private String id;
    private List<BookDto> userBookList = new ArrayList<>();

    // Custom constructor
    public LibraryDto(String id, List<BookDto> userBookList) {
        this.id = id;
        this.userBookList = userBookList;
    }

    public LibraryDto(String id) {
        this.id = id;
        this.userBookList = userBookList;
    }

}
