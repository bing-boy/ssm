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
<link rel="stylesheet" type="text/css" href="../easy1.6.6/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../easy1.6.6/themes/icon.css">
</head>
<body>
	<!-- <ul id="tree" class="easyui-tree">
		<li><span>Folder</span>
			<ul>
				<li><span>Sub Folder 1</span>
					<ul>
						<li><span><a href="#">File 11</a></span></li>
						<li><span>File 12</span></li>
						<li><span>File 13</span></li>
					</ul></li>
				<li><span>File 2</span></li>
				<li><span>File 3</span></li>
			</ul></li>
		<li><span>File21</span></li>
	</ul> -->
	<ul id="tree"></ul>
	
	<div id="mm" class="easyui-menu" style="width:120px;">
		<div onclick="append()" data-options="iconCls:'icon-add'">Append</div>
		<div onclick="remove()" data-options="iconCls:'icon-remove'">Remove</div>
	</div>
	
	<br><input type="button" value="按钮" onclick="clicktreebox()"/>
</body>
</html>