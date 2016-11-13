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
                <li class="active"><a href="#">Rank: Meneger</a></li>
                <li class="active"><a href="#">Work time: <c:out value="${Date}" default="defaultDate"/></a></li>
                <li><a href="../about.html">About</a></li>
                <li><a href="../contact.html">Contact</a></li>
                <li><a class="btn" href="/Logout">LOGOUT</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>
<!-- /.navbar -->
<!-- Highlights - jumbotron -->
<div class="jumbotron top-space">
    <div class="container">
    </div> <!-- /row  -->

</div>
<!-- /Highlights -->
<!-- container -->
<div class="container">

    <div class="jumbotron top-space">
        <h3>Graph arriving at work</h3>
        <table>
            <tr>
                <td>sdfs</td>
                <td>sdf</td>
            </tr>
            <tr>
                <td>sfsddff</td>
            </tr>
        </table>
        <h4>Dicta, nostrum nemo soluta sapiente sit dolor quae voluptas quidem doloribus recusandae facere magni ullam suscipit sunt atque rerum eaque iusto facilis esse nam veniam incidunt officia perspiciatis at voluptatibus. Libero, aliquid illum possimus numquam fuga.</h4>
    </div>

    <div class="jumbotron top-space">
        <h3>Vacation schedule</h3>
        <h4>Dicta, nostrum nemo soluta sapiente sit dolor quae voluptas quidem doloribus recusandae facere magni ullam suscipit sunt atque rerum eaque iusto facilis esse nam veniam incidunt officia perspiciatis at voluptatibus. Libero, aliquid illum possimus numquam fuga.</h4>
    </div>

    <div class="jumbotron top-space">
        <h3>Expected salary</h3>
        <h1 class="lead">30 000 RUB</h1>
    </div>

</div>	<!-- /container -->

<!-- Social links. -->
<section id="social">
    <div class="container">
        <div class="wrapper clearfix">
            <!-- AddThis Button BEGIN -->
            <div class="addthis_toolbox addthis_default_style">
                <a class="addthis_button_facebook_like" fb:like:layout="button_count"></a>
                <a class="addthis_button_tweet"></a>
                <a class="addthis_button_linkedin_counter"></a>
                <a class="addthis_button_google_plusone" g:plusone:size="medium"></a>
            </div>
            <!-- AddThis Button END -->
        </div>
    </div>
</section>
<!-- /social links -->


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
</body>
</html>