package createur.database;


public class SelectDataBaseType {
	
	public enum DataBaseType{
		SQL,
		NoSQL
	}
	
	public Database getDabase(DataBaseType dataBaseType){
		if(dataBaseType == DataBaseType.SQL){
			return new SQLDatabase();
		} else {
			return new NoSQLDatabase();
		}
	}

}
