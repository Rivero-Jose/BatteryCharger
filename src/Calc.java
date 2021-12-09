import javax.swing.ImageIcon;
import java.util.Random;
import javax.swing.JOptionPane;

public class Calc {
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
		
	}
	public void start(){
	 	msg("This is the Battery Charger program, chose from 1 of 5 electronics to figure out \n" +
	 			"Both cost of charging and charging time. \n" +
	 			"Simple to use, have fun with this program.");
	 	home();
	}
	//                           0    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15   16   17   18   19   20   21   22   23   24
	private int[] ratePhone = {170, 150, 120, 130, 130, 140, 150, 170, 170, 180, 185, 190, 200, 210, 220, 230, 230, 220, 210, 200, 190, 190, 180, 180};
	private int[] rateCar = {2700, 2500, 2300, 2350, 2400, 2500, 2700, 2900, 3000, 3200, 3550, 3600, 3700, 3900, 4000, 3700, 3400, 3400, 3300, 3200, 3150, 3100, 3000, 2900};
	private int[] rateLightBulb = {25, 21, 15, 17, 19, 18, 20, 21, 23, 25, 24, 27, 25, 30, 32, 36, 40, 45, 50, 47, 36, 31, 26, 27};
	private int[] rateLaptop = {310, 300, 260, 270, 290, 310, 330, 330, 350, 350, 375, 400, 410, 420, 430, 470, 500, 510, 490, 440, 400, 360, 330, 320};
	private int[] rateTV = {180, 140, 110, 120, 132, 145, 160, 170, 180, 190, 185, 200, 205, 230, 240, 250, 255, 270, 250, 240, 235, 210, 195, 187};
	
	ImageIcon BLUB = new ImageIcon(Calc.class.getResource("BULB.png"));
	ImageIcon CAR = new ImageIcon(Calc.class.getResource("CAR.png"));
	ImageIcon LAPTOP = new ImageIcon(Calc.class.getResource("LAPTOP.png"));
	ImageIcon PHONE = new ImageIcon(Calc.class.getResource("PHONE.png"));
	ImageIcon TV = new ImageIcon(Calc.class.getResource("TV.png"));
	ImageIcon QUIT = new ImageIcon(Calc.class.getResource("QUIT.png"));
	
	public void home(){
		ImageIcon[] DATA = { PHONE, CAR ,BLUB, LAPTOP, TV, QUIT};
		int x = JOptionPane.showOptionDialog(null, "Battery Charger program, Prices are based of real life prices, so they may be higher or lower than you expected \n" +
				"Your recomeneded time is 2 am in the morning for all devices based on real life research. Your most expensive times would be the mid-day to afternoon 11am~4pm", "BATTERY CHARGER", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			Phone();
		}if(x == 1){
			Car();
		}if(x == 2){
			Light();
		}if(x == 3){
			Laptop();
		}if(x == 4){
			TV();
		}if(x == 5){
			System.exit(0);
		}
		
		
	
	}
	
	
	public void Phone (){
		String[] DATA = {"Cost for Phone", "Charging Time", "Back","Quit"};
		int x = JOptionPane.showOptionDialog(null, "Phone Cost total : " + I + 
				"\n Charging Time Total : " + J + 
				"\n Recommened start time 2am","BATTERY CHARGER", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			getCostPhone((int)number(), (int)number2());
			Phone();
		}if(x == 1){
			getTimePhone((int)number2());
			Phone();
		}if(x == 2){
			I = 0;
			J = 0;
			home();
		}if(x == 3){
			System.exit(0);
		}
		
	}
	
	public void Car (){
		String[] DATA = {"Cost for Car", "Charging Time", "Back","Quit"};
		int x = JOptionPane.showOptionDialog(null, "Car Cost total : " + I + 
				"\n Charging Time Total : " + J + 
				"\n Recommened start time 2am", "BATTERY CHARGER", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			getCostCar((int)number(), (int)number2());
			Car();
		}if(x == 1){
			getTimeCar((int)number2());
			Car();
		}if(x == 2){
			I = 0;
			J = 0;
			home();
		}if(x == 3){
			System.exit(0);
		}
	}
	
	public void Light (){
		String[] DATA = {"Cost for Light bulb", "Charging Time", "Back","Quit"};
		int x = JOptionPane.showOptionDialog(null, "Light bulb Cost total : " + I + 
				"\n Charging Time Total : " + J + 
				"\n Recommened start time 2am", "BATTERY CHARGER", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			getCostLightBulb((int)number(), (int)number2());
			Light();
		}if(x == 1){
			getTimeLightBulb((int)number2());
			Light();
		}if(x == 2){
			I = 0;
			J = 0;
			home();
		}if(x == 3){
			System.exit(0);
		}
	}
	
	public void Laptop (){
		String[] DATA = {"Cost for Laptop", "Charging Time", "Back","Quit"};
		int x = JOptionPane.showOptionDialog(null, "Laptop Cost total : " + I + 
				"\n Charging Time Total : " + J + 
				"\n Recommened start time 2am", "BATTERY CHARGER", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			getCostLaptop((int)number(), (int)number());
			Laptop();
		}if(x == 1){
			getTimeLaptop((int)number());
			Laptop();
		}if(x == 2){
			I = 0;
			J = 0;
			home();
		}if(x == 3){
			System.exit(0);
		}
	}
	
	public void TV (){
		String[] DATA = {"Cost for TV", "Charging Time", "Back","Quit"};
		int x = JOptionPane.showOptionDialog(null, "TV Cost total : " + I + 
				"\n Charging Time Total : " + J + 
				"\n Recommened start time 2am", "BATTERY CHARGER", 0,
				JOptionPane.INFORMATION_MESSAGE, null, DATA, DATA);
		if(x == 0){
			getCostTV((int)number(), (int)number());
			TV();
		}if(x == 1){
			getTimeTV((int)number());
			TV();
		}if(x == 2){
			I = 0;
			J = 0;
			home();
		}if(x == 3){
			System.exit(0);
		}
	}
	
	double I = 0;
	double J = 0;
	public double number() {
		String s = JOptionPane.showInputDialog("Enter starting hour");
		double d = Double.parseDouble(s);
		return d;
	}
	public double number2() {
		String s = JOptionPane.showInputDialog("Enter charging time");
		double d = Double.parseDouble(s);
		return d;
	}

	public int getCostPhone(int startHour, int chargeTime)
	{
	 int cost = 0;
	 for (int x = 0; x < chargeTime; x++)
	 {
	 cost += this.ratePhone[(startHour + x) % 24];
	 }
	 I = (double)cost/100;
	 return cost;
	} 
	public int getTimePhone(int chargeTime)
	{
	 int startTime = 0;
	 for (int i = 1; i < 24; i++)
	 {
	 if (this.getCostPhone(i, chargeTime)
	 < this.getCostPhone(startTime, chargeTime))
	 {
	 startTime = i;
	 }
	 }
	 J = chargeTime;
	 return startTime;
	}
	
	public int getCostCar(int startHour, int chargeTime)
	{
	 int cost = 0;
	 for (int x = 0; x < chargeTime; x++)
	 {
	 cost += this.rateCar[(startHour + x) % 24];
	 }
	 I = (double)cost/100;
	 return cost;
	} 
	public int getTimeCar(int chargeTime)
	{
	 int startTime = 0;
	 for (int i = 1; i < 24; i++)
	 {
	 if (this.getCostCar(i, chargeTime)
	 < this.getCostCar(startTime, chargeTime))
	 {
	 startTime = i;
	 }
	 }
	 J = chargeTime;
	 return startTime;
	}
	
	public int getCostLightBulb(int startHour, int chargeTime)
	{
	 int cost = 0;
	 for (int x = 0; x < chargeTime; x++)
	 {
	 cost += this.rateLightBulb[(startHour + x) % 24];
	 }
	 I = (double)cost/100;
	 return cost;
	} 

	public int getTimeLightBulb(int chargeTime)
	{
	 int startTime = 0;
	 for (int i = 1; i < 24; i++)
	 {
	 if (this.getCostLightBulb(i, chargeTime)
	 < this.getCostLightBulb(startTime, chargeTime))
	 {
	 startTime = i;
	 }
	 }
	 J = chargeTime;
	 Light();
	 return startTime;
	}
	
	public int getCostLaptop(int startHour, int chargeTime)
	{
	 int cost = 0;
	 for (int x = 0; x < chargeTime; x++)
	 {
	 cost += this.rateLaptop[(startHour + x) % 24];
	 }
	 I = (double)cost/100;
	 return cost;
	} 
	public int getTimeLaptop(int chargeTime)
	{
	 int startTime = 0;
	 for (int i = 1; i < 24; i++)
	 {
	 if (this.getCostLaptop(i, chargeTime)
	 < this.getCostLaptop(startTime, chargeTime))
	 {
	 startTime = i;
	 }
	 }
	 J = chargeTime;
	 return startTime;
	}
	
	public int getCostTV(int startHour, int chargeTime)
	{
	 int cost = 0;
	 for (int x = 0; x < chargeTime; x++)
	 {
	 cost += this.rateTV[(startHour + x) % 24];
	 }
	 I = (double)cost/100;
	 return cost;
	} 
	public int getTimeTV(int chargeTime)
	{
	 int startTime = 0;
	 for (int i = 1; i < 24; i++)
	 {
	 if (this.getCostTV(i, chargeTime)
	 < this.getCostTV(startTime, chargeTime))
	 {
	 startTime = i;
	 }
	 }
	 J = chargeTime;
	 return startTime;
	}
	
}

