class Country{
	String name;
	String countryName;
	String isdCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getIsdCode() {
		return isdCode;
	}
	public void setIsdCode(String isdCode) {
		this.isdCode = isdCode;
	}
	public Country(String name, String countryName, String isdCode) {
		super();
		this.name = name;
		this.countryName = countryName;
		this.isdCode = isdCode;
	}
	void display() {
		System.out.println("Country Name : "+name);
		System.out.println("Country Code : "+countryName);
		System.out.println("ISD Code : "+isdCode);

	}

}