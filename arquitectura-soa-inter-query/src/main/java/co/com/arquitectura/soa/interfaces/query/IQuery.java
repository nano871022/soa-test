package co.com.arquitectura.soa.interfaces.query;

import javax.ejb.Local;

@Local
public interface IQuery {
	public String query(String sql) throws Exception;

}
