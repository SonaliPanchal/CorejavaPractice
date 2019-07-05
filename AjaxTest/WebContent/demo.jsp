<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<title>AjaxCall</title>

<!-- <script type="text/javascript">
	$(document).ready(function() {
		$('#getDetail').click(function() {
			alert("hii");
			var rdata = $('#city').val() + ',' + $('#country').val();
			var result =$('#result');
			alert(rdata+"fhh"+result);
			$.ajax({
				//url:'https://johndeere.okta.com/api/v1/sessions/me',
				url:'https://api.github.com/users',
				method:'get',
				data : {q:rdata},
				dataType:'json',
				success:function(data){
					alert("data"+data);
					if(data.errorCode !=null){
						result.html(data.errorSummary);
						result.html(data.errorCode);
					}
					/* else
						{
						result.html('Wheather:'+)
						}
					 */
				}
			})
		});
	});
</script> -->

<script type="text/javascript">

function getdata()
{
	alert("getdata");
	 //Create the XHR Object
    let xhr = new XMLHttpRequest;
    //Call the open function, GET-type of request, url, true-asynchronous
    xhr.open('GET', 'https://api.github.com/users', true)
    //call the onload 
    xhr.onload = function() 
        {
            //check if the status is 200(means everything is okay)
            if (this.status === 200) 
                {
                    //return server response as an object with JSON.parse
                    console.log(JSON.parse(this.responseText));
        }
                }
    //call send
    xhr.send();
	}


</script>
</head>


<body>
	<table>
		<tr>
			<td>City</td>
			<td><input type="text" id="city" name="city" /></td>
		</tr>
		<tr>
			<td>Country</td>
			<td><input type="text" id="country" name="country" /></td>
		</tr>
	</table>

	<input type="button" name="getDetail" id="getDetail" value="GETDATA" onclick="getdata()"/>
	<br>
	<br>
	<div id="" result></div>
</body>
</html>