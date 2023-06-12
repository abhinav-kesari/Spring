<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Complex Form Page</title>
  </head>
  <body>
    <div class="container  bg-warning  card mt-2">

    <form action="submitForm" method="post">
    <h1 class="text-center"> Complex Form </h1>

<div class="alert alert-danger" role="alert">
 <form:errors path="student.*"/>
</div>

      <div class="form-group">
        <label for="exampleFormControlInput1">Your Name</label>
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Name" name="name">
      </div>
      <div class="form-group">
              <label for="exampleFormControlInput2">Your ID</label>
              <input type="text" class="form-control" id="exampleFormControlInput2" placeholder="ID" name="id">
      </div>
      <div class="form-group">
              <label for="exampleFormControlInput3">Your DOB</label>
              <input type="text" class="form-control" id="exampleFormControlInput3" placeholder="dd/MM/yyyy" name="dob">
      </div>
      <div class="form-group">
        <label for="exampleFormControlSelect1">Select Courses</label>
        <select multiple class="form-control" id="exampleFormControlSelect1" name="courses">
          <option value="java" >Java</option>
          <option value="c" >C</option>
          <option value="python" >Python</option>
          <option value="js" >Javascript</option>
          <option value="swift" >Swift</option>
        </select>
      </div>
      Gender:
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="Male">
        <label class="form-check-label" for="inlineRadio1">Male</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="Female">
        <label class="form-check-label" for="inlineRadio2">Female</label>
      </div>
      <div class="form-group">
        <label for="exampleFormControlSelect2">Select type:</label>
        <select  class="form-control" id="exampleFormControlSelect2" name="type">
          <option value="old">old</option>
          <option value="new">new</option>
        </select>
      </div>
      <div class="card mb-4">
      Address:
         <div class="form-group card-body">
              <label for="exampleFormControlInput5"> Your Street</label>
              <input type="text" class="form-control" id="exampleFormControlInput5" placeholder="Street" name="address.street">
            </div>
            <div class="form-group card-body">
              <label for="exampleFormControlInput6">Your City</label>
              <input type="text" class="form-control" id="exampleFormControlInput6" placeholder="city" name="address.city">
            </div>
      </div>
      <button type="submit" class="btn btn-primary btn-lg btn-block">Submit Form</button>
    </form>
    </div>

  </body>

  </html>