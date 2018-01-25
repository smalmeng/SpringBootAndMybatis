<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${name}
${project}
<table border="1" cellspacing="0" cellpadding="20">
	<thead >
		<th>id</th>
		<th>名称</th>
		<th>年龄</th>
		<th>职业</th>
	</thead>
	<tbody>
	 	<#list list as list>   
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.age}</td>
				<td>${list.work}</td>
			</tr>
		</#list> 
	</tbody>
</table>

</body>