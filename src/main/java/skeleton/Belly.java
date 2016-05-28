package skeleton;

public class Belly {
	
	private int numberOfCukes;
	private int hoursWithoutFood;
	
	public static enum BellyNoise {
		
		SILENCE,
		GROWL,
		I_AM_STARVING_HERE;
		
	}
	
	public void eat(int cukes) {
		this.numberOfCukes += cukes;
	}

	public int getNumberOfCukes() {
		return numberOfCukes;
	}

	public int getHoursWithoutFood() {
		return hoursWithoutFood;
	}

	public void setHoursWithoutFood(int hoursWithoutFood) {
		this.hoursWithoutFood = hoursWithoutFood;
	}
	
	public BellyNoise getBellyNoise() {
		if (hoursWithoutFood < 1) {
			return BellyNoise.SILENCE;
		} else if (hoursWithoutFood < 5) {
			return BellyNoise.GROWL;
		}
		
		return BellyNoise.I_AM_STARVING_HERE;
	}

}