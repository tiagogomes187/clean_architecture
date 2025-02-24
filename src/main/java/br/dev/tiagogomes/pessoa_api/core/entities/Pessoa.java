package br.dev.tiagogomes.pessoa_api.core.entities;

import br.dev.tiagogomes.pessoa_api.core.enums.EnumTipoPessoa;

public record Pessoa(Long id, String nome, String email, String cpfCnpj, EnumTipoPessoa tipo) {
}
