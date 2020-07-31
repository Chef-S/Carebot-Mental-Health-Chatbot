<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chatpage.jsp</title>
<style> 
textarea {
  width: 100%;
  height: 150px;
  padding: 12px 20px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  background-color: #f8f8f8;
  font-size: 16px;
  resize: none;
}
</style>
</head>
<body  background="background.png">

<img src="ChatbotLogo2.png" alt="Smiley face" height="300" width="380">
<h1><font face="Comic sans MS" size="10">
Hi There let's Chat!
</font></h1>

<form action="Chatpage.jsp" method="get">
<textarea name="Chatarea" rows="4" cols="50" placeholder="Care: Hey There, Let's Chat!"></textarea>
<input  type="submit" value="submit">
</form>
<% 
try {
String userinput="Hey";
 userinput =request.getParameter("Chatarea");
 if(userinput.equals("Hey")) {
%>
	  <p>Hey I'm Care</p>
<% 
	 
 }
}
catch(NullPointerException e) {
	System.out.println("NullPointerException thrown!");
}
%>

</body>
</html>
