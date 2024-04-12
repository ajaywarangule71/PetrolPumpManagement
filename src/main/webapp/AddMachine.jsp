<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="pertolpump.admin.model.*,petrolpump.admin.service.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/adminstyle.css" rel="stylesheet"/>
</head>
<body >
<%@include file="AdminDashbord.jsp"%>

<div class="col py-3 " >
         
   <form class="formarea" name="frm" action="newmachine" method="post">
  <div class="form-group ">
    <label for="exampleInputEmail1">Machine Code</label><br><br>
    <input type="text" class="form-control control" name="machineCode" id="exampleInputEmail1" aria-describedby="emailHelp"
    placeholder="Enter Machine Code"><br><br>
    <table>
    <%
    FuelService fService = new FuelTypeServiceImpl();
    List<FuelTypeModel> list=fService.getAllFuelTypes();
    	for(FuelTypeModel m:list){
    		%>
    		<tr>
    		<td><input type='checkbox' name='ftype' value='<%=m.getId()%>'/>&nbsp;&nbsp;<%=m.getName() %></td>
    		<td align='right' style="padding:10px"><input type='text' name='capacity' value='' class='cont' /></td>
    		</tr>
    		<%
    	}
    %>
    </table>
  </div>

  <button type="submit" class="btn btn-primary">Add New Machine</button>
</form>
         
        </div>
    </div>
</div>
        

</body>
</html>