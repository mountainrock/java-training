<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">

<title>New/Edit Contact</title>
</head>
<body class="container mt-4">
	<div align="center">
		<h1>New/Edit Contact</h1>
		<form:form action="saveContact" method="post" modelAttribute="contact">
			<form:hidden path="id" />
			<div class="row">
			    <div class="col-md-3">
			        <div class="form-group">
			            <label for="name" class="form-item">Name:</label>
			            <form:input path="name" class="form-control" id="name" />
			        </div>
			    </div>
			   
			</div>
			<div class="row">
			 	<div class="col-md-3">
			        <div class="form-group">
			            <label for="email">Email:</label>
			            <form:input path="email" class="form-control" id="email" />
			        </div>
			    </div>
			 </div>
			<div class="row">   
			    <div class="col-md-6">
			        <div class="form-group">
			            <label for="address">Address:</label>
			            <form:input path="address" class="form-control" id="address" />
			        </div>
			    </div>
			 </div>
			<div class="row">
			    <div class="col-md-6">
			        <div class="form-group">
			            <label for="telephone">Telephone:</label>
			            <form:input path="telephone" class="form-control" id="telephone" />
			        </div>
			    </div>
			</div>
			<div class="row">
				<div class="col-md-3 text-center">
			 		<a href="/SpringMvcJdbcTemplate/" class="btn btn-warning">Back</a>
			 	</div>
			    <div class="col-md-3 text-center">
			        <input type="submit" value="Save" class="btn btn-primary" />
			    </div>
			</div>
					
		</form:form>
	</div>
</body>
</html>