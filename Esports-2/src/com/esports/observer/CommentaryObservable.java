package com.esports.observer;
import java.util.Observable;

public class CommentaryObservable extends Observable implements Commentary {
    private String desc;
    private final String details;
 
    public CommentaryObservable(String details){
        this.details = details;
    }
 
    @Override
    public void description(String desc) {
        this.desc = desc;
        setChanged();
        notifyObservers(desc);
    }
 
    public String detailsComm() {
        return details;
    }
}