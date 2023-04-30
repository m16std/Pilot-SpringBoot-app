package com.rep.yo.services;

import com.rep.yo.models.Film;
import com.rep.yo.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FilmService {
    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getFilms() {
        return filmRepository.findAll();
    }

    public Optional<Film> getFilmById(Long id) {
        return filmRepository.findById(id);
    }

    public void deleteFilmById(Long id) {
        filmRepository.deleteById(id);
    }

    public Film addFilm(Film film) {
        film = filmRepository.save(film);
        return film;
    }
}
