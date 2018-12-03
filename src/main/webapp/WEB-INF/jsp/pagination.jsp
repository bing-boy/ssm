<!DOCTYPE html>
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
</head>
<body>
	<!--
	<div id="paginationbox" class="easyui-pagination" style="background:#efefef;border:1px solid #ccc;"
        data-options="total:100,pageSize:10">
	</div>
	-->
	<!-- <div id="panelcontent" class="easyui-panel" style="height:200px;border:1px solid #ccc;" data-options="title:'panle'"></div> -->
	<div id="panelcontent" style="height:200px;border:1px solid #ccc;"></div>
	<div id="paginationbox" style="background:#efefef;border:1px solid #ccc;"></div>
	
	<div id='paginationmm'>
		<a class="icon-add" onclick="javascript:alert('add')">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
		<a class="icon-edit" onclick="javascript:alert('edit')">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
		<a class="icon-cut" onclick="javascript:alert('cut')">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>
	</div>
</body>
</html>