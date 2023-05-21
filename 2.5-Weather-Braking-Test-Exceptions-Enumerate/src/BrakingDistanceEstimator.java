/**
 * 
 * @author Phoenix
 * @param weather 		the state of weather
 * @param loadfactor	the amount of passengers on board
 * @param braketemp		the temperature of brakes
 * @return distance		the distance rounded to the nearest integer
 * @throws InvalidBrakingConditionsException	If an invalid weather, loading or braketemp exception occured
 * 
 */

public class BrakingDistanceEstimator {

	private int current_weather = BrakingConditions.WEATHER_DRY;
	private int current_loadfactor = BrakingConditions.LOADING_DRIVERONLY;
	private int current_braketemp = BrakingConditions.BRAKES_COLD;
	
	private String error_invalidweather = "Weather must match one of the constants defined in BrakingConditions class";
	private String error_invalidloading = "Load factor must match one of the constants defined in BrakingConditions class";
	private String error_invalidbraketemp = "Brake temperature msut match one of te constants defined in BrakingConditions class";
	
	private static final double gravity = 9.806; //We'll assume we're driving on Earth...
	
	public BrakingDistanceEstimator(int weather, int loadfactor, int braketemp) throws InvalidBrakingConditionsException {
		//make sure nobody gave us invalid parameters
		if ( weather != BrakingConditions.WEATHER_DRY && 
			 weather != BrakingConditions.WEATHER_DAMP &&
			 weather != BrakingConditions.WEATHER_WET &&
			 weather != BrakingConditions.WEATHER_SNOW ) {
				throw new InvalidBrakingConditionsException(error_invalidweather);
		}
		if ( loadfactor != BrakingConditions.LOADING_DRIVERONLY &&
			 loadfactor != BrakingConditions.LOADING_DRIVER_PASSENGER &&
			 loadfactor != BrakingConditions.LOADING_FULL ) {
				throw new InvalidBrakingConditionsException(error_invalidloading);
		}
		if ( braketemp != BrakingConditions.BRAKES_COLD && 
			 braketemp != BrakingConditions.BRAKES_WARM ) {
				throw new InvalidBrakingConditionsException(error_invalidbraketemp);
		}

		//set the instance variables
		current_weather = weather;
		current_loadfactor = loadfactor;
		current_braketemp = braketemp;
	}
	
	public int getBrakingDistanceFor(int speed) {
		//speed is in KPH, but physicists write their formulas expecting meters per second.		
		int speed_in_ms = (speed * 1000) / 3600; 
		
		//d = v� / 2�g
		double vsquared = Math.pow(speed_in_ms, 2);
		double twomug = 2 * getSurfaceGripCoefficient() * gravity;
		double distance = Math.round(vsquared / twomug); // in meters
		
		if ( current_braketemp == BrakingConditions.BRAKES_COLD ) { distance *= 1.1; }
		if ( current_loadfactor == BrakingConditions.LOADING_DRIVERONLY ) { distance *= 0.9; }
		else if ( current_loadfactor == BrakingConditions.LOADING_FULL) { distance *= 1.2; }
		
		return (int) Math.round(distance);
	}
	
	private double getSurfaceGripCoefficient() {
		if ( current_weather == BrakingConditions.WEATHER_DRY ) { return 0.8; }
		if ( current_weather == BrakingConditions.WEATHER_DAMP ) { return 0.62; }
		if ( current_weather == BrakingConditions.WEATHER_WET ) { return 0.55; }
		if ( current_weather == BrakingConditions.WEATHER_SNOW ) { return 0.3; }
		else { return 0; } //shouldn't happen
	}
}
