package co.com.arquitectura.soa.interfaces.remoto;

import javax.ejb.Remote;

@Remote
public interface IServicioRemoto {
	public String login(String user, String pass)throws Exception;
}
