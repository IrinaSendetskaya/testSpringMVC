<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin page</title>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
      
</head>
<body>

       <script type="text/javascript">
   			function doAjax() {
				$.ajax({
					url: 'json',
					dataType: 'json',
					data: ({pass: $('#pass').val()}),
					success: function (data){
						$('#resultValue').html(data.name);
					}
				})
			}
   			
   			function doAjax2() {
				
					var jsonObj={
							login:$('#login').val()
					};
					var jsonString=JSON.stringfy(jsonObj);
					$ajax({
					url: 'json2',
					dataType: 'json',
					data: ({login:jsonString}),
					success: function (data){
						$('#resultValue').html(data.key);
					}
				})
			}
   			
   			
   		</script>
   		
<%-- <h2>${message_admin}</h2> --%>

 <div id="resultValue"></div>
 
	
	     <form>
	     	<input type="text" id="pass" onkeyup="doAjax()"/>
	     	<input type="text" id="login" onkeyup="doAjax2()"/>			
		</form>
	
</body>
</html>