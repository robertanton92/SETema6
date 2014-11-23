package weather.control;

import weather.model.WModel;

public class WControl {
	
	WModel afisare=new WModel();
	
	public int calc_temperatura()
	{
		int temp;
		temp=afisare.random_temp();
		afisare.set_temp(temp);
		return temp;
		
	}
	
	public int calc_vant()
	{
		int vant;
		vant=afisare.random_vant();
		afisare.set_temp(vant);
		return vant;
		
	}

}
