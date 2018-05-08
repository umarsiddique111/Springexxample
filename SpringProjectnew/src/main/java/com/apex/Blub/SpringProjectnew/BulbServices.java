package com.apex.Blub.SpringProjectnew;

public class BulbServices {
	
	Bulb bulb;// = new ABulb();
	
	public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

	public String askforBulb() {
		
		return bulb.getBlub();
	}

}
