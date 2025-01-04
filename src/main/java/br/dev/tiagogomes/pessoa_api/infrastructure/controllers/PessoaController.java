package br.dev.tiagogomes.pessoa_api.infrastructure.controllers;

import br.dev.tiagogomes.pessoa_api.core.entities.Pessoa;
import br.dev.tiagogomes.pessoa_api.core.usercases.CreatePessoaUseCase;
import br.dev.tiagogomes.pessoa_api.core.usercases.GetAllPessoasUseCase;
import br.dev.tiagogomes.pessoa_api.infrastructure.dtos.PessoaDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/api/pessoa")
public class PessoaController {
	
	private final CreatePessoaUseCase createPessoaUseCase;
	private final PesssoaDtoMapper pesssoaDtoMapper;
	private final GetAllPessoasUseCase getAllPessoasUseCase;
	
	public PessoaController (CreatePessoaUseCase createPessoaUseCase, PesssoaDtoMapper pesssoaDtoMapper, GetAllPessoasUseCase getAllPessoasUseCase) {
		this.createPessoaUseCase = createPessoaUseCase;
		this.pesssoaDtoMapper = pesssoaDtoMapper;
		this.getAllPessoasUseCase = getAllPessoasUseCase;
	}
	
	
	@PostMapping
	public PessoaDto createPessoa (@RequestBody PessoaDto pessoaDto) {
		Pessoa novaPessoa = createPessoaUseCase.execute (pesssoaDtoMapper.toDomain (pessoaDto));
		return pesssoaDtoMapper.toDto (novaPessoa);
	}
	
	@GetMapping
	public List<PessoaDto> getAllPessoas () {
		return getAllPessoasUseCase.execute ().stream ().map (pesssoaDtoMapper::toDto).collect (Collectors.toList ());
	}
}
