package co.com.arquitectura.soa;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.com.arquitectura.soa.interfaces.local.IServicio;
import co.com.arquitectura.soa.interfaces.query.IQuery;
import co.com.arquitectura.soa.interfaces.remoto.IServicioRemoto;
@Stateless
public class Servicios implements IServicio, IServicioRemoto {
	@EJB
	private IQuery query;
	@Override
	public String login(String user, String pass) throws Exception {
		return "Login por remoto "+user+" ; "+pass;
	}

	@Override
	public String connection(String user, String pass) throws Exception {
		return "Coneccion por local"+user+" ; "+pass;
	}

}
