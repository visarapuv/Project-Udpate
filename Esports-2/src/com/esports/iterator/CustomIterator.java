package com.esports.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomIterator
{
    String[] al;
  
    int index = 0;
  
    public  CustomIterator (String[] al)
    {
        this.al = al;
    }
  
    public Object next()
    {
    	return (String) al[index++];
    }
  
    public boolean hasNext()
    {
        if (index >= al.length || 	al[index] == null)
            return false;
        else
            return true;
    }
}