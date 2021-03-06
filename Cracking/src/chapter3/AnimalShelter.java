package chapter3;

import java.util.LinkedList;
import chapter3.Animal;


public class AnimalShelter {

	LinkedList<Cat> catList = null;
	LinkedList<Dog> dogList = null;
	
	private static int counter = 1;
	
	public AnimalShelter(){
		catList = new LinkedList<Cat>();
		dogList = new LinkedList<Dog>();
	}
	
	public Animal dequeueAny(){
		
		if(!dogList.isEmpty() && !catList.isEmpty()){
			int dogPos = dogList.getFirst().getPosition();
			int catPos = catList.getFirst().getPosition();
			
			if(dogPos < catPos){
				return dogList.removeFirst();
			} else{
				return catList.removeFirst();
			}
		} else if(!catList.isEmpty()){
			return catList.removeFirst();
		} else if(!dogList.isEmpty()){
			return dogList.removeFirst();
		}
		
		return null; // if both lists are empty
	}
	
	public Dog dequeueDog(){
		return dogList.isEmpty()? null : dogList.removeFirst();
	}
	
	public Cat dequeueCat(){
		return catList.isEmpty()? null : catList.removeFirst();
	}
	
	public void enqueue(Animal animal){
		if(animal instanceof Cat){
			Cat c = (Cat)animal;
			c.setPosition(counter++);;
			catList.addLast(c);
		} else if(animal instanceof Dog){
			Dog d = (Dog)animal;
			d.setPosition(counter++);
			dogList.addLast(d);
		} else{
			System.err.println("Incorrect animal for shelter");
		}
	}
	
}

