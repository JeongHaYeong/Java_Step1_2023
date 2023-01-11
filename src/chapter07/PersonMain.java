package chapter07;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p=new Person("홍길동",180,67);
		
		System.out.println("이름 : "+p.name);
		System.out.println("키 : "+(int)p.height);
		System.out.println("몸무게 : "+(int)p.weight);	
		System.out.println("-------------------------------------");
		
		Person q=new Person("강감찬",176,72);
		System.out.println("이름 : "+q.name);
		System.out.println("키 : "+(int)q.height);
		System.out.println("몸무게 : "+(int)q.weight);	
		System.out.println("-------------------------------------");
		
		Person z=new Person("이순신",168,57);
		System.out.println("이름 : "+z.name);
		System.out.println("키 : "+(int)z.height);
		System.out.println("몸무게 : "+(int)z.weight);	
	}//main

}//class
