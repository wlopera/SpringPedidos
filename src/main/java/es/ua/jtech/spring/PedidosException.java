package es.ua.jtech.spring;

public class PedidosException extends RuntimeException {

	private static final long serialVersionUID = 208163070027541759L;
	
	public PedidosException(String mensaje) {
		super(mensaje);
	}
	
	public PedidosException(Throwable t) {
		super(t);
	}

}

