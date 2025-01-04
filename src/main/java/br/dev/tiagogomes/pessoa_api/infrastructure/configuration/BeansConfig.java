package br.dev.tiagogomes.pessoa_api.infrastructure.configuration;

import br.dev.tiagogomes.pessoa_api.core.gateways.PessoaGateway;
import br.dev.tiagogomes.pessoa_api.core.usercases.CreatePessoaUseCase;
import br.dev.tiagogomes.pessoa_api.core.usercases.CreatePessoaUseCaseImpl;
import br.dev.tiagogomes.pessoa_api.core.usercases.GetAllPessoasUseCase;
import br.dev.tiagogomes.pessoa_api.core.usercases.GetAllPessoasUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	
	@Bean
	public CreatePessoaUseCase createPessoaUseCase (PessoaGateway pessoaGateway) {
		return new CreatePessoaUseCaseImpl (pessoaGateway);
	}

	@Bean
	public GetAllPessoasUseCase getAllPessoasUseCase(PessoaGateway pessoaGateway){
		return new GetAllPessoasUseCaseImpl (pessoaGateway);
	}
}
