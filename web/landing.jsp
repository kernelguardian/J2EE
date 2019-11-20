<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Welcome</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-primary" style="background-color: #e3f2fd;">
            <a class="navbar-brand" href="index.html">Home</a>
            <a class="navbar-brand" href="#">Logout</a>
          </nav>
        <div class="container">
            <br>
            <div class="card">
            <div class="card-body">
                Welcome <%= request.getAttribute("username") %>

            </div>   
            </div>
            <br>
            <h1 align="center">List of Registered events</h1>
             
            <table class="table">
               <thead class="thead-light">
                 <tr>
                   <th scope="col">#</th>
                   <th scope="col">First</th>
                   <th scope="col">Last</th>
                   <th scope="col">Handle</th>
                 </tr>
               </thead>
               <tbody>
                 <tr>
                   <th scope="row">1</th>
                   <td>Mark</td>
                   <td>Otto</td>
                   <td>@mdo</td>
                 </tr>
                 <tr>
                   <th scope="row">2</th>
                   <td>Jacob</td>
                   <td>Thornton</td>
                   <td>@fat</td>
                 </tr>
                 <tr>
                   <th scope="row">3</th>
                   <td>Larry</td>
                   <td>the Bird</td>
                   <td>@twitter</td>
                 </tr>
               </tbody>
            </table>
            <br>
            <a href="eventregister.html"><button type="submit" class="btn btn-primary">Register for Events</button></a> <a href="update.jsp"><button type="button" class="btn btn-warning">Update Profile</button></a>
        </div>
    </body>
</html>
