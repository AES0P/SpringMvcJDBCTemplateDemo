<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%--&lt;%&ndash;<form id="loginForm" action="login" method="post">&ndash;%&gt; 如果js中指定了action，这里就不用写action了--%>
<form id="loginForm"  method="post">
    <div>
        <label>username</label>
        <input type="text" name="username"/>
    </div>
    <div>
        <label>password</label>
        <input type="password" name="password"/>
    </div>
    <div>
        <button id="loginBtn" type="submit" class="btn btn-default">登录</button>
    </div>
    <div>
        <input type="reset" value="重置"/>
    </div>
</form>


<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
<script src="https://cdn.bootcss.com/jquery-validate/1.19.0/jquery.validate.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script>
    $(function(){
        $("#loginBtn").click(function(){
            $("#loginForm").submit();
        });
        $("#loginForm").validate({
            errorElement : "span",
            errorClass : "text-danger",
            rules : {
                "username" : {
                    required : true
                },
                "password" : {
                    required : true
                }
            },
            messages : {
                "username" : {
                    required : "账号不能为空"
                },
                "password" : {
                    required : "密码不能为空"
                }
            },
            submitHandler : function(){
                $.ajax({
                    url : "loginCheck.do",
                    type : "POST",
                    data : $("#loginForm").serialize(),
                    beforeSend : function(){
                        $("#loginBtn").attr("disabled", "disabled").text("登录中...")
                    },
                    success : function(res){
                        alert(res)
                        if (res == "OK"){
                            window.location.href = 'result';
                        }
                    },
                    error : function(){
                        alert("系统繁忙,请稍后再试!")
                    },
                    complete : function(){
                        $("#loginBtn").removeAttr("disabled").text("登录")
                    }
                });
            }
        });

    });
</script>
</body>
</html>

