package structural.adapter;

//Using the adapter example that we implemented, lets have a new adapter class and support avi format.
public class AviPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Plaing avi file. name:" +fileName);

    }
}
