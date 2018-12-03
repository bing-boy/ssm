$(function(){
	//textbox
	$('#textbox').textbox({	//不太明白这里引入改文件无用，新建一个内容一模一样的js文件，引入到jsp中就有用	
	    width:300,
		height:30,
		//cls:'',  //Add a CSS class to the textbox. Available since version 1.5.1.(String)
		promot:'This is promot messgae',  //The prompt message to be displayed in input box.(String/'')
	    value:'please input password',  //The default value.(String)
	    type:'text',  //The textbox type. Possible values are 'text' and 'password'.(String/text)
	    label:'Password:',  //The label bound to textbox. Available since version 1.5.(string,selector/null)
	    labelWidth:100,  //The label width. Available since version 1.5.(number/atuo)
	    labelPositon:'after',  //The label position. Possible values are:'before','after','top'. Available since version 1.5.(String/before)
	    labelAlign:'left',  //The label alignment. Possible values are:'left','right'. Available since version 1.5.(String/left)
	    multiline:false,  //Defines if this is a multiline textbox.(boolean/false)
		editable:true,  //Defines if the user can type text directly into the field.(boolean/true)
		disabled:false,  //Defines if to disable the field.(boolean/false)
		readonly:false,  //Defines if the component is read-only.(boolean/false)
		/*icons:[{  //	The icons attached to the textbox. Each item has the following properties:
						//iconCls: string, the icon class.
						//disabled: boolean, indicate if the icon is disabled.
						//handler: function, the function to process the clicking action on this icon.(array/[])
			iconCls:'icon-add',
			handler:function(e){
				$(e.data.target).textbox('setValue', 'Something added!');
			}
			
		}],*/
		iconCls:'icon-lock',
	    iconAlign:'right',  //Position of the icons. Possible values are 'left','right'.(String/right)
	    iconWidth:30,  //The icon width.(number/18)
	    buttonText:'Search',  //	The displaying text of button that attached to the textbox.(String/)
	    buttonIcon:'icon-search',  //The displaying icon of button that attached to the textbox.(String/null)
	    buttonAling:'right',  //Position of the button. Possible values are 'left','right'.(String/right)
	    
	    //Event
	    onChange:function(newValue,oldValue){  //Fires when the field value is changed.
	    	console.log("oldValue:" + oldValue + ",newValue:" + newValue);
	    },
	    onResize:function(width,height){  //Fires when the textbox is resized.
	    	console.log("width:" + width + ",height:" + height);
	    },
	    onClickButton:function(){  //Fires when the user click the button.
	    	console.log("onClickButton");
	    },
	    onClickIcon:function(index){  //Fires when the user click a icon.
	    	console.log("onClickIcon:index=" + index);
	    },
	});
	
	//Method
	/*$('#textbox').textbox('textbox').bind('keydown',function(e){  //Return the textbox object. The user can bind any events to this editing box.(Parameter/none)
		if(e.keyCode == 13){
			$('#textbox').textbox('setValue','bingboy');
		}
	});*/
	
	//console.log("button:" + JSON.stringify($('#textbox').textbox('button')));  //Return the button object.(Parameter/none)
	
	//$('#textbox').textbox('destroy');  	//Destroy the textbox component(Parameter/none)
	
	$('#textbox').textbox('resize',500);  //Resize the component width.(Parameter/width)
	
	$('#textbox').textbox('disable');  //Disable the component.(Parameter/none)
	
	$('#textbox').textbox('enable');
	
	$('#textbox').textbox('readonly',false);
	
	$('#textbox').textbox('clear');
	
	//$('#textbox').textbox('reset','hello');  //Reset the component value.(Parameter/none) 将所有值恢复成一开始的状态，可以用于多文本框默认值重置场景
	
	$('#textbox').textbox('initValue','123');  //Initialize the component value. Calling this method does not trigger the 'onChange' event.(Paramater/value)
	
	$('#textbox').textbox('setText','bingboy');  //Set the displaying text value.(Paramater/text)
	
	//console.log("getText:" + $('#textbox').textbox('getText'));  //Get the displaying text value.(Parameter/none)
	
	$('#textbox').textbox('setValue','hi');  //Set the component value.(Paramater/value)
	
	//console.log("getValue:" + $('#textbox').textbox('getValue'));  //Get the component value.(Parameter/none)
	
	//console.log("getIcon:" + JSON.stringify($('#textbox').textbox('getIcon',0)));  //Get specified icon object.(Paramater/index)
	
});
