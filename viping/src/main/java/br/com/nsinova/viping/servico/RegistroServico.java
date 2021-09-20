package br.com.nsinova.viping.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nsinova.viping.modelo.RegistroAtividade;
import br.com.nsinova.viping.repositorios.RegistroRepositorio;

@Service
public class RegistroServico {

	@Autowired
	private RegistroRepositorio registroRepositorio;
	
	public List<RegistroAtividade> buscarTodos(){
		return registroRepositorio.findAll();
	}
	
	public RegistroAtividade obterPorId(Long id){
		Optional<RegistroAtividade> obj = registroRepositorio.findById(id);
		return obj.get();
		// .get retorna objeto dentro do optional 
	}
	
	public RegistroAtividade salvar(RegistroAtividade registro) {
		return registroRepositorio.save(registro);	
	}
}

