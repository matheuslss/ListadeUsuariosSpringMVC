package br.com.wallissonmarinho.mvc.dao;

import java.util.List;
import br.com.wallissonmarinho.mvc.domain.Usuario;

public interface UsuarioDao {
	
	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	Usuario getId(Long id);
	
	List<Usuario> getTodos();

}
