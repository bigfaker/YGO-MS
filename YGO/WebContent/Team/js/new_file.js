//在页面装载是让所有的td都拥有一个点击事件  
$(document).ready(function(){  
//找到所有的td节点  
    var tds = $("td");  
    //给所有的td节点增加点击事件  
    tds.click(tdclick);  
});  

//td的点击事件  
function tdclick(){  
    //保存当前的td节点  
    var td = $(this);  
      //1.取出当前td中的文本内容保存起来  
    var text = td.text();  
       //2.清空td中的文本内容  
    //第一种  
    td.html("");  
    //第二种  
    //td.empty();  
    //3.建立一个文本框 也就是input的元素节点 (没有尖括号时候是找,有尖括号时是创建)  
    var input = $("<input>");  

    //4.设置文本框的值是保存起来的文本内容  
    input.attr("value", text);  
    //4.5 让文本框能够响应键盘按下的事件  
    input.blur(function(event) {  
        var cfm = confirm("是否确认修改");  
          
        if(cfm){  
        //0 获取当前用户点击空白处时  
        //解决不同的浏览器获取时间的对象的差异  
        //var myEvent = event || window.event;  
        //var kcode = myEvent.keyCode;  
         //1 判断是否是回车按下  
        //if (kcode == 13)  
        //{  
        //var inputnode = $(this);  

        //2.获取当前文本框的内容  
        //var inputtext = inputnode.val();  
            var inputtext = input.val();  
        //3.清空td里面的内容  
        //var tdNode = inputnode.parent();  
            var tdNode = input.parent(); //拿到td节点  
        //4.将保存的文本框的内容填充到td中  
            tdNode.html(inputtext);  
        //5.让td重新拥有点击事件  
            tdNode.click(tdclick);  
        //}  
        }  
    });  
//    input.keyup(function(event) {  
//        //0 获取当前用户按下的键值  
//        //解决不同的浏览器获取时间的对象的差异  
//        var myEvent = event || window.event;  
//        var kcode = myEvent.keyCode;  
//         //1 判断是否是回车按下  
//        if (kcode == 13)  
//        {  
//        //var inputnode = $(this);  
//  
//        //2.获取当前文本框的内容  
//        //var inputtext = inputnode.val();  
//            var inputtext = input.val();  
//        //3.清空td里面的内容  
//        //var tdNode = inputnode.parent();  
//            var tdNode = input.parent(); //拿到td节点  
//        //4.将保存的文本框的内容填充到td中  
//            tdNode.html(inputtext);  
//        //5.让td重新拥有点击事件  
//            tdNode.click(tdclick);  
//        }  
//  
//    });  

       //5.把文本框加到td中去  
    td.append(input);//也可以用input.appendTo(td);  

    //5.5让文本狂中的文字被高亮选中  
    //需要将jquery的对象转换为dom对象  
    var inputdom = input.get(0);  
    inputdom.select();  
    //6.清除td上注册的点击事件  
    td.unbind("click");  
}  