<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/index2.css">
<script type="text/javascript" src="/jquery-1.8.0.min.js"></script>
<script type="text/javascript">


</script>
<body>
<form action="/person/getPersonListget" method="post">
    <input type="text" name="mohu" value="${mohu}" >
    <button>模糊查询</button>
</form>
<table>
    <tr>
        <td><input type="checkbox" name="ch" onclick="qx()">全选</td>
        <td>ID</td>
        <td>姓名</td>
        <td>性别</td>
        <td>出生日期</td>
        <td>班级名称</td>
        <td>爱好</td>
        <td>创建时间</td>
        <td>信息</td>
    </tr>
<#list mapPersonList as m>
       <tr>
           <td><input type="checkbox" name="check" value="${m.id}"></td>
           <td>${m.id}</td>
           <td>${m.name}</td>
           <td>${m.sex}</td>
           <td>${m.birthday}</td>
           <td>${m.name1}</td>
           <td>${m.hname}</td>
           <td>${m.create_time}</td>
           <td>${m.jianjie}</td>
       </tr>
</#list>
  <tr>
      <td colspan="11">${page.page}当前${page.cpage}页/共${page.pagecount}页</td>
  </tr>
</table>
</body>
</html>