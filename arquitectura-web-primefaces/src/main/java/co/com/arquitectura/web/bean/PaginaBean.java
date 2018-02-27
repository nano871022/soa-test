package co.com.arquitectura.web.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.arquitectura.soa.interfaces.local.IServicio;
import co.com.arquitectura.soa.interfaces.query.IQuery;
@ManagedBean(name="paginaBean")
@ViewScoped
public class PaginaBean {

	private String valor;
	@EJB
	private IServicio servicio;
	@EJB
	private IQuery query;
	

	public PaginaBean() {
		valor = "web";
	}
	public String getServicio() {
		try {
			return servicio.connection("user", "pass");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Fallo";
	}
	public String getSql() {
		
		try {
			return query.query("select *");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error";
	}
	public String getStatement() {
		try {
			return servicio.statement("select  1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
