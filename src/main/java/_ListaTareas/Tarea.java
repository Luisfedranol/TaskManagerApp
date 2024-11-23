package _ListaTareas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
	
    
    public Tarea(String nombre, String descripcion, LocalDate fechaInicio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
	}//Constructor
    
	public Tarea() {
	}//Constructor vacío

	public Long getId() {
		return id;
	}//getId
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	
	public String getDescripcion() {
		return descripcion;
	}//getDescripcion
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion
	
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}//getFechaInicio
	
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}//setFechaInicio

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaInicio="
				+ fechaInicio + "]";
	}//toString

}//class Tarea
