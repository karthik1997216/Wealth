package com.bike;

public class Evehicle implements Ebike,Ecar  {

	@Override
	public void price() {
		System.out.println("price 2lakhs");
		
	}

	@Override
	public void milege() {
		System.out.println("milege 50kmpl");
		
	}

	@Override
	public void speed() {
		System.out.println("speed 100kmph");
		
	}
	public void location() {
		System.out.println("coimbatore");
	}
	public void brand() {
		System.out.println("NINJA");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> 1ba8a322a9ca355c2c6a897e737d90660e2599b2
	public static void main(String [] args) {
		Evehicle e = new Evehicle();
		e.milege();
		e.price();
		e.speed();
		e.location();
		e.brand();
	}

}
