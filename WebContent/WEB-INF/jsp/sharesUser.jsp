<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>

<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<link href="<c:url value="/resources/css/datepicker.css"/>" rel="stylesheet">

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-datepicker.js"/>"></script>

</head>
<body>

	<!-- ----------------------------NAVBAR----------------------------------------------- -->

				<nav class="navbar navbar-default" style="margin-bottom:0px">
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#">User</a>
			    </div>
			
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			        <li><a href="<c:url value="/user/listShare"/>">Hisseler</a></li>
			       </ul>
			       
			        <ul class="nav navbar-nav navbar-right">
				        <li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${name}  <span class="caret"></span></a>
				          <ul class="dropdown-menu">
				            <li><a href="<c:url value="/user/updateMyProfile"/>">${name}</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="<c:url value="/login/logOut" />">Çıkış</a></li>
				          </ul>
				        </li>
				     </ul>
			      
			      
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
	

	
	<!-- --------------------------FORM-------------------------------------------------- -->

			<div class="row">
			<div class="col-md-12"></div>
			  <div class="row">
				<div class="col-md-10 col-md-offset-1">
					<legend> HİSSELERİM</legend>
					<div class="table-responsive">
						<table id="example" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Kod</th>
									<th>İsim</th>
									<th>Miktar</th>
									<th>Toplam Değer</th>
								</tr>
							</thead>
							<tbody>
							
								<c:forEach items="${allShares}" var="share">
									<tr>
										<td><c:out value="${share.kod}" /></td>
										<td><c:out value="${share.isim}" /></td>
										<td><c:out value="${share.price}" /></td>
										<td><c:out value="${share.date}" /></td>
										<td><a
											href="<c:url value="/user/deleteTravel?travelId=${share.id}" />"
											class="btn btn-danger" type="button">Sil</a>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>

		</div>
	
	
	
	<!-- -------------------------------TABLE------------------------------------------------ -->
	
		<div class="row">
			<div class="col-md-12"></div>
			  <div class="row">
				<div class="col-md-10 col-md-offset-1">
					<legend>ALINABİLECEK HİSSELER</legend>
					<div class="table-responsive">
						<table id="example" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Kod</th>
									<th>İsim</th>
									<th>Ücret</th>
									<th>Tarih</th>
								</tr>
							</thead>
							<tbody>
							
								<c:forEach items="${allShares}" var="share">
									<tr>
										<td><c:out value="${share.kod}" /></td>
										<td><c:out value="${share.isim}" /></td>
										<td><c:out value="${share.price}" /></td>
										<td><c:out value="${share.date}" /></td>
										<td><a
											href="<c:url value="/user/deleteTravel?travelId=${share.id}" />"
											class="btn btn-danger" type="button">Sil</a>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>

		</div>
	
				<div class="row">
				<div class="col-md-offset-3">
					<a href="${pageContext.request.contextPath}/user/addShare" class="btn btn-info"
						type="button">Hisse Al Sat</a>
				</div>
				
			</div>

	
	
</body>
</html>