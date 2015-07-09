package com.tw.web;

import com.tw.core.service.PersonService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletePersonServlet extends HttpServlet {

    PersonService personService = new PersonService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String personId = request.getParameter("personId");
        personService.deletePerson(personId);

        String contextPath = request.getContextPath();
        response.sendRedirect(response.encodeRedirectURL(contextPath + "/show"));
    }
}
