package br.com.nsinova.viping.recurso;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nsinova.viping.modelo.Notificacao;
import br.com.nsinova.viping.modelo.enums.Mensagem;
import br.com.nsinova.viping.servico.NotificacaoServico;

@RestController
@RequestMapping(value = "/notificacao")
public class NotificacaoResource {
	
	
	@Autowired
	private NotificacaoServico notificacaoServico;
	
	@GetMapping
	public ResponseEntity<Notificacao> listarTodos(){
		Notificacao notificacao = 
						new Notificacao(1l,"paulo",123,"teste",1232,123,new Date(),new Date());
		return ResponseEntity.ok().body(notificacao);
	}
	
	@PostMapping
	public String receberNotificacao(@RequestBody Notificacao notificacao){
		boolean operacao = notificacaoServico.gerarRegistroAtividade(notificacao);
		if(operacao) {
			 return String.valueOf(Mensagem.ACK_200);
		}else {
			 return	String.valueOf(Mensagem.ERROR);
		}
	}
}
