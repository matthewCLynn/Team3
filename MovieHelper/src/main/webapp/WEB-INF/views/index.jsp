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
	<div align = "right">
	<a class = "btn btn-primary" href ="user-list" >My Movie List</a>
	</div>
</head>
<body>
	<div style = "background-size: cover; background-image: url('https://image.tmdb.org/t/p/w185_and_h278_bestv2${test.get(0).getResults().get(0).getBackdrop_path() }')">
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
			<a class = "btn btn-danger" href ="add-to-list?id=${t.id }">Add to Watchlist</a>
			<br><br>
			</c:forEach>
		</c:forEach>

</div>
</body>
</html>