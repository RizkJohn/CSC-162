package finalExam;

public class MP3 extends Music{
	   int formatMusic;
	   int playingLength;
	   boolean specialOrder;
	  
	   MP3(String mId, String disItNa, int invenQuan, double itemPr) {
	       super(mId, disItNa, invenQuan, itemPr);
	   }

	   public MP3(String mId, String disItNa, int invenQuan, double itemPr, int formatMusic, int playingLength,
			   boolean specialOrder) {
	       		super(mId, disItNa, invenQuan, itemPr);
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
	       return "MP3 [ musicID = " + musicID + ", displayItemName = " + displayItemName + ", inventoryQuantity = "+ inventoryQuantity +
	           ", itemPrice = " + itemPrice + "formatMusic = " + formatMusic + ", playingLength = " + playingLength + ", specialOrder = "
	               + specialOrder + "]";
	   }
}
