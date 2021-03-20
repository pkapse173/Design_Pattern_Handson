package design_SingletonFactory;

public class DBConn {
	
	private static DBConn instance = new DBConn();
	
	private DBConn() {
		
	}
	
	public static DBConn getinstance()
	{
		return instance;
	}

}
