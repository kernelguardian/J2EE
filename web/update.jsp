
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <title>Profile Update</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    </head>
    <body>
        <nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
            <a class="navbar-brand" href="index.html">Home</a>
            <a class="navbar-brand" href="logout.html">Logout</a>
          </nav>
        
        <div class="container">
            <br>
            <form action="register" method="post">
            <div class="form-group" >
              <label for="email">Email address</label>
              <input type="email" class="form-control" name="email" readonly id="email" aria-describedby="email" placeholder="<%= session.getAttribute("s_uname") %>">
              
            </div>
                
            
                 
             <div class="form-group">
              <label for="name">Name</label>
              <input type="text" class="form-control" name="name" id="name" value="<%= session.getAttribute("s_name") %>">
            </div>   
                
             <div class="form-group">
              <label for="year">Year of Study</label>
              <input type="text" class="form-control" name="year" id="year" value="<%= session.getAttribute("s_year") %>">
            </div>   
             
             <div class="form-group">
              <label for="branch">Branch</label>
              <input type="text" class="form-control" name="branch" id="branch" value="<%= session.getAttribute("s_branch") %>">
            </div>   
                
            <button type="submit" class="btn btn-primary">Update</button> 
         </form>
        </div>
    </body>
</html>
