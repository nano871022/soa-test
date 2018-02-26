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
//	@Resource(lookup="java:global/Ear-prime/arquitectura-soa/Servicios!co.com.arquitectura.soa.interfaces.local.IServicio")
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
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
