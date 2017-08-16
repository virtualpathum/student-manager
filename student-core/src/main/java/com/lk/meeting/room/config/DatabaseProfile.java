/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author virtualpathum
 * The Class DatabaseProfile.
 */
@Configuration
@Profile("dev")
public class DatabaseProfile {
	
/*	*//** The Constant jndiNamespace. *//*
	public static final String jndiNamespace = "java:comp/env/jdbc/meeting-room";
	
	*//**
	 * Data source.
	 *
	 * @return the data source
	 * @throws NamingException the naming exception
	 *//*
	@Bean(initMethod = "init", destroyMethod = "close")
	public DataSource dataSource() throws NamingException {
		Context ctx = new InitialContext();
		return (DataSource) ctx.lookup(jndiNamespace);
	}*/
	
	

}
