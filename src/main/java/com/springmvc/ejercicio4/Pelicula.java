package com.springmvc.ejercicio4;

public class Pelicula {
	public Pelicula() {
		super();
	}
	public Pelicula(String titulo, String sinopsis, int anyoEstreno, String imagen, String duracion) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.anyoEstreno = anyoEstreno;
		this.imagen = imagen;
		this.duracion = duracion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public int getAnyoEstreno() {
		return anyoEstreno;
	}
	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	private String titulo;
	private String sinopsis;
	private int anyoEstreno;
	private String imagen;
	private String duracion;
}
