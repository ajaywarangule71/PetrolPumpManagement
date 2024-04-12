<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="petrolpump.admin.service.*,java.util.*,pertolpump.admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/adminstyle.css" rel="stylesheet"/>

</head>
<body>
<%!
MachineService machineService = new MachineServiceImpl();
%>
<%@include file="AdminDashbord.jsp"%>

<div class="col py-3">
         <br><br>
            <caption><h2>Machine Details<h1></h2></caption>
         
   <table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Machine Name</th>
       <th scope="col">Fuel Type</th>
        <th scope="col">Capacity</th>
      <th scope="col ">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
    
    <%
    List<Object[]> list=machineService.getAllMachine();
    int count=0;
    for(Object obj[]:list){
    %>
    <tr>
      <th scope="row"><%=++count %></th>
      <td><%=obj[0]%></td>
       <td><%=obj[1]%></td>
        <td><%=obj[2]%></td>
      <td><a href='del?machineid=<%=(int)obj[3]%>'><img alt="" src="images/trash-sharp.svg" style="width:30px ;height:30px;margin-left:15px" ></a></td>
      <td><a href='updmachine?mid=<%=(int)obj[3]%>&mcode=<%=obj[0].toString()%>'> <img alt="" src="images/refresh.png" style="width:30px ;height:30px;margin-left:15px"></a></td>
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