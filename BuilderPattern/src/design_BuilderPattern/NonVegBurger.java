package design_BuilderPattern;

public class NonVegBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.0f;
	}
	

}
