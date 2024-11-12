package br.com.borges.leonorico.dslist.repositories;

import br.com.borges.leonorico.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
