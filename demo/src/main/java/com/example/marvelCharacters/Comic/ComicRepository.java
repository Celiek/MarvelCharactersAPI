package com.example.marvelCharacters.Comic;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic,Long> {

    List<Comic> findComicByName();

    List<Comic> findComicByCharacter();
}
