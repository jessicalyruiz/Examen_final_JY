package ec.edu.uce.repository.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "clie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
	private Integer id;
	

	@Column(name = "clie_apellido")
	private String apellido;
	
	@Column(name = "clie_nombre")
	private String nombre;
	
	@Column(name = "clie_cedula")
	private String cedula;

	@OneToMany(mappedBy = "cliente")
	private List<CompraPasaje> compraPasajes;

	//get y set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<CompraPasaje> getCompraPasajes() {
		return compraPasajes;
	}

	public void setCompraPasajes(List<CompraPasaje> compraPasajes) {
		this.compraPasajes = compraPasajes;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	
	

}
