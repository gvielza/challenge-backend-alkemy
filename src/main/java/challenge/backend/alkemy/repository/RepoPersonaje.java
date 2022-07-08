package challenge.backend.alkemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import challenge.backend.alkemy.entity.Personaje;

public interface RepoPersonaje extends JpaRepository<Personaje, Integer>{

}
