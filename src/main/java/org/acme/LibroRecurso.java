package org.acme;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.resteasy.annotations.SseElementType;
import org.reactivestreams.Publisher;

//@Path("/libros")
//@RequestScoped
//public class LibroRecurso {
//
///** @Inject
//  @Channel("libros")
//  Emitter<String> libros;
//    
//    @POST
//    @Consumes(MediaType.TEXT_PLAIN)
//    public void añadeLibro(String titulo) {
//        libros.send(titulo);
//    }*/
//	
//  @Inject
//  @Channel("libros")
//  Publisher<String> libros;
//    @GET
//    @Path("/stream")
//    @Produces(MediaType.SERVER_SENT_EVENTS)
//    @SseElementType("text/plain")
//    public Publisher<String> stream() {
//        return libros;
//    }
//
//}
