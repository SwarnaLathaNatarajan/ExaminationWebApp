<style type="text/css">
	body{
		background-size:100% 100%;
	}
	div{
		height: 520px;
		width: 900px;
		border-radius: 2%;
		background-color:rgba(0,0,0,0.8);
		color:white;
		font-size: 20px;
		margin-left: 130px;
		 padding-top: 20px;
		 padding-left: 20px;
	}

</style>
<body background="images/b1.jpg">
<div>
<form action="my_result" method="post">
<%
	String id=(String)request.getAttribute("ID");
	String[] qid=(String[])request.getAttribute("qid");
	String[] q=(String[])request.getAttribute("q");
	String[] a=(String[])request.getAttribute("a");
	String[] choice_A=(String[])request.getAttribute("A");
	String[] choice_B=(String[])request.getAttribute("B");
	String[] choice_C=(String[])request.getAttribute("C");
	String[] choice_D=(String[])request.getAttribute("D");
	int i=0,t;
	while(i<5)
		{ 
		t=i+1;
	out.println("<b>"+t+" ) "+q[i]+"</b><br><br>");
	 %>
	<input type="radio" name=<%=i%> value=<%=choice_A[i]%>><%=choice_A[i]%><span style="display:inline-block; width:30px;"></span>
	<input type="radio" name=<%=i%> value=<%=choice_B[i]%>><%=choice_B[i]%><span style="display:inline-block; width:30px;"></span>
	<input type="radio" name=<%=i%> value=<%=choice_C[i]%>><%=choice_C[i]%><span style="display:inline-block; width:30px;"></span>
	<input type="radio" name=<%=i%> value=<%=choice_D[i]%>><%=choice_D[i]%><span style="display:inline-block; width:30px;"></span>
	</p>
	<% i++;
	} 

	%>
<input type="hidden" name="t_id" value=<%=id%> />
<%
for (i =0; i<qid.length; i++)
{
%>
<Input type = "Hidden" name = "qid" value = "<%= qid[i] %>">
<%
} %>
<center>
<input type="submit" value="submit">
</center>
</div>
</form>
</body>