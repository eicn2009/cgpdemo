<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Refresh" content="60">
<script src="common/js/vue.js"></script>
<title>vue/vuePage</title>
</head>
<body>
vue/vuePage
<form method="get" action="" target="_blank"  id="formtest">
<input type="text" name="i1" disabled>
<input type="email" checked>
<label> <input type="tel" name="i2" required> test</label>
<input type="image">
<input type="color" name="colorname" />
<input type ="submit" name="ok1">

<select>
  <optgroup label="Swedish Cars">
    <option value="volvo">Volvo</option>
    <option value="saab">Saab</option>
  </optgroup>
  <optgroup label="German Cars">
    <option value="mercedes">Mercedes</option>
    <option value="audi">Audi</option>
  </optgroup>
</select>
</form>
<div id="app">
  <p>{{ message }}</p>
</div>

<div id="app-2">
  <span v-bind:title="message">
    鼠标悬停几秒钟查看此处动态绑定的提示信息！
  </span>
</div>
<div id="app-6">
  <p v-if="t">{{ message6 }}</p>
  <input v-model="message6">
  <input v-model="t" form="formtest" name="t2" type="text">
</div>
<script>
var MyVue = Vue.extend({
	updated:function(){
		console.log("Vue have a updated!"+this.$data.t);
	}
});

new Vue({
  el: '#app',
  data: {
    message: 'Hello Vue.js!'
  }
})

new MyVue(
		{
			el: '#app-6',
	        data: {
	        	message6:'hello vue input!',
	        	t:true
	        }
			
		}
		)

var app2 = new Vue({
	  el: '#app-2',
	  data: {
	    message: '页面加载于 ' + new Date()
	  }
	})
</script>
</body>
</html>