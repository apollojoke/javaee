package com.tw.web;

import com.tw.core.model.Person;
import com.tw.core.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatePersonServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = new Person();
        person.setName(request.getParameter("name"));
        person.setGender(request.getParameter("gender"));
        person.setEmail(request.getParameter("email"));
        person.setAge(Integer.parseInt(request.getParameter("age")));

        PersonService personService = new PersonService();
        personService.save(person);

        String contextPath = request.getContextPath();
        response.sendRedirect(response.encodeRedirectURL(contextPath+"/show"));
    }
}
