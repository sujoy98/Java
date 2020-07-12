package com.main;

public class Main {

	public static void main(String[] args) {
		PrivateBank pb=new PrivateBank("SUJOY");
		pb.interest_paid();
		GovBank gb=new GovBank("SUJOY");
		gb.interest_paid();
	}
}
