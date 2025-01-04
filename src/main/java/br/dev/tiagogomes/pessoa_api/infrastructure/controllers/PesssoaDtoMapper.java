package br.dev.tiagogomes.pessoa_api.infrastructure.controllers;

import br.dev.tiagogomes.pessoa_api.core.entities.Pessoa;
import br.dev.tiagogomes.pessoa_api.infrastructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PesssoaDtoMapper {
	
	public PessoaDto toDto (Pessoa pessoa) {
		return new PessoaDto (pessoa.nome (), pessoa.email (), pessoa.cpfCnpj (), pessoa.tipo ());
	}
	
	public Pessoa toDomain(PessoaDto pessoaDto){
		return new Pessoa (null, pessoaDto.nome (),pessoaDto.email (), pessoaDto.cpfCnpj (),pessoaDto.tipoPessoa ());
	}
}
