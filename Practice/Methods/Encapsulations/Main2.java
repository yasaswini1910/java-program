package javacore;

class SmartLight {
   
    private int brightness = 99; 

    
    public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public void dimLight() {
        if (brightness > 0) {
            brightness -= 25; 
    }
    }
   
    public int getBrightness() {
        return brightness;
    }
}

public class Main2{
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        
        
        light.dimLight(); 
        System.out.println("Light level: " + light.getBrightness() + "%");

    }
}
