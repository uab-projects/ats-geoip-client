package net.webservicex;

public class GeoIPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeoIPService service = new GeoIPService();
		GeoIPServiceSoap port = service.getGeoIPServiceSoap();
		GeoIP response = port.getGeoIP(args[0]);
		System.out.println(
				String.format("The IP location country is %s and its code is %s",
				response.countryName, response.countryCode));
	}
}