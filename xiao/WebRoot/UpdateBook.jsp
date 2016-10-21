<%@page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'BookList.jsp' starting page</title>


  </head>
  
  <body>
 
  
  
  
 
   <h2 align="center">请按照要求填写信息</h2>
 		<form action="update.action?" method="get">
			<input type="hidden" name="ISBN" value="${ISBN}"/>
  			<p align="center">作者: <input type="text" name="Name" /></p>
  			<p align="center">出版社: <input type="text" name="Publisher" /></p>
  			<p align="center">出版日期: <input type="text" name="PublishDate" /></p>
  			<p align="center">价格: <input type="text" name="Price" /></p>
 			 <p align="center"><input type="submit" value="提交" /></p>
		</form>
  </body>
</html>
