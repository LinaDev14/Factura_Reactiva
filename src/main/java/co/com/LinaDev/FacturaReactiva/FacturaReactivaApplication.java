package co.com.LinaDev.FacturaReactiva;

import co.com.LinaDev.FacturaReactiva.reactive.FacturaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacturaReactivaApplication implements CommandLineRunner {

	// revisar a modo de debug
	private static final Logger log = LoggerFactory.getLogger(FacturaReactivaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FacturaReactivaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// mostrar lista de todos los productos
		FacturaService.mostrarListaProductos();
		// mostrar elemento por id
		FacturaService.mostrarPorId();
		// filtrar por nombre
		FacturaService.filtrarPorNombre();
		// filtrar por fecha mayor al 2019
		FacturaService.filtrarPorFecha();
		// filtrar por fecha menor al 2018
		FacturaService.filtrarFechaMenor();
		// multiplicar precio por 2
		FacturaService.multiplicarPorDos();
		// filtrar por precio
		FacturaService.filtrarPrecio();
		// mostrar el primer elemento mayor a $300
		FacturaService.mostrarValor();
	}

}
