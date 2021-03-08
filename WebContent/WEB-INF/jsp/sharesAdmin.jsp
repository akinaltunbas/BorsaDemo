<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>

<link rel="stylesheet" type="text/css" media="screen" href="<c:url value="/resources/css/bootstrap.min.css" />" />
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

				<div class="container-fluid">
				<div class="row">

				<nav class="navbar navbar-inverse" style="margin-bottom:0px">
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			      <a class="navbar-brand" href="#">Admin</a>
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
	

		
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12"></div>

			<div class="row">
				<div class="col-md-8 col-md-offset-2">
					<legend>Hisseler</legend>
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
											href="<c:url value="/admin/deleteShare?shareId=${share.id}" />"
											class="btn btn-info" type="button">Sil  </a>
											<a
											href="<c:url value="/admin/updateShare?shareId=${share.id}" />"
											class="btn btn-info" type="button">Güncelle</a>
										
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>

			</div>
			<div class="row">
				<div class="col-md-offset-3">
					<a href="${pageContext.request.contextPath}/admin/addShare" class="btn btn-info"
						type="button">Hisse Ekle</a>
				</div>
				
			</div>
		</div>
	</div>
	
</body>
</html>