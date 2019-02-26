package com.crea.bdwa1.backend.test;

import com.crea.bdwa1.backend.devclass.Point;
import com.crea.bdwa1.backend.devclass.Triangle;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(0,15);
		Point b = new Point(5, 0);
		Point c = new Point(-5, 0);
		
		Triangle triangle = new Triangle(a,b,c);
		
		triangle.affichage();
		triangle.afficheType();
	}

}
