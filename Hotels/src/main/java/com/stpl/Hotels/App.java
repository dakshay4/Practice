package com.stpl.Hotels;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Choices:1. Enter Guest Details\n2. Check Rooms Availability.");
    	Integer ch=Integer.parseInt(sc.nextLine());
    	String in,out;  
    	HotelService hotelService=new HotelService();
    	switch(ch) {
    	case 1:  
    		
    	break;
    	case 2:
    		in=sc.nextLine();
    		out=sc.nextLine();
    		List<Hotel> l = hotelService.findRoomAvailibility(in,out);
    		for(Hotel h:l) {
    			System.out.println(h.getC_in() + "," + h.getC_out());
    		}
    		
    }
}
 
    
}
