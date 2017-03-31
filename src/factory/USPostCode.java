package factory;

public class USPostCode implements PostCode{
    String postalCode;
    
	public USPostCode(String postalCode)
    {
    	if(!_______________(postalCode)) { //> 5
    		throw new IllegalArgumentException("Invalid postcode");
    	}
    	
    	this.postalCode = postalCode;
    }
	
	@Override
	public boolean _____________(String postalCode) { //> 6
		return postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$");
	}

}
