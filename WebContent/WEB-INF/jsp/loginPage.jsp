<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">-->

<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">

<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>

<title>Borsa Sistemine Giriş</title>
</head>
<body>

		
	
	<section class="container">
		<!-- watch out modelAttribute ! -->
		<form:form  modelAttribute="newLogin" class="form-horizontal" method="post">
			<fieldset>
				<legend>Giriş</legend>


				<div class="form-group">
					<label class="control-label col-lg-2" for="username">Kullanıcı Adı</label>
					<div class="col-md-2">
						<form:input id="username" path="username" type="text" class="form:input-large form-control"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="password">Şifre</label>
					<div class="col-md-2">
						<div class="form:input-prepend">
							<form:input id="password" path="password" type="password" class="form:input-large form-control"/>
						</div>
					</div>
				</div>
				
				

				
						
						

				
				<div class="row">
				<div class=" col-md-offset-2 col-md-1">
				<div class="form-group">
					<div>
						<input type="submit" id="btnAdd" class="btn btn-info" value ="Giriş"/>
					</div>
				</div>
				</div>
				
				<div class="col-md-2">
					<a href="${pageContext.request.contextPath}/home" class="btn btn-info"
						type="button">Ana Sayfa</a>
				</div>
				
				</div>
				
			</fieldset>
		</form:form>
		
		<div class="row">
		<div class="col-md-offset-2">
		<p style="color:red;">${errorMessage}</p>
		</div>
		</div>
		
		
	</section>
</body>
</html>