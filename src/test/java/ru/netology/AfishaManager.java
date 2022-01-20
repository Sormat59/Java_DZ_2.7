package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManager {
    private Film[] films = new Film[0];
    private int numberOfFilms = 10;


    public AfishaManager() {
    }

    public AfishaManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }



    public void addFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }


   // public Film[] getAllFilms() {
    //    Film[] result = new Film[films.length];
     //   for (int i = 0; i < result.length; i++) {
     //       int index = films.length - i - 1;
    //        result[i] = films[index];
     //   }
    //    return result;
   // }

    public Film[] getLastFilms() {
        int resultLength = numberOfFilms;
        if (resultLength > films.length)
            resultLength = films.length;
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        Film[] tmp = new Film[length];
        int index = 0;
        for (Film film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }


}







