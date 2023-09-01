package org.session11.onlinepractice.abstractionpractice;

public interface Playable {

    public abstract void play();
    void stop();

}

class Music implements Playable{


    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped");
    }
}

class Video implements Playable{


    @Override
    public void play() {
        System.out.println("Video is playing");
    }

    @Override
    public void stop() {
        System.out.println("Video has stopped");
    }
}
