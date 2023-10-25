<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Start your development with LeadMark landing page.">
    <meta name="author" content="Devcrud">
    <title>Update page </title>
   <!-- font icons -->
   <link rel="stylesheet" href="assets/vendors/themify-icons/css/themify-icons.css">
   <!-- Bootstrap + Steller  -->
   <link rel="stylesheet" href="assets/css/leadmark.css">
</head>
<body>
<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">Update Form</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-6 col-lg-4">
					<div class="login-wrap p-0">
		      	
		      	<form action="update" class="signin-form" method="post">
		      	<div class="form-group">
		      			<input type="text" class="form-control" name="SearchUsername"placeholder="Search Username" required>
		      		</div>
		      		<div class="form-group">
		      			<input type="text" class="form-control" name="Username"placeholder="Username" required>
		      		</div>
	            <div class="form-group">
	              <input id="password-field" type="password" name = "Password" class="form-control" placeholder="Password" required>
	              <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
	            </div>
	            
	             <div class="form-group">
	              <input id="cpassword-field" type="password" name = "cPassword" class="form-control" placeholder="Confirm-Password" required>
	              <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
	            </div>
	             <div class="form-group">
	              <input id="text" type="text" name = "age" class="form-control" placeholder="age" required>
	              
	            </div>
	            
	             <div class="form-group">
	              <input id="email-field" type="text" name = "email" class="form-control" placeholder="email" required>
	              
	            </div>
	            
	            
	            <div class="form-group">
	            	<button type="submit" class="form-control btn btn-primary submit px-3">Update</button>
	            </div>
	            <div class="form-group d-md-flex">
	            	
								
	            </div>
	          </form>
	         
	         
		      </div>
				</div>
			</div>
		</div>
	</section>

	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>



</body>
</html>