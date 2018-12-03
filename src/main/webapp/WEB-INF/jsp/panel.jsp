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
	<!--<div id="panelbox" class="easyui-panel" title="My Panel" 
        style="width:500px;height:200px;padding:10px;background:#fafafa;"
        data-options="iconCls:'icon-save',closable:true,
                collapsible:true,minimizable:true,maximizable:true">
	    <p>panel content.</p>
        <p>panel content.</p>
    </div>-->

	<div id="panelbox" style="padding:10px;">
		<p>panel content.</p>
		<p>panel content.</p>
	</div>
	
	<div id="tt">
		<a href="#" class="icon-add" onclick="javascript:alert('add')"></a>
		<a href="#" class="icon-edit" onclick="javascript:alert('edit')"></a>
	</div>
	
</body>
</html>