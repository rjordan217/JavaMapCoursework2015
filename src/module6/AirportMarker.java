package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	private int ident;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
		ident = Integer.parseInt(city.getId());
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		if(!clicked) {
			pg.fill(11);
		}
		else {
			pg.fill(255, 0, 0);
		}
		pg.ellipse(x, y, 5, 5);
		
		
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		
		// show routes
		
		
	}
	
	public int getIdent() {
		return ident;
	}
	
	public void setIdent(int val) {
		ident = val;
	}
	
	public String getCode() {
		return (String) getProperty("code");
	}
}