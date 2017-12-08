package es.ua.jtech.spring.datos;

public interface IPedidosDAO {
	
	public void insertarPedido(int idCliente, int idProducto, int unidades);

}
