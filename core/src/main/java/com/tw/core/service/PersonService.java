package com.tw.core.service;


import com.tw.core.model.Person;
import com.tw.core.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PersonService {
    private SessionFactory factory = HibernateUtil.getSessionFactory();


    public void save(Person person) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        tx.commit();
        session.close();
    }

    public List<Person> ListPersons() {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        List<Person> persons = session.createQuery("from Person").list();
        tx.commit();
        session.close();
        return persons;
    }

    public void deletePerson(String personId) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Person person = (Person)session.get(Person.class, Integer.parseInt(personId));
        session.delete(person);
        tx.commit();
        session.close();
    }

    public void updatePerson(Person person) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(person);
        tx.commit();
        session.close();
    }
}
