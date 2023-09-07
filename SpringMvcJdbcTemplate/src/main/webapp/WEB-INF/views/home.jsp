<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
        
    </head>
    <body>
    	<div  class="container mt-4">
	       
	          <div class="row">
			        <div class="col">
			            <h1>Contacts</h1>
			        </div>
			    </div>
			    <div class="row">
			        <div class="col">
			            <table class="table table-bordered">
			                <thead>
			                    <tr>
			                        <th>No</th>
			                        <th>Name</th>
			                        <th>Email</th>
			                        <th>Address</th>
			                        <th>Telephone</th>
			                        <th>Action</th>
			                    </tr>
			                </thead>
			                <tbody>
			                    <c:forEach var="contact" items="${listContact}" varStatus="status">
			                        <tr>
			                            <td>${status.index + 1}</td>
			                            <td>${contact.name}</td>
			                            <td>${contact.email}</td>
			                            <td>${contact.address}</td>
			                            <td>${contact.telephone}</td>
			                            <td>
			                                <a href="editContact?id=${contact.id}" class="btn btn-success">Edit</a>
			                                <a href="deleteContact?id=${contact.id}" class="btn btn-danger">Delete</a>
			                            </td>
			                        </tr>
			                    </c:forEach>
			                </tbody>
			            </table>
			             <h3><a href="newContact" class="btn btn-primary">Add Contact</a></h3>
			        </div>
			    </div>
			</div>


    	</div>
    </body>
</html>
