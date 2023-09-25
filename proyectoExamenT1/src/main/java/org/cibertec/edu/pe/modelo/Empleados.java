package org.cibertec.edu.pe.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEmpleado")
	private int IdEmpleado;
	@Column(name = "Apellidos")
	private String Apellidos;
	
	@Column(name = "Nombres")
	private String Nombres;
	
	@Column(name = "Edad")
	private int Edad;
	
	@Column(name = "Sexo")
	private char Sexo;
	
	@Column(name = "Salario")
	private double Salario;
	
	public Empleados() {
	}
	
	public Empleados(int idEmpleado, String apellidos, String nombres, int edad, char sexo, double salario) {
		super();
		IdEmpleado = idEmpleado;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}

	public int getIdEmpleado() {
		return IdEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
}
