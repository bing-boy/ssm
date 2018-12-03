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

	<!--
	<select id="combobox" class="easyui-combobox" name="dept" style="width:200px;">
		<option value="aa">aitem1</option>
		<option>bitem2</option>
		<option>bitem3</option>
		<option>ditem4</option>
		<option>eitem5</option>
	</select>
	-->
	<!-- 
	<input id="combobox" class="easyui-combobox" name="dept"
		data-options="valueField:'id',textField:'text',url:'../hello/comboboxjson.action'"> -->
		
	<input id="combobox" name="fruit" value="请选择">&nbsp;&nbsp;&nbsp;&nbsp;<button onclick="cancelcombobox()">取消</button>
</body>
</html>