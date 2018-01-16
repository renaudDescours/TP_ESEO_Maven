package eseo.servlet;
import java.sql.*;

public class VilleDisplay {
	
	
	public double getDistance(double lat1, double lng1, double lat2, double lng2) {
		double earth_radius = 6378137;   // Terre = sphère de 6378km de rayon
		double rlo1 = deg2rad(lng1);    // CONVERSION
		double rla1 = deg2rad(lat1);
		double rlo2 = deg2rad(lng2);
		double rla2 = deg2rad(lat2);
		double dlo = (rlo2 - rlo1) / 2;
		double dla = (rla2 - rla1) / 2;
		double a = (Math.sin(dla) * Math.sin(dla)) + Math.cos(rla1) * Math.cos(rla2) * (Math.sin(dlo) * Math.sin(dlo));
		double d = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		return (earth_radius * d)/1000;
	}
	
	double deg2rad(double x){
		return Math.PI*x/180.0;
	}
}