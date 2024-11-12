package br.com.borges.leonorico.dslist.services;

import br.com.borges.leonorico.dslist.dto.GameMinDTO;
import br.com.borges.leonorico.dslist.entities.Game;
import br.com.borges.leonorico.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
