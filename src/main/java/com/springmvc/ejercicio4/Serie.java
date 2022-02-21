package com.springmvc.ejercicio4;

public class Serie {
	public Serie() {
		super();
	}
	public Serie(String titulo, String sinopsis, int anyoEstreno, int temporadas, String imagen) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.anyoEstreno = anyoEstreno;
		this.temporadas = temporadas;
		this.imagen = imagen;
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
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	private String titulo;
	private String sinopsis;
	private int anyoEstreno;
	private int temporadas;
	private String imagen;
}
