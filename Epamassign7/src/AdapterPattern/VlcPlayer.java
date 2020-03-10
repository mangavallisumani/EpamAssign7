package AdapterPattern;
public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String f) {
      System.out.println("Playing vlc file. Name: "+ f);		
   }

   @Override
   public void playMp4(String f) {
      //do nothing
   }
}