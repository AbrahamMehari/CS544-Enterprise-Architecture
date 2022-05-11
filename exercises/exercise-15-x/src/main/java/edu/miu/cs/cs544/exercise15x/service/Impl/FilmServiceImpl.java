package edu.miu.cs.cs544.exercise15x.service.Impl;

import edu.miu.cs.cs544.exercise15x.domain.Film;
import edu.miu.cs.cs544.exercise15x.repository.FilmRepo;
import edu.miu.cs.cs544.exercise15x.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private FilmRepo filmRepo;

    @Autowired
    public FilmServiceImpl(FilmRepo filmRepo) {
        this.filmRepo = filmRepo;
    }

    @Override public List<Film> findAll() {
        return filmRepo.findAll();
    }

    @Override public Optional<Film> findFilmById(Long id) {
        return Optional.of(filmRepo.findById(id)).orElse(null);
    }

    @Override public Optional<Film> findFilmByTitle(String title) {
        return Optional.of(filmRepo.findFilmByTitle(title)).orElse(null);
    }

}
