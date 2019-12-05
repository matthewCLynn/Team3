<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cyborg/bootstrap.min.css" rel="stylesheet" egrity="sha384-mtS696VnV9qeIoC8w/PrPoRzJ5gwydRVn0oQ9b+RJOPxE1Z1jXuuJcyeNxvNZhdx" crossorigin="anonymous">
</head>
<body>


	  ${movieDeets.popularity}
	  ${movieDeets.vote_count}
	  ${movieDeets.video}
	  ${movieDeets.poster_path}
	 ${movieDeets.id}
	  ${movieDeets.adult}
	  ${movieDeets.backdrop_path}
	  ${movieDeets.original_language}
	  ${movieDeets.original_title}
	 ${movieDeets.genre_ids}
	  ${movieDeets.title}
	  ${movieDeets.vote_average}
	  ${movieDeets.overview}
	  ${movieDeets.release_date}

</body>
</html>