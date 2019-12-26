package com.kazale.pontointeligente.api.utils;

import org.slf4j.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gera um hash utilizando BCrypt
	 * 
	 * @param senha
	 * @return string
	 */
	
	public static String gerarBCrypt(String senha) {
		if(senha == null)
			return senha;
		
		log.info("Gerando hash com BCrypt.");
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
		
	}
	
}
