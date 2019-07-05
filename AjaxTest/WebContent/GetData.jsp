<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>

function getDetails()
{
       var xmlhttp = new XMLHttpRequest();
        xmlhttp.onreadystatechange = function() {
        	//alert("hi");
             if (xmlhttp.readyState === 4) {
                   if (xmlhttp.status === 200) {
              
                	   var aa = xmlhttp.responseText;
                		alert(aa);
       
                 //document.getElementById("userName").value= aa;
                 //document.getElementById("c").value= aa;
                // alert("responseText "+aa);
                 
                        }
            }
        }
        //xmlhttp.open('GET','/AjaxTest/GettingData',true);
        xmlhttp.open('POST','https://johndeere.okta.com/api/v1/sessions/me',true);
        xmlhttp.send(null);

}

</script>

<!-- <script type="text/javascript">
$(document).ready(function() {
	alert("h1");
	$('#userName').change(function() {
		//alert("helooo");
		url :'/AjaxTest/GettingData',
		
		 $.ajax({
			url :'/AjaxTest/GettingData',
			type :'GET',
			data : {
				userName : $('#userName').val()
				
			},
			success : function(responseText) {
				$("#c").val(responseText);
				alert(responseText);
			}
			
		}); 
	});
});
</script>  -->

</head>
<!-- <script type="text/javascript">
function loadDoc()
{
	alert()
	var userName= document.getElementById("userName").value;
	var a= false;
	if(userName!=null && userName !="")
		{
		document.getElementById("userName").innerHTML="Username not be blank";
		}
	else
		{
		var request = $.ajax({
			  url: "Register",
			  method: "GET",
			  cache: false,
			  data: { userName : userName },
			  async:false,
			  success: function(msg){

			        if (dealer_code == "1"||dealer_code == 1) 
			        {  
			        	//alert("mobile number already exist!");
			        	document.getElementById("dealer_code_exist").innerHTML="Dealer Code Already Exist!";
			        	aa=false;
			            return false;
			        }
			        else
			        	{
			        	document.getElementById("dealer_code_exist").innerHTML="";
			        aa=true;
			        	return true;
			        	}
			    }
			});

		return aa;
		
		}
	}
	
	
	
	
	

</script> -->




<body>
Username<input type="text" name="userName"  id="userName"/>
<button type="button" onclick="getDetails()">GetDetails</button> 
address <input type="text" name="address"  id="c" readonly="readonly"/>
</body>
</html>