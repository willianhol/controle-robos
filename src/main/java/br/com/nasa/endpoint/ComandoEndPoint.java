package br.com.nasa.endpoint;

import br.com.nasa.core.Executor;
import br.com.nasa.core.dominio.Robo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComandoEndPoint {

	@Autowired
	Executor executor;

	@RequestMapping(value = "/rest/mars/{commando}", method = RequestMethod.POST)
	public ResponseEntity<String> movimentar(@PathVariable("commando") String commando) {
		Robo robo = new Robo();
		return ResponseEntity.ok(executor.movimentar(robo, commando));
	}

}
