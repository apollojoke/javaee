package com.tw.web;

import com.tw.core.service.PersonService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ShowPersonServlet extends HttpServlet {
    private PersonService personService = new PersonService();

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        List persons = personService.ListPersons();

        request.setAttribute("persons", persons);
        request.getRequestDispatcher("views/showUsers.jsp").include(request, response);
    }
}