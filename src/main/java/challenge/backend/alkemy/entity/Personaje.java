package challenge.backend.alkemy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Data
@Table(name = "personajes")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String imagen = "no-image.png";
	private String nombre;
	private Integer edad;
	private Double peso;
	private String historia;
	//private List<?> audiovisualesAsociados;

}
