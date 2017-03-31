package factory;

public class PostCodeFactory {
	enum Country {
		US, UK, IN;
	}
	
	public static PostCode getInstance(Country country, String postalCode)
	{
		if (country == Country.US)
			return new USPostCode(postalCode);
		if (country == Country.UK)
			return new UKPostCode(postalCode);
		if (country == Country.IN)
			return new INPostCode(postalCode);
		
		return null;
	}
}
