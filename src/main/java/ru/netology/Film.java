package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor

public class Film {
    private int id;
    private int filmId;
    private String imageUrl;
    private String nameFilm;
    private String genre;

    public int getId() {
        return this.id;
    }
}
