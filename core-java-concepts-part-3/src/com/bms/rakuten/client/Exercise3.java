package com.bms.rakuten.client;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

	public Exercise3() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		List<Student> st=new LinkedList<Student>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			String name=sc.next();
			System.out.println("Enter the score");	
			int score=sc.nextInt();
			st.add(new Student(name,score));
		}
		Comparator<Student> cp=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getScore()-o1.getScore();
			}
			
		};
		Collections.sort(st,cp);
		System.out.println(st);
	}

}
class Student{
	String name=null;
	int score=0;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
	
}
