package br.com.nsinova.viping.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.nsinova.viping.modelo.RegistroAtividade;
import br.com.nsinova.viping.repositorios.RegistroRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private RegistroRepositorio registroRepositorio;

	@Override
	public void run(String... args) throws Exception {
		RegistroAtividade reg1 = new RegistroAtividade(1l, new Date(), "Vendas", "Usuario realizou uma venda",132323232);
		RegistroAtividade reg2 = new RegistroAtividade(2l, new Date(), "Anuncio", "Usuario criou um anuncio",21232222);
		
		registroRepositorio.saveAll(Arrays.asList(reg1,reg2));
	}
}
