package org.jsp.controller;

import org.jsp.dao.PersonAdharDao;
import org.jsp.dto.AdharCard;
import org.jsp.dto.Person;

public class PersonAdharCardController {
	public static void main(String[] args) {
		AdharCard card = new AdharCard();
		card.setId(101);
		card.setAdharNumber(234263647182l);
		card.setDateOfBirth("26-08-1932");
		card.setAddress("Guntur Mirch");
		
		Person person=new Person();
		person.setId(1);
		person.setName("pavani");
		person.setEmail("pavani@gmail.com");
		person.setPassword("Pkfc@avani");
		person.setAdhar_card(card);
		
		PersonAdharDao dao=new PersonAdharDao();
		dao.savePerson(person);
	}
}
