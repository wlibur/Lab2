<%@page language="java" import="java.util.*" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%> 
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="Methods.method_Book,Book.*"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>����鼮��Ϣ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <s:form action="Check.action" method="post">
  	<table align="center"  width="300" border="1">
  		<tr><td align="center" colspan="3"><b>�밴��Ҫ����д��Ϣ</b></td></tr>
  		<s:textfield name="ISBN" label="ͼ����"></s:textfield>
  		<s:textfield name="Title" label="ͼ������"></s:textfield>
  		<s:textfield name="AutherID" label="����ID"></s:textfield>
  		<s:textfield name="Publisher" label="������"></s:textfield>
  		<s:textfield name="PublishDate" label="��������"></s:textfield>
  		<s:textfield name="Price" label="��  ��"></s:textfield>
  		<s:textfield name="Name" label="��  ��"></s:textfield>
  		<s:textfield name="Age" label="��  ��"></s:textfield>
  		<s:textfield name="Country" label="��  ��"></s:textfield>
  		<s:submit value="�ύ"/>
  	</table>
  	</s:form>
  	<table align="center"  width="300" border="1">
	<tr><td align="right" colspan="3"><a href=bookshow.action>����</a></td></tr>
	</table>
  </body>
</html>
