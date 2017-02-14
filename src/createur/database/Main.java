package createur.database;

import createur.database.SelectDataBaseType.DataBaseType;

public class Main {

	public static void main(String[] args) {

		SelectDataBaseType selectDataBaseType = new SelectDataBaseType();

		Database databaseSQL = selectDataBaseType.getDabase(DataBaseType.SQL);
		
		Connexion connexionSQL = databaseSQL.getConnexion("localhost://data", "login", "password");
		System.out.println(connexionSQL);
		
		connexionSQL = databaseSQL.getConnexion("localhost://data", "login", "password");
		System.out.println(connexionSQL);
		
	}

}
