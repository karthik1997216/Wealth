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
	public static void main(String [] args) {
		Evehicle e = new Evehicle();
		e.milege();
		e.price();
		e.speed();
		e.location();
	}

}
