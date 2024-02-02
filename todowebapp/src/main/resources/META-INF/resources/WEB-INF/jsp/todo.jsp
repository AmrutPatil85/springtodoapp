<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<div class="container">
<h3>Enter Todo Details</h3>
<form:form method="post" modelAttribute="todo">         <!modelAttribute="todo" to add todo tie>
<fieldset class="mb-3">
    <form:label path="description">Description</form:label>
    <form:input type="text" path="description" required="required"/>
    <form:errors path="description" cssClass="text-warning"/>   <!add validation to bean>
</fieldset>

<fieldset class="mb-3">
    <form:label path="targetDate">Targate Date</form:label>
    <form:input type="text" path="targetDate" required="required"/>
    <form:errors path="targetDate" cssClass="text-warning"/>   <!add validation to bean>
</fieldset>
<form:input type="hidden" path="id" />
 <form:input type="hidden" path="done" />
<input type="submit" class="btn btn-success"/>

</form:form>
</div>
<%@ include file="common/footer.jspf" %>

<script type="text/javascript">
$('#targetDate').datepicker({
format: 'yyyy-mm-dd'
});
</script>


