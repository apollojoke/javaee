package com.tw.web;

import com.tw.core.model.Person;
import com.tw.core.utils.HibernateUtil;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonServlet extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        Session session = HibernateUtil.getSessionFactory().openSession();
        List persons = session.createCriteria(Person.class).list();

        request.setAttribute("persons", persons);
        request.getRequestDispatcher("views/showUsers.jsp").include(request, response);
    }
}