<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="AdminDashbord.jsp"%>

<div class="col py-3">
         
   <form class="formarea" name="frm" action="fueltype" method="post">
  <div class="form-group ">
    <label for="exampleInputEmail1">Fuel Type</label>
    <br><br>
    <input type="text" class="form-control control" name="type" id="exampleInputEmail1" aria-describedby="emailHelp"
    placeholder="Enter Fuel Type"><br>
  </div>

  <button type="submit" class="btn btn-primary">Add New Fuel Type</button>
</form>
         
        </div>
    </div>
</div>
</body>
</html>