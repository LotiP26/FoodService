package com.cogent.fooddeliveryapp.utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl {
//tophysicalmethod - override is helps us to modify the table name 
	//Identifier will bring existing table name or details
	//JDBC dtabase related 
	//.getText will retrive table will take class name or table name
	@Override
	public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
		// TODO Auto-generated method stub
		String newName = name.getText().concat("_TBL");
		
		return Identifier.toIdentifier(newName);
				
	}
}