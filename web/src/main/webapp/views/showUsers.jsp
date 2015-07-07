<%@ page import="com.tw.core.model.Person" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Person> persons = (List<Person>)request.getAttribute("persons");%>
<html>
<head>
    <title></title>
    <style type="text/css">
      .tg  {border-collapse:collapse;border-spacing:0;}
      .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}
      .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}
    </style>
</head>
<body>
    <table class="tg">
      <tr>
        <td>Name</td>
        <td>Gender</td>
        <td>Email</td>
        <td>Age</td>
      </tr>
      <% if(persons != null){
        for (Person person: persons ) { %>
          <tr>
            <td><%= person.getName() %></td>
            <td><%= person.getGender() %></td>
            <td><%= person.getEmail() %></td>
            <td><%= person.getAge() %></td>
          </tr>
      <% }} %>
    </table>
</body>
</html>
