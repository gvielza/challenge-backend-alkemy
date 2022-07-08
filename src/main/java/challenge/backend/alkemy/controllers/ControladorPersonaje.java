package challenge.backend.alkemy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import challenge.backend.alkemy.entity.Personaje;
import challenge.backend.alkemy.repository.RepoPersonaje;

@RestController
@RequestMapping
public class ControladorPersonaje {
	@Autowired
	private RepoPersonaje repoPersonaje;

	@GetMapping("/personajes")
	public ResponseEntity<?> verPersonajes() {
		return ResponseEntity.ok().body(repoPersonaje.findAll());
	}
	@PostMapping("/personajes")
	public ResponseEntity<?>agregarPersonaje(@RequestBody Personaje p){
		return ResponseEntity.ok().body(repoPersonaje.save(p));
	}
//	public ResponseEntity<?> actualizarPersonaje(@PathVariable Integer id,@RequestBody Personaje p){
//		Personaje personajeBD=repoPersonaje.getReferenceById(id);
//	
//	}
	@DeleteMapping("personajes/{id}")
	public ResponseEntity<?>eliminarPersonaje(@PathVariable Integer id){
		repoPersonaje.deleteById(id);
		return ResponseEntity.noContent().build();
	}	

}
