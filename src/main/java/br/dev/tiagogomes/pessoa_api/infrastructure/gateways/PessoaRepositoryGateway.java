package br.dev.tiagogomes.pessoa_api.infrastructure.gateways;

import br.dev.tiagogomes.pessoa_api.core.entities.Pessoa;
import br.dev.tiagogomes.pessoa_api.core.gateways.PessoaGateway;
import br.dev.tiagogomes.pessoa_api.infrastructure.persistence.PessoaEntity;
import br.dev.tiagogomes.pessoa_api.infrastructure.persistence.PessoaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PessoaRepositoryGateway implements PessoaGateway {
	
	private final PessoaRepository pessoaRepository;
	private final PessoaEntityMapper entityMapper;
	
	public PessoaRepositoryGateway (PessoaRepository pessoaRepository, PessoaEntityMapper entityMapper) {
		this.pessoaRepository = pessoaRepository;
		this.entityMapper = entityMapper;
	}
	
	@Override
	public Pessoa createPessoa (Pessoa pessoa) {
		PessoaEntity entity = entityMapper.toEntity (pessoa);
		PessoaEntity novaPessoa = pessoaRepository.save (entity);
		return entityMapper.toPessoa (novaPessoa);
	}
	
	@Override
	public Pessoa findByCpfCnpj (String cpfCnpj) {
		PessoaEntity entity = pessoaRepository.findByCpfCnpj (cpfCnpj);
		if (entity == null){
			return null;
		}
		return entityMapper.toPessoa (entity);
	}
	
	@Override
	public List<Pessoa> getAllPessoas () {
		return pessoaRepository.findAll ().stream ().map (entity -> entityMapper.toPessoa (entity)).collect(Collectors.toList());
	}
}
