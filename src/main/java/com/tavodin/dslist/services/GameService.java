package com.tavodin.dslist.services;

import com.tavodin.dslist.dto.GameMinDTO;
import com.tavodin.dslist.entities.Game;
import com.tavodin.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
