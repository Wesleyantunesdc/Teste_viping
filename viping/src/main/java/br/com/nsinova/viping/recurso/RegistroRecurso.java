package br.com.nsinova.viping.recurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nsinova.viping.modelo.RegistroAtividade;
import br.com.nsinova.viping.servico.RegistroServico;

@RestController
@RequestMapping("/registro")
public class RegistroRecurso {
	
	@Autowired
	private RegistroServico registroServico;
	
	@GetMapping
	public ResponseEntity<List<RegistroAtividade>> buscarTodos(){
		List<RegistroAtividade> lista = registroServico.buscarTodos();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<RegistroAtividade> buscarPorId(@PathVariable Long id){
		RegistroAtividade registro = registroServico.obterPorId(id);
		return ResponseEntity.ok().body(registro);
	}
}
