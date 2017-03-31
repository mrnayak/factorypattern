package factory;

public class PostCodeFactory {
	enum Country {
		US, UK, IN;
	}
	
	public static PostCode getInstance(Country country, String postalCode)
	{
		if (country == Country.US)
			return new ______________; //> 1
		if (country == Country.UK)
			return new ______________; //> 2
		if (country == Country.IN)
			return new ______________; //> 3
		
		return null;
	}
}
