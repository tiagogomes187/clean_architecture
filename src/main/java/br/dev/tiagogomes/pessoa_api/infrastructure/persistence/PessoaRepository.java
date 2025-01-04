package br.dev.tiagogomes.pessoa_api.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
	PessoaEntity findByCpfCnpj (String cpfCnpj);
}
