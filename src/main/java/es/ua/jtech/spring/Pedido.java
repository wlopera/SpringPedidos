package es.ua.jtech.spring;

public class Pedido {

	private int id;
	private int idCliente;
	private int idProducto;
	private int unidades;
	
	public Pedido(){
		System.out.println("##=> Llamada al constructor Pedido");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", idCliente=" + idCliente + ", idProducto=" + idProducto + ", unidades=" + unidades
				+ "]";
	}
}
