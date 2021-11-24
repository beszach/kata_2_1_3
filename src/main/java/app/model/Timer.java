package app.model;

public class Timer {

    public Timer(){
    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
