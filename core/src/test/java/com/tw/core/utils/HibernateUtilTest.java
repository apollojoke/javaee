package com.tw.core.utils;

import com.tw.core.model.Person;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HibernateUtilTest {

    private Session session;

    @Before
    public void setUp() throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Test
    public void shouldConnectDataBase() throws Exception {
        assertNotNull(session);
    }

    @Test
    public void shouldOperateDataBase() throws Exception {
        Person testPerson = new Person(1, "Jun Lee", "Male", "juli@thoughtworks.com", 18);
        session.beginTransaction();
        session.save(testPerson);
        session.getTransaction().commit();


        Person result = (Person) session.get(Person.class, 1);
        assertThat(result.getName(), is(testPerson.getName()));

        session.delete(testPerson);
        assertNull(session.get(Person.class, 1));

        session.close();
    }
}