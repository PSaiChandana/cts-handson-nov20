
public class EmployeeDaoImpl implements EmployeeDao {
	
	private DBConfig dbConfig;

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

	public void store() {
		System.out.println("Calling from the DAO");
		System.out.println(dbConfig.getDbName()+" "+dbConfig.getDbUrl());
	}
}
