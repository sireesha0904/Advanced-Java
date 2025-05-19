package Abstraction;

interface Camera {
	
	void takePhoto();
	
	default void cameraInfo() {
		System.out.println("This is a Camera Interface...");
	}
}

interface MusicPlayer {
	void playMusic();
	
	default void musicInto() {
		System.out.println("This is a Music Player interface.");
	}
}

class SmartPhone implements Camera, MusicPlayer{
	
	public void takePhoto() {
		System.out.println("Taking a photo...");
	}
	public void playMusic() {
		System.out.println("Playing music...");
	}
	
    public void cameraInfo() {
        System.out.println("Smartphone camera is high resolution.");
    }

    public void musicInfo() {
        System.out.println("Smartphone supports multiple music formats.");
    }
	
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		SmartPhone c = new SmartPhone();
		c.takePhoto();
		c.playMusic();
		c.cameraInfo();
		c.musicInfo();
		
		
}
}
