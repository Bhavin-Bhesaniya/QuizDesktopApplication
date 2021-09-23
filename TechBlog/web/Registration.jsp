<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    <body>

        <%@include file="navigationBar.jsp" %>

        <main class="primary-background p-5">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="card">
                            <div class="card-reader mx-auto">
                                <br>
                                <p>Registration Here</p>
                            </div>
                            <div   class="card-body">
                                <form id="regform" action="registerServlet" method="POST">
                                    <div class="form-group">
                                        <label for="username">UserName</label>
                                        <input name="user_name" type="text" class="form-control" id="username" aria-describedby="emailHelp" placeholder="Enter name" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input name="user_email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required>
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input name="user_password"type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required>
                                    </div>
                                    <div class="form-group">
                                        <label for="gender">Select Gender :- </label>
                                        <input type="radio" id="gender" name="gender"  value="male" "style="margin: 5px" required>Male
                                        <input type="radio" id="gender" name="gender"  value="female" style="margin: 5px" required>Female
                                    </div>
                                    <div class="form-group">

                                        <textarea name="about" class="form-control" id="user_about" rows="5" placeholder="Enter about your self"></textarea>
                                    </div>
                                    <div class="form-check">
                                        <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1" required>
                                        <label class="form-check-label" for="exampleCheck1" required>Terms & Condition</label>
                                    </div>
                                    <br>
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                </form>
                            </div>

                        </div>

                    </div>

                </div>
            </div>
        </main>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="Js/myjs.js" type="text/javascript"></script>

        <script>
                                        function validateform() {
                                            var name = document.myform.name.value;
                                            var password = document.myform.password.value;

                                            if (user_name == null || user_name == "") {
                                                alert("Name can't be blank");
                                                return false;
                                            } else if (password.length < 6) {
                                                alert("Password must be at least 6 characters long.");
                                                return false;
                                            }
                                        }
        </script>  
    </body>
</html>
