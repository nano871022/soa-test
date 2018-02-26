package co.com.arquitectura.soa.dbconnect;

import javax.ejb.Stateless;

import co.com.arquitectura.soa.interfaces.query.IQuery;
@Stateless
public class Query implements IQuery {

	@Override
	public String query(String sql) throws Exception {
		return "Enviado: "+sql;
	}

}
