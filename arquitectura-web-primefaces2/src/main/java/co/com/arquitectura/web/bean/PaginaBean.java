package co.com.arquitectura.web.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.arquitectura.soa.interfaces.remoto.IServicioRemoto;
@ManagedBean(name="paginaBean")
@ViewScoped
public class PaginaBean {

	private String valor;
	@EJB(lookup="java:jboss/exported/Ear-prime/arquitectura-soa/Servicios!co.com.arquitectura.soa.interfaces.remoto.IServicioRemoto")
	private IServicioRemoto servicio;
	

	public PaginaBean() {
		valor = "web";
	}
	public String getServicio() {
		try {
			return servicio.login("user2", "pass2");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Fallo";
	}
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
