<%-- 
    Document   : Home
    Created on : 14-Sep-2021, 8:57:57 AM
    Author     : bhavin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <%@include  file="AllDesignComponent/Allcdn.jsp" %>
        <style>
        #bookrow1{
            background-color: #f7f3e9;
        }        
        </style>
    </head>
    <body>
        <%@include file = "AllDesignComponent/Navbar.jsp"%>
        <div class="container"> 
            <h1 class="text-center">New Book</h1>
            <div class="row" id="bookrow1">
                <div class="card" style="width: 18rem; margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                
                <!--//book-2-->
                <div class="card" style="width: 18rem;  margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                <!--book-3-->

                
                <div class="card" style="width: 18rem;  margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                
            </div>
            <div class="text-center">
                <a href="#" class="btn btn-outline-success">View ALL</a>
                </div>
        </div>
        <div class="container"> 
            <h1 class="text-center">Recent Book</h1>
            <div class="row" id="bookrow1">
                <div class="card" style="width: 18rem; margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                
                <!--//book-2-->
                <div class="card" style="width: 18rem;  margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                <!--book-3-->

                
                <div class="card" style="width: 18rem;  margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                
            </div>
            <div class="text-center">
                <a href="#" class="btn btn-outline-success">View ALL</a>
                </div>
        </div>
        <div class="container"> 
            <h1 class="text-center">Old Book</h1>
            <div class="row" id="bookrow1">
                <div class="card" style="width: 18rem; margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                
                <!--//book-2-->
                <div class="card" style="width: 18rem;  margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                <!--book-3-->

                
                <div class="card" style="width: 18rem;  margin-left: 30px;">
                    <img class="card-img-top" src="https://images-eu.ssl-images-amazon.com/images/I/41Fji-VVHYL._SX198_BO1,204,203,200_QL40_FMwebp_.jpg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Title :- Java Book</h5>
                        <p class="card-text">Author :- Balaguru <br>Details :- Awesome books this is</p>
                        <p class="card-text">Category :- </p>
                        <a href="#" class="btn btn-primary"> <i class="fas fa-cart-plus mr-1"></i>Add To Cart</a>                        
                        <a href="#" class="btn btn-primary">Price : 200</a>
                    </div>
                </div>
                
            </div>
            <div class="text-center" style="margin-bottom : 10px">
                <a href="#" class="btn btn-outline-success">View ALL</a>
                </div>
        </div>
    </body>
    <%@include file = "AllDesignComponent/Footer.jsp"%>
</html>
