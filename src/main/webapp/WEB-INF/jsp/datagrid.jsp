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
	<!-- <table class="easyui-datagrid">
	    <thead>
	        <tr>
	            <th data-options="field:'code'">Code</th>
	            <th data-options="field:'name'">Name</th>
	            <th data-options="field:'price'">Price</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td>001</td><td>name1</td><td>2323</td>
	        </tr>
	        <tr>
	            <td>002</td><td>name2</td><td>4612</td>
	        </tr>
	    </tbody>
	</table> -->
	
	<!-- Create datagrid via <table> markup. The nested <th> tags define the columns on the table. -->
	<!-- <table class="easyui-datagrid" style="width:400px;height:250px"
        data-options="url:'datagrid_data.json',fitColumns:true,singleSelect:true">
	    <thead>
	        <tr>
	            <th data-options="field:'code',width:100">Code</th>
	            <th data-options="field:'name',width:100">Name</th>
	            <th data-options="field:'price',width:100,align:'right'">Price</th>
	        </tr>
	    </thead>
	</table> -->
	
	<table id="datagrid"></table>
	<div id="datagridtoolbar">
		<!-- <div>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-delete',plain:true">删除</a>
		</div> -->
		<div>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="datagrid.adduser()">新增</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" id ="datagrid_saveuser"  onClick="datagrid.edituser()">修改</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" id ="datagrid_deleteuser"  onClick="datagrid.deleteuser()">删除</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true"  id ="datagrid_save" style="display: none" onClick="datagrid.save()">保存</a>
			<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-redo',plain:true" id ="datagrid_redo" style="display: none" onClick ="datagrid.redo()">取消</a>
		
			用户名：<input id="username-search" type="text" class="easyui-textbox" name="username" style="width:100px"/>
			开始时间：<input id="starttime-search" type="text" class="easyui-datetimebox" name="starttime" editable="false" style="width:165px" />
			结束时间：<input id="endtime-search" type="text" class="easyui-datetimebox" name="endtime" editable="false" style="width:165px" />
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="datagrid.search();">查询</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="datagrid.clearconditons();">清空条件</a>
		</div>	
	</div>
	
	<div id="datagridmenu" class="easyui-menu" style="display: none">
		<div onclick="" iconCls="icon-add">增加</div>
		<div onclick="" iconCls="icon-remove">删除</div>
		<div onclick="" iconCls="icon-eidt">修改</div>
	</div>
</body>
</html>