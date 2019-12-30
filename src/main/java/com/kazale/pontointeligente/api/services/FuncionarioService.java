package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste um funcion�rio na base de dados.
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcion�rio dado um CPF.
	 * 
	 * @param cpf
	 * @param Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e rettorna um funcion�rio dado um email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscaporEmail(String email);
	
	/**
	 * Busca e retorna um funcion�rio por ID
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */	
	Optional<Funcionario> buscaPorId(Long id);

}
