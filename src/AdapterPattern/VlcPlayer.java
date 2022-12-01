package AdapterPattern;

public class VlcPlayer implements AdvencedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
