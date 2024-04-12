<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="petrolpump.admin.service.*,java.util.*,pertolpump.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
FuelService fuelService = new FuelTypeServiceImpl();
%>
<%@include file="AdminDashbord.jsp"%>

<div class="col py-3">
         <br><br>
            <caption><h2>Fuel Details<h1></h2></caption>
         
   <table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.No</th>
       <th scope="col">Fuel Type</th>
      <th scope="col ">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
    
    <%
    List<FuelTypeModel> list=fuelService.getAllFuelTypes();
    int count=0;
    for(FuelTypeModel f:list){
    %>
    <tr>
      <th scope="row"><%=++count %></th>
      <td><%=f.getName()%></td>
      <td><a href='dele?typeid=<%=f.getId()%>'><img alt="" src="images/trash-sharp.svg" style="width:30px ;height:30px;margin-left:15px" ></a></td>
      <td><a href='updfuel?typeid=<%=f.getId()%>&fname=<%=f.getName()%>'><img alt="" src="images/refresh.png" style="width:30px ;height:30px;margin-left:15px"></a></td>
    </tr>
    <%
    
    }
    %>
  </tbody>
</table>
         
        </div>
    </div>
</div>
</body>
</html>