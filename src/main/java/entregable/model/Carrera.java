package entregable.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Carrera implements Comparable<Carrera>{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCarrera;
	@Column(name="nombre")
	private String nombre;
	
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carrera(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Long getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(Long idCarrera) {
		this.idCarrera = idCarrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Carrera [idCarrera=" + idCarrera + ", nombre=" + nombre + "]";
	}
    @Override
    public int compareTo(Carrera c) {
        return this.nombre.compareTo(c.getNombre());
    }
	
}
