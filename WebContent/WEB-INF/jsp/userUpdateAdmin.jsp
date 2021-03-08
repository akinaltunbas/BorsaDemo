<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Admin</title>
</head>
<body>

		<div class="container-fluid">
	 		<div class="row">
				<nav class="navbar navbar-inverse">
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#">Anlrcavictor</a>
			    </div>
			
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			         <li class="active"><a href="<c:url value="/admin/listUser" />">Kullanıcılar<span class="sr-only">(current)</span></a></li>
			        <li><a href="<c:url value="/admin/listShare" />">Hisseler</a></li>
			       </ul>
			      
			       <ul class="nav navbar-nav navbar-right">
				        <li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${name}  <span class="caret"></span></a>
				          <ul class="dropdown-menu">
				            <li><a href="<c:url value="/admin/listUser" />">${name}</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="<c:url value="/login/logOut" />">Çıkış</a></li>
				          </ul>
				        </li>
				     </ul>
			      
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
		</div>
	</div>
	
	
	
	<section class="container">
		<!-- watch out modelAttribute ! -->
		<form:form  modelAttribute="updateUser" class="form-horizontal" method="post">
			<fieldset>
				<legend>Kullanıcı Güncelle</legend>

				<form:hidden path="id" />
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="name">İsim</label>
					<div class="col-md-2">
						<form:input id="name" path="name" type="text" class="form-control"/>
						<form:errors path="name" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="surname">Soyisim</label>
					<div class="col-md-2">
						<div class="form:input-prepend">
							<form:input id="surname" path="surname" type="text" class="form-control"/>
							<form:errors path="surname" cssClass="text-danger" />
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="email">Email</label>
					<div class="col-md-2">
						<div class="form:input-prepend">
							<form:input id="email" path="email" type="text" class="form-control"/>
							<form:errors path="email" cssClass="text-danger" />
						</div>
					</div>
				</div>	
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="username">Kullanıcı adı</label>
					<div class="col-md-2">
						<div class="form:input-prepend">
							<form:input id="username" path="username" type="text" class="form-control"  />
							<form:errors path="username" cssClass="text-danger" />
						</div>
					</div>
				</div>		
				<div class="form-group">
					<label class="control-label col-lg-2" for="password">Password</label>
					<div class="col-md-2">
						<div class="form:input-prepend">
							<form:input id="password" path="password" type="text" class="form-control"  />
							<form:errors path="password" cssClass="text-danger" />
						</div>
					</div>
				</div>	
				
				 <div class="form-group"> 
						<label class="control-label col-lg-2" for="userType">Kullanıcı tipi</label>
							<div class="col-md-2"> 				 
					    		<form:select id="userType" path="userType" type="text" class="form:input-large form-control" items="${typeList}"/>		
					     	</div>		
				</div>	
	
				
				<div class="row">
				<div class=" col-md-offset-2 col-md-1">
				<div class="form-group">
					<div>
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Kaydet"/>
					</div>
				</div>
				</div>
				
				<div class="col-md-2">
					<a href="${pageContext.request.contextPath}/admin/listUser" class="btn btn-info"
						type="button">İptal</a>
				</div>
				
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>