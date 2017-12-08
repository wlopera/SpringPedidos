package es.ua.jtech.spring.negocio;

import org.springframework.stereotype.Service;

import es.ua.jtech.spring.PedidosException;

@Service
public class PedidosBOSimple implements IPedidosBO {

	private static int cantidadMaxima = 50;

	public PedidosBOSimple() {
		System.out.println("##=> Creando Objeto PedidosBOSimple - cantidadMaxima: " + cantidadMaxima);
	}

	public void insertarPedido(int idCliente, int idProducto, int unidades) throws PedidosException {
		if (unidades > cantidadMaxima) {
			System.out.println("##=> Cantidad pedida supera la cantidad máxima");
			throw new PedidosException("Cantidad pedida supera la cantidad máxima");
		} else {
			System.out.println("Pedido realizado");
		}
	}

	public void setCantidadMaxima(int max) {
		// TODO Auto-generated method stub

	}

	public int getCantidadMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

}
