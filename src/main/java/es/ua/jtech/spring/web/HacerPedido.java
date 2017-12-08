package es.ua.jtech.spring.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import es.ua.jtech.spring.PedidosException;
import es.ua.jtech.spring.negocio.IPedidosBO;

@WebServlet("/hacerPedido")
public class HacerPedido extends HttpServlet {

	private static final long serialVersionUID = -5099441552539302487L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		try {
			int idCliente = Integer.valueOf(req.getParameter("idCliente").toString());
			int idProducto = Integer.valueOf(req.getParameter("idProducto").toString());
			int unidades = Integer.valueOf(req.getParameter("unidades").toString());

			ServletContext sc = getServletContext();
			WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(sc);

			IPedidosBO iub = wac.getBean(IPedidosBO.class);
			iub.insertarPedido(idCliente, idProducto, unidades);

			resp.setContentType("text/plain");

			pw.println("Pédido insertado con Éxito");
		} catch (PedidosException pe) {
			pw.println("##=> " + pe.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("##=> Error inesperado del sistema: " + e.getMessage());
			pw.println("##=> Error inesperado del sistema: "+ e.getMessage());			
		} finally {
			pw.close();
		}
	}
}
