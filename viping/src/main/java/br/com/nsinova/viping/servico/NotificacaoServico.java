package br.com.nsinova.viping.servico;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nsinova.viping.modelo.Notificacao;
import br.com.nsinova.viping.modelo.RegistroAtividade;

@Service
public class NotificacaoServico {
	
	@Autowired
	private RegistroServico registroServico;
	
	public boolean gerarRegistroAtividade(Notificacao notificacao) {
		RegistroAtividade registro = new RegistroAtividade();
		registro.setData(new Date());
		registro.setDescricao(notificacao.getResource());
		registro.setTipo(notificacao.getTopic());
		registro.setUser_id(notificacao.getUser_id());
		return (registroServico.salvar(registro) !=null )? true : false;
	}
}
