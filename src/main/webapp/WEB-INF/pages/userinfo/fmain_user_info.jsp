<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
		<%-- <link rel="stylesheet" href="<%= request.getContextPath() %>/css/index.css"/> --%>
		<title>个人信息</title>
	</head>
	


 <frameset rows="20%,*,*"   noresize="noresize" frameborder="0"  >
	<frame src="/_head.action"   />
	<frameset cols="14%,86%">
		<frame name="leftFrame" class="leftFrame" target="main" scrolling="no" src="/user/userInfo/Left.action" />
		<frame name="rightFrame" class="rightFrame"   src="/user/userInfo/Main.action" />
	</frameset>
	<frame src="/_foot.action" />
</frameset> 


<noframes>
<body>
    <p>此网页使用了框架，但您的浏览器不支持框架。</p>
</body>
</noframes>


	
	
</html>

