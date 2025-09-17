package music_player.java;
 interface media {
	void play();
	void stop();
	default void pause() {
	   System.out.println("Media Paused");
	   
	}
	static void about() {
		System.out.println("This is a media interface");
	}

}
 interface AdvancedMedia extends media{
	 void nextTrack();
	 
 }
 class music_player implements AdvancedMedia{
	 public void play() {
		 System.out.println("Music Started");
		 
	 }
	 public void stop() {
		 System.out.println("Music Stopped");
	 
 }
	 public void nextTrack() {
		 System.out.println("Next Song");
	 }
	 
public class interfacedemo {
	public static void main(String[] args) {
		music_player music = new music_player();
		
	music.play();
	music.nextTrack();
	music.pause();
	media.about();
	music.stop();		
		}

}
}
 
