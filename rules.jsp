<body background="images/b1.jpg">
<br><br>
<div>
<br><br>
<%
	out.println("<br><center>Successful enrollment !!!");
	out.println("<br>Welcome  "+request.getParameter("name"));
	Object id=request.getAttribute("ID");
%>
</center>
<style type="text/css">
	body{
		background-size: 100% 100%;
	}
	div{
		height: 450px;
		width: 700px;
		border-radius: 2%;
		background-color:rgba(0,0,0,0.5);
		color:white;
		font-size: 20px;
		margin-left: 220px;
	}

</style>
<h3><b><u><center>RULES</center></u></b></h3>
<ol>
<li>The test taker must not quit the test once enrolled.</li>
<li>For proper self evaluation of your computer knowledge forbid yourself from refering the internet for answers.</li>
<li>Once the test is taken,the score will be displayed on submission</li>
</ol>
 <center>All the best :)<br><br>
<form action="my_exam_controller" method="post">
<input type="hidden" name="t_id" value=<%=id%> />
<input type="submit" value="Start Exam" /></center>
</div>
</form>