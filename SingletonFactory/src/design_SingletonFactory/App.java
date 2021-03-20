package design_SingletonFactory;

public class App {

	public static void main(String[] args) {
		System.out.println(DBConn.getinstance().hashCode());
		System.out.println(DBConn.getinstance().hashCode());
		System.out.println(DBConn.getinstance().hashCode());

	}

}
