package weather.model;

import java.util.Random;

import weather.inter.IModel;

public class WModel implements IModel{
	
	public int vant=0;
	public int temperatura=0;
	public int random_temp(){
		int temp;
		
		Random var2=new Random();
		temp=(var2.nextInt(60+60)+1)-60;
		return temp;
	}
	public int  random_vant(){
		int v_vant;
		
		Random var1=new Random();	
		v_vant=(var1.nextInt(80)+65);
		return v_vant;
	}
	public void set_vant(int v){
		vant=v;
		
		
	}
	public void set_temp(int t){
		temperatura=t;		
	}
	
}
