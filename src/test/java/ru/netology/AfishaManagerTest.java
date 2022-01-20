package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaManagerTest {

    AfishaManager mng = new AfishaManager();
    AfishaManager mng2 = new AfishaManager(5);

    Film f1 = new Film(1, 1, "f_1", "f1", "action");
    Film f2 = new Film(2, 2, "f_2", "f2", "action");
    Film f3 = new Film(3, 3, "f_3", "f3", "action");
    Film f4 = new Film(4, 4, "f_4", "f4", "action");
    Film f5 = new Film(5, 5, "f_5", "f5", "action");
    Film f6 = new Film(6, 6, "f_6", "f6", "action");
    Film f7 = new Film(7, 7, "f_7", "f7", "action");
    Film f8 = new Film(8, 8, "f_8", "f8", "action");
    Film f9 = new Film(9, 9, "f_9", "f9", "action");
    Film f10 = new Film(10, 10, "f_10", "f10", "action");

    @Test
    public void shouldAddFilm() {
        mng.addFilm(f1);
        mng.getLastFilms();
        Film[] actual = mng.getLastFilms();
        Film[] expected = new Film[] {f1};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldAddAllFilm() {
        mng.addFilm(f1);
        mng.addFilm(f2);
        mng.addFilm(f3);
        mng.addFilm(f4);
        mng.addFilm(f5);
        mng.addFilm(f6);
        mng.addFilm(f7);
        mng.addFilm(f8);
        mng.addFilm(f9);
        mng.addFilm(f10);

        mng.getLastFilms();

        Film[] actual = mng.getLastFilms();
        Film[] expected = new Film[] {f10,f9,f8,f7,f6,f5,f4,f3,f2,f1};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldAddAllFilmConstructor() {
        mng2.addFilm(f1);
        mng2.addFilm(f2);
        mng2.addFilm(f3);
        mng2.addFilm(f4);
        mng2.addFilm(f5);


        mng2.getLastFilms();

        Film[] actual = mng2.getLastFilms();
        Film[] expected = new Film[] {f5,f4,f3,f2,f1};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void shouldRemoveByIdConstructor() {
        mng2.addFilm(f1);
        mng2.addFilm(f2);
        mng2.addFilm(f3);
        mng2.addFilm(f4);
        mng2.removeById(4);


        mng2.getLastFilms();

        Film[] actual = mng2.getLastFilms();
        Film[] expected = new Film[] {f3,f2,f1};
        assertArrayEquals(expected,actual);
    }

}




