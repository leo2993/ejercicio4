package com.springmvc.ejercicio4;

import java.util.ArrayList;

import org.springframework.http.HttpStatus.Series;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@SuppressWarnings("unused")
@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public String getHomePage() {
		return "home.html";
	}
	
	@RequestMapping(value = "/series")
	public String getPaginaSeries(Model model) {
		//Obtener los datos
		GestorSeries gp = new GestorSeries();
		ArrayList<Serie> series = gp.getSeries();
		//Meter los dato en el modelo
		model.addAttribute("series", series);
		//Devolver la vista
		return "series.html";
	}
	
	@RequestMapping(value = "/pelis")
	public String getPaginaPeliculas(Model model) {
		//Obtener los datos
		GestorPelis gp = new GestorPelis();
		ArrayList<Pelicula> peliculas = gp.getPeliculas();
		//Meter los dato en el modelo
		model.addAttribute("peliculas", peliculas);
		//Devolver la vista
		return "pelis.html";
	}
	
	/*@RequestMapping(value = "/verinformaticos")
	public String getPaginaInformaticos(Model model) {
		//Obtener los datos
		GestorPersonas gp = new GestorPersonas();
		ArrayList<Series> personas = gp.getPersonas();
		//Meter los dato en el modelo
		model.addAttribute("programadores", personas);
		//Devolver la vista
		return "programadores.html";
	}*/
	
	/*@RequestMapping(value = "/verpizzas")
	public String getPaginaPizzas() {
		return "listadopizzas.html";
	}*/
	
	
	/*
	@RequestMapping(value = "/verpersona")
	public String getTestData(Model model) {
		//Obtenemos los datos
		Persona p = new Persona("Fernando");
		//Metemos los datos en el model
		model.addAttribute("persona",p);
		//Retornamos la vista
		return "verpersona";
	}	
	
	@RequestMapping(value = "/personas")
	public String getPersonas(Model model) {
		GestorPersonas gp = new GestorPersonas();
		ArrayList<String> personas = gp.getPersonas();//Obtener los datos
		model.addAttribute("people",personas);
		return "listapersonas";
	}
	*/
}
