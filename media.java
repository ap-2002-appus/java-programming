package music_player.java;

public interface media {
	void play();
	void stop();
	default void pause() {
	   System.out.println("Media Paused");
	   
	}
	static void about() {
		System.out.println("This is a media interface");
	}

}
public class InterfaceDemo {
	public static void main(String[] args) {
		
	}
}