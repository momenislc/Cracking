package chapter3.Tests;

import static org.junit.Assert.*;


import org.junit.Test;

import chapter3.AnimalShelter;
import chapter3.Cat;
import chapter3.Dog;
import chapter3.Animal;

public class AnimalShelterTests {

	@Test
	public void test() {
		AnimalShelter aS = new AnimalShelter();
		
		Cat c1 = new Cat("c1");
		Cat c2 = new Cat("c2");
		Dog d1 = new Dog("d1");
		Dog d2 = new Dog("d2");
		
		aS.enqueue(c1);
		aS.enqueue(d1);
		aS.enqueue(c2);
		aS.enqueue(d2);
		
		Animal a = aS.dequeueAny();
		assertTrue(a.getName().equals("c1"));
		
		Animal a2 = aS.dequeueDog();
		System.out.println(a2.getName());
		assertTrue(a2.getName().equals("d1"));
		assertTrue(a2.getName().equals("d1"));
	}
	
	@Test
	public void test2() {
		AnimalShelter aS = new AnimalShelter();
		
		Dog d1 = new Dog("d1");
		Dog d2 = new Dog("d2");
		Dog d3 = new Dog("d3");
		Dog d4 = new Dog("d4");
		
		aS.enqueue(d1);
		aS.enqueue(d2);
		aS.enqueue(d3);
		aS.enqueue(d4);
		
		for(int i = 0; i < 4; i++){
			Animal a = aS.dequeueDog();
			System.out.println(a.getName());
			assertTrue(a.getName().equals("d" + (i+1)));
		}	
	}
	
	@Test
	public void test3() {
		AnimalShelter aS = new AnimalShelter();
		
		Cat c1 = new Cat("c1");
		Cat c2 = new Cat("c2");
		Cat c3 = new Cat("c3");
		Cat c4 = new Cat("c4");
		
		aS.enqueue(c1);
		aS.enqueue(c2);
		aS.enqueue(c3);
		aS.enqueue(c4);
		
		for(int i = 0; i < 4; i++){
			Animal a = aS.dequeueCat();
			System.out.println(a.getName());
			assertTrue(a.getName().equals("c" + (i+1)));
		}	
	}
	
	@Test
	public void test4() {
		AnimalShelter aS = new AnimalShelter();
		
		Dog d1 = new Dog("d1");
		Cat c1 = new Cat("c1");
		Cat c2 = new Cat("c2");
		Dog d2 = new Dog("d2");
		
		System.out.println(d1.getPosition());
		System.out.println(c1.getPosition());
		System.out.println(c2.getPosition());
		System.out.println(d2.getPosition());
		
		aS.enqueue(d1);
		aS.enqueue(c1);
		aS.enqueue(c2);
		aS.enqueue(d2);
		
		System.out.println(d1.getPosition());
		System.out.println(c1.getPosition());
		System.out.println(c2.getPosition());
		System.out.println(d2.getPosition());
		
		assertEquals("d1", aS.dequeueAny().getName());
		assertEquals("c1", aS.dequeueAny().getName());
		assertEquals("d2", aS.dequeueDog().getName());
	}

}
