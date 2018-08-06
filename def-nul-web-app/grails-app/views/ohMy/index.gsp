<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Command symptom evaluation...</title>
</head>
<body>
    <b>${command.class.name}:</b><br>
    <br>
    <g:if test="${command.errors.hasFieldErrors()}">
        <b>Symptom triggered for</b><br>
        <g:each var="e" in="${command.errors.allErrors}" >
            <b>Field:</b>&nbsp;${e.field}&nbsp;<b>error:</b>&nbsp;${e.codes.first()}<br>
        </g:each>
    </g:if>
    <g:else>
        Yay, no errors :)
    </g:else>

</body>
</html>
