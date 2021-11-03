package br.com.ignisinventum.cadastroveicular.infra.exception;

public class IntegrationRuntimeException extends RuntimeException {

	private static final long serialVersionUID = 7424351311369286024L;

	public IntegrationRuntimeException(String mensagem, Throwable exc) {
		super(mensagem, exc);
	}

	public IntegrationRuntimeException(String mensagem) {
		super(mensagem);
	}

}
