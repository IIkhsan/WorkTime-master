<%--
  Created by IntelliJ IDEA.
  User: iikhsn
  Date: 17.10.16
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport"    content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">

    <title>Progressus. Home page.</title>

    <link rel="shortcut icon" href="${pageContext.request.contextPath}../images/gt_favicon.png">

    <link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/font-awesome.min.css">

    <!-- Custom styles for our template -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/bootstrap-theme.css" media="screen" >
    <link rel="stylesheet" href="${pageContext.request.contextPath}../css/main.css">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}../js/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath}../js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="home">
<!-- Fixed navbar -->
<div class="navbar navbar-inverse navbar-fixed-top headroom" >
    <div class="container">
        <div class="navbar-header">
            <!-- Button for smallest screens -->
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
            <a class="navbar-brand" href="index.html"><img src="../images/logo.png" alt="Progressus HTML5 template"></a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav pull-right">
                <li class="active"><a href="#">Name: <c:out value="${name}" default="default"/></a></li>
                <li class="active"><a href="#">Rank: Admin</a></li>
                <li class="active"><a href="#">Work time: <c:out value="${Date}" default="defaultDate"/></a></li>
                <li><a href="../about.html">About</a></li>
                <li><a href="../contact.html">Contact</a></li>
                <li><a class="btn" href="/Logout">LOGOUT</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>
<!-- /.navbar -->

<header id="head" class="secondary"></header>

<!-- container -->
<div class="container">
    <div class="row">

        <!-- Article main content -->
        <article class="col-xs-12 maincontent">
            <header class="page-header">
                <h1 class="page-title">Admin Panel</h1>
            </header>

            <div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <h3 class="thin text-center"><c:out value="${correct}" default="Register a new account"/></h3>
                        <p class="text-center text-muted"></p>
                        <hr>

                        <form name="newPerson" action="/newPerson" method="POST" id="newPerson">
                            <div class="top-margin">
                                <label>User Login <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" name="loginField">
                            </div>
                            <div class="top-margin">
                                <label>Name <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" name="name">
                            </div>
                            <div class="top-margin">
                                <label>Last name <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" name="lastname">
                            </div>

                            <div class="row top-margin">
                                <div class="col-sm-6">
                                    <label>Password <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" name="passwordField">
                                </div>
                                <div class="col-sm-6">
                                    <label>Confirm Password <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control">
                                </div>
                            </div>

                            <hr>

                            <div class="row">
                                <div class="col-lg-8">
                                    <label class="checkbox">
                                        This is Admin
                                        <input type="checkbox" name="priority" value=1>
                                    </label>
                                </div>
                                <div class="col-lg-4 text-right">
                                    <button class="btn btn-action" id="register" type="submit">Register</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>

        </article>
        <!-- /Article -->

    </div>
</div>	<!-- /container -->


<footer id="footer" class="top-space">

    <div class="footer1">
        <div class="container">
            <div class="row">

                <div class="col-md-3 widget">
                    <h3 class="widget-title">Contact</h3>
                    <div class="widget-body">
                        <p>+7(960)-051-72-09<br>
                            <a href="mailto:#">support@localhost</a><br>
                            <br>
                            Republic of Tatarstan Kazan sity Kremlevskaya street, 35
                        </p>
                    </div>
                </div>
            </div> <!-- /row of widgets -->
        </div>
    </div>

    <div class="footer2">
        <div class="container">
            <div class="row">

                <div class="col-md-6 widget">
                    <div class="widget-body">
                        <p class="simplenav">
                            <a href="about.html">About</a> |
                            <a href="../contact.html">Contact</a>
                        </p>
                    </div>
                </div>

                <div class="col-md-6 widget">
                    <div class="widget-body">
                        <p class="text-right">
                            Copyright &copy; 2016, Ilyas Ikhsanov.
                        </p>
                    </div>
                </div>

            </div> <!-- /row of widgets -->
        </div>
    </div>

</footer>


<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}../js/headroom.min.js"></script>
<script src="${pageContext.request.contextPath}../js/jQuery.headroom.min.js"></script>
<script src="${pageContext.request.contextPath}../js/template.js"></script>
<script src="${pageContext.request.contextPath}../js/Registration.js"></script>
<script src="${pageContext.request.contextPath}../js/jquery.js"></script>
<script src="${pageContext.request.contextPath}../js/jquery.validate.js"></script>
</body>
</html>
