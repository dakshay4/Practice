package com.stpl.Hotels;

import java.util.List;

public class HotelService {
	HotelDao hotelDao = null;
	
	public HotelService() {
		hotelDao=new HotelDao();
	}
	public List<Hotel> findRoomAvailibility(String c_in,String c_out) {
		hotelDao.openCurrentSession();
		List<Hotel> hotel=hotelDao.findRoomAvailibility(c_in,c_out);
		return hotel;
	}
}
