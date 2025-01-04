package br.dev.tiagogomes.pessoa_api.core.usercases;

import br.dev.tiagogomes.pessoa_api.core.entities.Pessoa;

public interface CreatePessoaUseCase {
	
	public Pessoa execute(Pessoa pessoa);
}
