package com.algaworks.algamoney.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProperty {
	
	private String origemPermitida = "http://localhost:800";
	private String originPermitida2 = "http://localhost:8000";

	private final Seguranca seguranca = new Seguranca();
	
	public Seguranca getSeguranca() {
		return seguranca;
	}

    

	public String getOrigemPermitida() {
		return origemPermitida;
	}



	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}



	public static class Seguranca {
		
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
		
		
	}

}
