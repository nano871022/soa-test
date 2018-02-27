package co.com.arquitectura.soa.interfaces.local;

import javax.ejb.Local;

@Local
public interface IServicio {
	public String connection(String user, String pass)throws Exception;
	
	public String statement(String sql)throws Exception;
}
