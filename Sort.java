package com.eimacs.lab07;

import java.util.ArrayList;

/**
 *
 * @author IMACS Curriculum Development Group
 * @version 1.0 March 27 2104
 */
public abstract class Sort
{
    public abstract <T extends Comparable<T>> void sortList( ArrayList<T> arr );    
}
