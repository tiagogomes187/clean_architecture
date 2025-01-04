package br.dev.tiagogomes.pessoa_api.core.usercases;

import br.dev.tiagogomes.pessoa_api.core.entities.Pessoa;
import br.dev.tiagogomes.pessoa_api.core.exceptions.BusinessException;
import br.dev.tiagogomes.pessoa_api.core.gateways.PessoaGateway;

import java.util.List;

public class GetAllPessoasUseCaseImpl implements GetAllPessoasUseCase {
	
	private final PessoaGateway pessoaGateway;
	
	public GetAllPessoasUseCaseImpl (PessoaGateway pessoaGateway) {
		this.pessoaGateway = pessoaGateway;
	}
	
	
	@Override
	public List<Pessoa> execute () {
		return pessoaGateway.getAllPessoas();
	}
}
