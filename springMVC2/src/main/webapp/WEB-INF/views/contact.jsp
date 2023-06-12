<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Page Title</title>
</head>
<body>

<div class="container mt-5">
<h2>Contact Page </h2>

<form action="processform" method="post">
  <div class="form-group">
    <label for="email">Email address</label>
    <input
    type="email"
    class="form-control"
    id="email"
    aria-describedby="emailHelp"
    name="email"
    placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted"> </div>
  <div class="form-group">
    <label for="username">Username</label>
    <input type="text" class="form-control" id="username" name="username" placeholder="Username">
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

</body>
</html>
