package finalExam;

public class VinylAlbum {
	   int formatMusic;
	   int playingLength;
	   boolean specialOrder;
	  
	   public VinylAlbum(String tempSplit, String tempSplit2, int formatMusic, Double double1, int playingLength, Integer integer, boolean specialOrder) {
	       this.formatMusic = formatMusic;
	       this.playingLength = playingLength;
	       this.specialOrder = specialOrder;
	   }

	   public int getFormatMusic() {
	       return formatMusic;
	   }

	   public void setFormatMusic(int formatMusic) {
	       this.formatMusic = formatMusic;
	   }

	   public int getPlayingLength() {
	       return playingLength;
	   }

	   public void setPlayingLength(int playingLength) {
	       this.playingLength = playingLength;
	   }

	   public boolean isSpecialOrder() {
	       return specialOrder;
	   }

	   public void setSpecialOrder(boolean specialOrder) {
	       this.specialOrder = specialOrder;
	   }

	   @Override
	   public String toString() {
	       return "Vinyl_Album [formatMusic=" + formatMusic + ", playingLength=" + playingLength + ", specialOrder="
	               + specialOrder + "]";
	   }
}
