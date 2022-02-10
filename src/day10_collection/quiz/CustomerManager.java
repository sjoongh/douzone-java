package day10_collection.quiz;

import java.util.*;
public class CustomerManager extends Customer{  //controller
	//
	ArrayList<Customer> list = new ArrayList<Customer>();
	
	//
	CustomerManager(){
	}
	//생성자함수 객체생성시 자동호출됨 - 명시적으로 호출 불가능
	CustomerManager(String name, String add, String tel){
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}
	
	//추가 함수
	public void CustomerAdd(String name, String add, String tel){  //추가
		Customer c = new Customer(name, add, tel);
		list.add(c);
	}
	//삭제
	public void CustomerRmv(int i){   // 삭제
		System.out.println("\n\n* 삭제된 고객");
		list.get(i-1).display();
		System.out.println("--------------");
		list.remove(i-1);
	}
	
	public void CustomerCh(int i, String name, String add, String tel){  // 수정
		//list.get(i-1).display();
		Customer c = new Customer(name, add, tel);
		list.set(i-1, c);  // 교체
	}
	
	public void display(){
		System.out.println("저장된 고객 수 : " + list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println();
			System.out.println("- " + (i+1) + "번 -");
			list.get(i).display();
		}// for
	}// display()
}// CustomerManager
