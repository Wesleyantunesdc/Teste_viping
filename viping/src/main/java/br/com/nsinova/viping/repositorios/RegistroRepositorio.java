package br.com.nsinova.viping.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nsinova.viping.modelo.RegistroAtividade;

@Repository
public interface RegistroRepositorio extends JpaRepository<RegistroAtividade, Long>{
}
