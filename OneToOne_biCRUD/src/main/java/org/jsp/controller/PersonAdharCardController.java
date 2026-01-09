package org.jsp.controller;

import org.jsp.dao.PersonAdharDao;
import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonAdharCardController {
	public static void main(String[] args) {
		PersonAdharDao dao=new PersonAdharDao();
		
		
		AdharCard card = new AdharCard();
		card.setId(104);
		card.setAdharNumber(34234523432L);
		card.setDateOfBirth("21-06-1865");
		card.setAddress("Golden Mirch");
		
		Person person=new Person();
		person.setId(4);
		person.setName("Ramesh");
		person.setEmail("Ramesh@fivestar.com");
		person.setPassword("Ramesh@12345");
		
		
		//CASE 1 --> PERSON HAS ADHARCARD AND ADHAR CARD HAS PERSON
//		person.setAdhar_card(card);
//		card.setPerson(person);
//		dao.savePerson(person);
		
		
		//case 2 --> AdharCard has Person and Person has AdharCard
//		card.setPerson(person);
//		person.setAdhar_card(card);
//		dao.saveAdharCard(card);
		
		
		//case 3 --> Person has adhar but adhar does not have person
//		person.setAdhar_card(card);
//		dao.savePerson(person);
		
//		case 4 --> Adhar has person but person does not have adhar
		card.setPerson(person);
		dao.saveAdharCard(card);
		
		

	}
}
