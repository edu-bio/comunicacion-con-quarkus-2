package org.acme;

//import javax.enterprise.context.ApplicationScoped;
//
//import org.eclipse.microprofile.reactive.messaging.Acknowledgment;
//import org.eclipse.microprofile.reactive.messaging.Incoming;
//import org.eclipse.microprofile.reactive.messaging.Outgoing;
//
//import io.smallrye.reactive.messaging.annotations.Broadcast;
//
//@ApplicationScoped
//public class LibrosConsumidor {
//
//	 private static final String titulos="kafkaaaaaaa";
//
//	 	@Incoming("libros")
//	    @Outgoing("listaLibros")
//	    @Broadcast
//	    @Acknowledgment(Acknowledgment.Strategy.PRE_PROCESSING)
//	    public String process() {
//	        return titulos;
//	    }
//}
