<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Parameter enter</title>
</head>
<body>
	<h2>Value enter:</h2>
<?php
include_once 'function.php';

$pn = $_POST["paramnumber"];
parvalues($pn);
?>
	<form action="/" method="post" name="myReturnForm">
		<input type="submit" value="Return">
	</form>
</body>
</html>