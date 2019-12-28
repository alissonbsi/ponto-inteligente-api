package com.kazale.pontointeligente.api.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kazale.pontointeligente.api.entities.Empresa;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpresaRepositoryTest {

	@Autowired
	private EmpresaRepository empresaRepository;

	private static final String CNPJ = "51463645000100";

	@Before
	public void setUp() throws Exception {
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Empresa Exemplo");
		empresa.setCnpj(CNPJ);
		this.empresaRepository.save(empresa);

	}

	@After
	public final void tearDown() {
		this.empresaRepository.deleteAll();
	}

	@Test
	public void testBuscaPorCnpj() {

		Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);

		assertEquals(CNPJ, empresa.getCnpj());
	}

}
