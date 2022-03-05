package com.esports.template;


public abstract class EsportTemplate {
    
	public abstract void teams();
 
    public abstract void players();
 
    public abstract String tournments();
	
	public abstract void results();
	
	public abstract void schedule();
	
	public abstract void prize();
 
	public final String esportStructure()
    {
		String tournmentName = tournments();
		schedule();
		teams();
		players();
		results();
		prize();
		return tournmentName;
    }
}