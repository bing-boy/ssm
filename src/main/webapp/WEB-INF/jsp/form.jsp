<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>jQuery Easy UI</title>
<script type="text/javascript" src="../easy1.6.6/jquery.min.js"></script>
<script type="text/javascript" src="../easy1.6.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../easy1.6.6/local/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../easy1.6.6/test/easyuitest.js"></script>
<link rel="stylesheet" type="text/css" href="../easy1.6.6/themes/default/easyui.css"></script>
<link rel="stylesheet" type="text/css" href="../easy1.6.6/themes/icon.css"></script>

<script>
	
</script>
</head>
<body>
    <form id="form" method="post" action="../index.jsp">
    	<div>
    		<label for="name">Name:</label>
    		<input class="easyui-validatebox" type="text" name="name" data-options="required:true">
    	</div>
    	<div>
    		<label for="email">Email:</label>
        	<input class="easyui-validatebox" type="text" name="email" data-options="validType:'email',required:true" />
    	</div>
    <input type="submit" value="提交">
    </form>
</body>
</html>