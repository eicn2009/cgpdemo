<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Refresh" content="60">
<title>html5/formField</title>
</head>
<body>

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

<script>

</script>
</body>
</html>