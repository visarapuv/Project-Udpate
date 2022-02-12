package com.esports;


public abstract class EsportTemplate {
    
	public abstract void teams();
 
    public abstract void players();
 
    public abstract void tournments();
	
	public abstract void results();
	
	public abstract void schedule();
	
	public abstract void prize();
 
	public final void esportStructure()
    {
		tournments();
		schedule();
		teams();
		players();
		results();
		prize();
    }
}