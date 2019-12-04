<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css" rel="stylesheet" integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu" crossorigin="anonymous">
</head>
<body>
	<form action="search-movie">
		<select>
			<option name="category" value="title">Title</option>
			<option name="category" value="genre">Genre</option>
			<option name="category" value="rating">Rating</option>
		</select>
		<input type="text" name="input"/>
	</form>
	<table>
  <tr>
    <th>test</th>
    <th>test</th>
  </tr>
  <c:forEach var="t" items="${test.results }">
  <tr>
    <td>${t.title }</td>
    <td>${t.vote_count }</td>
  </tr>
  </c:forEach>
</table>

	</body>
</html>