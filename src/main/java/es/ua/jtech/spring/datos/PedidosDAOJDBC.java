package es.ua.jtech.spring.datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import es.ua.jtech.spring.PedidosException;

@Repository("JDBC")
public class PedidosDAOJDBC implements IPedidosDAO {

	@Autowired
	private DataSource ds;

	public PedidosDAOJDBC() {
		System.out.println("##=> Llamada al constructor PedidosDAOJDBC");
	}

	public void insertarPedido(int idCliente, int idProducto, int unidades) {
		Statement sql;
		Connection con = null;

		try {
			// Hacemos uso de DataSoureceUtils para que Spring gestione la conexion
			con = DataSourceUtils.getConnection(ds);
			// crear registro en la tabla de pedidos
			sql = con.createStatement();
			sql.execute("insert into pedidos values(default, " + idCliente + "," + idProducto + "," + unidades + ")");
		} catch (SQLException sqle) {
			throw new PedidosException(sqle);
		} finally {
			if (con != null) {
				// con.close();
				// Hacemos uso de DataSourceUtils para que Spring gestione la conexion
				DataSourceUtils.releaseConnection(con, ds);
			}
		}

	}

}
