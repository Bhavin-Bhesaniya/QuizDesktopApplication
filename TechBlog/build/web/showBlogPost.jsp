<%@page import="java.util.ArrayList"%>
<%@page import="techBlogEntity.Category"%>
<%@page import="techBlogEntity.Post"%>
<%@page import="techBlogHelper.ConnectionProvider"%>
<%@page import="techBlogDatabase.PostDao"%>
<%@page import="techBlogEntity.User"%>
<%--<%@page errorPage="errorpage.jsp" %>--%>
<%
    User user = (User) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("LoginPage.jsp");
    }
%>
<%
    int postid = Integer.parseInt(request.getParameter("postid"));
    PostDao d = new PostDao(ConnectionProvider.getConnection());
    Post p = d.getPostById(postid);


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= p.getptitle()%></title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark primary-background">
            <!--<nav class="navbar navbar-expand-lg navbar-dark bg-dark">-->
            <a class="navbar-brand" href="index.jsp"><i class="fa fa-desktop"> </i>  Blog</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Category
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Programming Language </a>
                            <a class="dropdown-item" href="#">Java Project</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Data Structure algorithm </a>
                        </div>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link"  data-toggle="modal" data-target="#addPostModal" >Create Post</a>
                    </li>
                </ul>
                <ul class="navbar-nav mr-right ">
                    <li class="nav-item">
                        <a class="nav-link" href="#!" data-toggle="modal" data-target="#profilemodal"><%=user.getname()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="LogoutServlet">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="modal fade" id="profilemodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleMoadlLabel">Tech Blog</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container">
                            <img src="pics/<%= user.getprofile()%>" width="80" height="80" style="margin-left: 180px; margin-bottom: 20px; margin-top: 10px;"><br>
                            <div id="profileDetail">
                                <table class="table table-hover">
                                    <tbody>
                                        <tr>
                                            <th scope="row">Name : </th>
                                            <td><%= user.getname()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">ID : </th>
                                            <td><%= user.getuserid()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Email : </th>
                                            <td><%= user.getemail()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Gender : </th>
                                            <td><%= user.getgender()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">About : </th>
                                            <td><%= user.getabout()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Register Date : </th>
                                            <td><%= user.getTimestamp().toString()%></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            <!--Profile Edit -->
                            <div id="profileEdit" style="display: none;">
                                <h3 class="mt-5">Please Edit CareFully</h3>

                                <form action="EditServlet" method="POST" enctype="multipart/form-data">
                                    <table class="table">
                                        <tr>
                                            <th scope="row">Id : </th>
                                            <td><%= user.getuserid()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Email : </th>
                                            <td><%= user.getemail()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Name : </th>
                                            <td><input type="name" class="form-control" name="user_name" value="<%= user.getname()%>"></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Password : </th>
                                            <td><input type="password" class="form-control" name="user_password" value="<%= user.getpassword()%>"></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Gender : </th>
                                            <td><%= user.getgender()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">About : </th>
                                            <td><textarea  rows="3" class="form-control" name="user_about" style="resize: none;"><%= user.getabout()%></textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Update Profile  : </th>
                                            <td><input type="file" name="updateImage" class="form-control" ></td>
                                        </tr>
                                    </table>
                                    <div class="container">
                                        <button type="submit" class="btn btn-outline-dark">Save</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" id="editProfileBtn" class="btn btn-primary">Edit Profile </button>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="addPostModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle">Add Post Detail</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <form id="addPostForm" action="addPostServlet" method="POST" enctype="multipart/form-data">
                            <div class="form-group">
                                <select class="form-control" name="cid">
                                    <option selected disable>---Selected Category---</option>
                                    <%
                                        PostDao postd = new PostDao(ConnectionProvider.getConnection());
                                        ArrayList<Category> list = postd.getAllCategoreies();
                                        for (Category c : list) {
                                    %>    
                                    <option value="<%= c.getcid()%>"><%=c.getcname()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="form-group"> <input name="ptitle" type="text" placeholder="Enter Post Title" class="form-control"> </div>
                            <div class="form-group"> <textarea name="pcontent" class="form-control" placeholder="Enter Your Content" rows="5" cols="15" style="resize:none;"></textarea></div>
                            <div class="form-group"> <textarea name="pcode" class="form-control" placeholder="Enter Your Programme code(if available)" rows="5" cols="15" style="resize:none;"></textarea></div>
                            <div class="form-group"> <input name="pic" type="file" placeholder="Enter Your Photo(optional)" class="form-control"></div>
                            <div class="container"> <button type="submit" class="btn btn-outline-primary">Save</button> </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>



        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script src="Js/myjs.js" type="text/javascript"></script>

        <script>
            $(document).ready(function () {
                let editStatus = false;
                $('#editProfileBtn').click(function () {
                    if (editStatus === false)
                    {
                        $('#profileDetail').hide();
                        $('#profileEdit').show();
                        editStatus = true;
                        $(this).text('Back');
                    } else
                    {
                        $('#profileDetail').show();
                        $('#profileEdit').hide();
                        editStatus = false;
                        $(this).text('Edit');
                    }
                });
            });

        </script>

        <!--post js-->
        <script>
            $(document).ready(function (e) {

                $("#addPostForm").on("submit", function (event) {
                    //call when form submit
                    event.preventDefault();
                    console.log("form done here");
                    let form = new FormData(this);
                    //request to server
                    $.ajax({
                        url: "addPostServlet",
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            swal("Good job!", "Post submit", "success");
                            console.log(data);
                        },
                        error: function (jqXHR, textStatus, errorThrown) {

                        },
                        processData: false,
                        contentType: false

                    });
                });
            });

        </script>

    </body>
</html>
