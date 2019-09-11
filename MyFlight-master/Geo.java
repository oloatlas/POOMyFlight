package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double distancia(Geo p2)
	{
		// Não precisa: this já retorna uma ref. ao próprio objeto
		//Geo p1 = new Geo(latitude, longitude);
		return distancia(this, p2);
	}
	
	public static double distancia(Geo p1, Geo p2) {
		double lat1 = p1.latitude;
		double lon1 = p1.longitude;
		double lat2 = p2.latitude;
		double lon2 = p2.longitude;
		double dLat = Math.toRadians(lat1-lat2)/2.0;
		double dLon = Math.toRadians(lon1-lon2)/2.0;
		lat1 = Math.toRadians(lat1);
		lat2 = Math.toRadians(lat2);
		double s = Math.sqrt(Math.pow(Math.sin(dLat),2)
				+ Math.pow(Math.sin(dLon), 2)
				* Math.cos(lat1)
				* Math.cos(lat2));
		double d = 2 * 6371 * Math.asin(s);
		return d;
	}
	
	@Override
	public String toString() {
		String lat = ""+latitude;
		String lon = ""+longitude;
		if(latitude < 0)
			lat = -latitude+" S";
		else lat = latitude+" N";
		if(longitude < 0)
			lon = -longitude+" W";
		else lon = longitude+" E";
		return "("+lat+", "+lon+")";
	}
	
	
	
	
	
	
	
	
	
}
