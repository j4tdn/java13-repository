<%@include file="../taglib/import.jsp" %>
<html>
<head>
    <title>403 PAGE</title>
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
</head>

<body>
<h2>You are not authorized to access this page!</h2>
<hr>
<h5>You are about to exit in <span id="second"> 10 </span> seconds!</h5>
<a href="${contextPath}/">Go to homepage!</a>
</body>
<script>
    let counter = 10;
    let interval = setInterval(() => {
        document.querySelector("#second").textContent = counter.toString();
        counter--;
        if (counter === 0) {
            window.location.href = "${contextPath}"
            clearInterval(interval);
        }
    }, 1000)
</script>
</html>
