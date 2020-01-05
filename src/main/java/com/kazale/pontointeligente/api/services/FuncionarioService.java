package com.kazale.pontointeligente.api.services;

import java.util.Optional;

import com.kazale.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiste um funcionrio na base de dados.
	 * 
	 * @param funcionario
	 * @return Funcionario
	 */
	
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionario dado um CPF.
	 * 
	 * @param cpf
	 * @param Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e rettorna um funcionario dado um email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscaporEmail(String email);
	
	/**
	 * Busca e retorna um funcionario por ID
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 */	
	Optional<Funcionario> buscaPorId(Long id);

}
