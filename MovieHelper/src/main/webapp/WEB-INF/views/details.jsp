<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Details</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cyborg/bootstrap.min.css"
	rel="stylesheet"
	egrity="sha384-mtS696VnV9qeIoC8w/PrPoRzJ5gwydRVn0oQ9b+RJOPxE1Z1jXuuJcyeNxvNZhdx"
	crossorigin="anonymous">
</head>
<body>
	<h2>${movieDeets.title }</h2>
			<tr>
		${t.title }<img src ="https://image.tmdb.org/t/p/w185_and_h278_bestv2${movieDeets.poster_path }">
		</tr>

	<h5>${movieDeets.overview }</h5>
	<table class="table">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Popularity</th>
			<th>Original Language</th>
	
			<th>Release Date</th>	
		</tr>
		<tr>
			<td>${movieDeets.id}</td>
			<td>${movieDeets.title}</td>
			<td>${movieDeets.popularity}</td> 
			<td>${movieDeets.original_language}</td> 
			<td>${movieDeets.release_date}</td>
		</tr>

		
	</table>

	</body>
</html>
