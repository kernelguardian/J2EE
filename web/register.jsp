
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <title>Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
            <a class="navbar-brand" href="index.html">Home</a>
          </nav>
        <div class="container">
            <br>
            <h1>Register Page</h1>
            <form action="register" method="post">
            <div class="form-group" >
              <label for="email">Email address</label>
              <input type="email" class="form-control" name="email" id="email" aria-describedby="email" placeholder="Enter email">
              <small id="email" class="form-text text-muted">We'll never share your email with anyone else.</small>
            </div>
                
            <div class="form-group">
              <label for="password">Password</label>
              <input type="password" name="pass" class="form-control" id="password" placeholder=<%session.getAttribute("s_name");%>>
            </div>
                
             <div class="form-group">
              <label for="name">Name</label>
              <input type="text" class="form-control" name="name" id="name" placeholder="Name">
            </div>   
                
             <div class="form-group">
              <label for="year">Year of Study</label>
              <input type="text" class="form-control" name="year" id="year" placeholder="Year">
            </div>   
             
             <div class="form-group">
              <label for="branch">Branch</label>
              <input type="text" class="form-control" name="branch" id="branch" placeholder="Branch">
            </div>   
                
            <button type="submit" class="btn btn-primary">Register</button> 
         </form>
        </div>
    </body>
</html>
