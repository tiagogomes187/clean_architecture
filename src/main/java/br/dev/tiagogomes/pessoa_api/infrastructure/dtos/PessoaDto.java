package br.dev.tiagogomes.pessoa_api.infrastructure.dtos;

import br.dev.tiagogomes.pessoa_api.core.enums.EnumTipoPessoa;

public record PessoaDto(String nome, String email, String cpfCnpj, EnumTipoPessoa tipoPessoa) {
}
