<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
    <style type="text/css">
      .tg  {border-collapse:collapse;border-spacing:0; margin-bottom: 20px}
      .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}
      .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;}
      lable {display: inline-block; width: 60px;}
      .none-dispaly{display: none;}
    </style>
</head>
<body>
    <table class="tg">
        <tr>
            <td>Name</td>
            <td>Gender</td>
            <td>Email</td>
            <td>Age</td>
            <td>Action</td>
        </tr>
        <c:forEach var="person" items="${persons}">
            <tr>
                <td class="none-dispaly"><c:out value="${person.id}"/> </td>
                <td><c:out value="${person.name}"/> </td>
                <td><c:out value="${person.gender}"/> </td>
                <td><c:out value="${person.email}"/> </td>
                <td><c:out value="${person.age}"/> </td>
                <td>
                    <a href="/web/updatePerson">EDIT</a>
                    <a href="/web/deletePerson">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <form action="createPerson" method="post">
        <div>
            <lable>Name: </lable>
            <input type="text" name="name">
        </div>
        <div>
            <lable>Gender: </lable>
            <input type="text" name="gender">
        </div>
        <div>
            <lable>Email: </lable>
            <input type="text" name="email">
        </div>
        <div>
            <lable>Age: </lable>
            <input type="text" name="age">
        </div>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
