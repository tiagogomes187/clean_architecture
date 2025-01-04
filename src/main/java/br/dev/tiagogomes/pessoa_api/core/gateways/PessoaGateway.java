package br.dev.tiagogomes.pessoa_api.core.gateways;

import br.dev.tiagogomes.pessoa_api.core.entities.Pessoa;

import java.util.List;

public interface PessoaGateway {
	
	Pessoa createPessoa(Pessoa pessoa);
	
	Pessoa findByCpfCnpj (String cpfCnpj);
	
	List<Pessoa> getAllPessoas ();
}
