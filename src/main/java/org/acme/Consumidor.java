package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class Consumidor {
	
	@Incoming("libros")
	public void imprimeLibro(Libro libro) {
		if(libro==null)
			System.out.println("El libro es nulo");
		else
		System.out.println(libro.toString());
	}

}
