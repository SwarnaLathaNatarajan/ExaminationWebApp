<style type="text/css">
	body{
		background-size: 100% 100%;
	}
	div{
		height: 300px;
		width: 500px;
		border-radius: 2%;
		background-color:rgba(0,0,0,0.6);
		color:white;
		font-size: 20px;
		margin-left: 300px;
		padding-left: 70px;
		}
	p { white-space: pre; }
</style>
<body background="images/b1.jpg">
<br><br><br><br><br><br>
<div>
<br>
<u><h3<b>RESULT</h3<b></u>
<%
	Object id=request.getAttribute("id");
	Object score=request.getAttribute("score");
	String[] details=(String[])request.getAttribute("details");
	int i=0;
%>
<p>
Student id    	                 :  	 <%out.println(id);%> 
Student Name  		 :  	 <%out.println(details[0]);%>
Student's E-mail id 	 : 	 <%out.println(details[1]);%>
Score 				 : 	  <%out.println(score+" on 5");%>
</p>
</div>