package es.ua.jtech.spring.negocio;

import es.ua.jtech.spring.PedidosException;

public interface IPedidosBO {

	public void insertarPedido(int idCliente, int idProducto, int unidades) throws PedidosException;

	public void setCantidadMaxima(int max);

	public int getCantidadMaxima();

}
