<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>float1</title>
<style type="text/css">

div div{
border:1px solid black;
background-color: #2f3;

}

div{
border:1px solid black;
background-color: #f63;

}
#out{
    width: 300px;
    height: 300px;
    background-color: red;
}

#in{
    width: 100px;
    height: 100px;
    background-color: green;
}

#div1{
    width: 100px;
    height: 50px;
    background-color: red;
}

#div2{
    width: 200px;
    height: 50px;
    background-color: green;
}

#div3{
    width: 300px;
    height: 50px;
    background-color: black;
}

#div4{
    width: 400px;
    height: 50px;
    background-color: blue;
}

#input1{

}

#input2{

}

#input3{

}

#input4{

}

</style>

</head>
<body>
<span>The following is minimal code for the example graphic:</span>

<div style="float:left; width:40%;"><p>Float text</p></div>
<p>
Paragraph text outside the float
</p>	
<div id="div1">div1</div>
    <div id="div2">div2</div>
    <div id="div3">div3</div>
    <input id="input1" type="text" value="input1">
    <div id="div4">div4</div>
    <input id="input2" type="text" value="input2">
    <input id="input3" type="text" value="input3">
    <input id="input4" type="text" value="input4">
    

 <div id="out">
        <div id="in">
            div_in
        </div>
    </div>
<div style="width:300px">1</div>
<div style="width:200px">2</div>
<input type="text">
<div style="width:350px">3</div>
<div style="width:900px">4</div>


<div id="div44">
<div style="">1</div>
<div style="">2</div>
<div style="">3</div>
<div style="">4</div>
</div>

<div id="div55">
<div style="width:300px">1</div>
<div style="width:200px">2</div>
<div style="width:150px">3</div>
<div style="width:900px">4</div>
</div>


</body>
</html>