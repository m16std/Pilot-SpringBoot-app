package com.rep.yo.controllers;

import com.rep.yo.models.Film;
import com.rep.yo.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/get")
    public List<Film> getFilms() {
        return filmService.getFilms();
    }

    @GetMapping("/get/{id}")
    public Optional<Film> geFilmById(@PathVariable Long id) {
        return filmService.getFilmById(id);
    }

    @GetMapping("/delete/{id}")
    public void deleteFilmById(@PathVariable Long id) {
        filmService.deleteFilmById(id);
    }

    @GetMapping("/add")
    public Film addFilm(@RequestParam String name, @RequestParam String country, @RequestParam Integer year) {
        Film film = new Film(name, country, year);
        return filmService.addFilm(film);
    }
}
