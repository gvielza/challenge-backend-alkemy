package challenge.backend.alkemy.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Entity
//@Data
//@Table(name = "audiovisuales")
public class Audiovisual {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String imagen = "no-image.png";
	private String titulo;
	private Date fechaCreacion;
	private Double calificacion;
	private List<Personaje> personajesAsociados;
}
