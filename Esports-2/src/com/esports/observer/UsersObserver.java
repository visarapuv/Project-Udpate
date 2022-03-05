package com.esports.observer;

import java.util.Observable;

public class UsersObserver implements java.util.Observer{
 
    private String desc;
    private final String userInfo;
    private final Observable observable;
 
    public UsersObserver(Observable observable,String userInfo){
        this.observable = observable;
        this.userInfo = userInfo;
    }
 
    public void subscribe() {
    	System.out.println("");
        System.out.println("Subscribing "+userInfo+" to "+((CommentaryObservable)(observable)).detailsComm()+" ...");
        this.observable.addObserver(this);
        System.out.println("Subscribed successfully.");
    }
 
    public void unSubscribe() {
    	System.out.println("");
        System.out.println("Unsubscribing "+userInfo+" to "+((CommentaryObservable)(observable)).detailsComm()+" ...");
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribed successfully.");
        System.out.println("");
    }
 
    @Override
    public void update(Observable o, Object arg) {
            desc = (String)arg;
            display();
    }
 
    private void display(){
        System.out.println("["+userInfo+"]: "+desc);
    }
 
}