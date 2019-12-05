<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/united/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WTtvlZJeRyCiKUtbQ88X1x9uHmKi0eHCbQ8irbzqSLkE0DpAZuixT5yFvgX0CjIu"
	crossorigin="anonymous">
</head>
<body>
	<form action="search-movie">
		<select name="category">
			<option value="title">Title</option>
			<option value="genre">Genre</option>
			<option value="rating">Rating</option>
		</select> <input type="text" name="input" /> <input type="number"
			name="page" placeholder="# of pages" /> <input type="submit"
			value="Search" />
	</form>
			<h3>Movie Title</h3>
			<br>
		<c:forEach var="r" items="${test }">
			<c:forEach var="t" items="${r.results }">
				
					${t.title }<br><img src ="https://image.tmdb.org/t/p/w185_and_h278_bestv2${t.poster_path }">
			<br>
			<a class = "btn btn-secondary" href ="details?id=${t.id }" >More Details</a>
			<br><br>
			</c:forEach>
		</c:forEach>


</body>
</html>