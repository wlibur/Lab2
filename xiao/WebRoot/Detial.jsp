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
    
    <title>�鼮����ϸ��Ϣ</title>
    
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
  	<table align="center" width="450" border="1">
    <tr>
    	<td align="center" colspan="4">������Ϣ</td>
    </tr>
    
    <tr align="center" >
    	<td><b>�鼮����</b></td>
    	<td><b>����ID</b></td>
    	<td><b>��������</b></td>
    	<td><b>���߹���</b></td>
    </tr>
    <tr>
    </tr>
    
    <s:iterator value="List_A">  
                <tr class="br_TR">  
 					
                    <td align="center"><s:property value="Name" /></td> 
                    <td align="center"><s:property value="AutherID"/></td>   
                    <td align="center"><s:property value="Age" /></td>  
                    <td align="center"><s:property value="Country" /></td>  
                  	
                </tr>  
     </s:iterator>  
    
    <tr><td align="center" colspan="4"><a href="bookshow.action">����</a></td></tr>
    </table>
    <hr>
     
  </body>
</html>
