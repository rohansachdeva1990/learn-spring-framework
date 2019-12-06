<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
<title>Student Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">

	First Name: <form:input path="firstName" />

		<br />
		<br />
	
	Last Name: <form:input path="lastName" />

		<br />
		<br />
	Country: <form:select path="country">
			<form:option value="India" label="India" />
			<form:option value="Belgium" label="Belgium" />
			<form:option value="Holland" label="Holland" />
			<form:option value="Italy" label="Italy" />
		</form:select>

		<br />
		<br />

		<!-- Here path, maps to the getter and setter, getCourse() or setCourse() -->
	Course: <form:select path="course">
			<form:options items="${student.courseOptions}" />
		</form:select>

		<br />
		<br />

	Marital Status: <form:select path="status">
			<form:options items="${theMaritalStatus}" />
		</form:select>

		<br />
		<br />

	Favorite Language:-	
		
		<br />
		Java<form:radiobutton path="favLanguage" value="Java" />
		Python<form:radiobutton path="favLanguage" value="Python" />
		Ruby<form:radiobutton path="favLanguage" value="Ruby" />
		C++<form:radiobutton path="favLanguage" value="C++" />

		<br />
		<br />

	Favourite Operating Systems:-
	
	<br />
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		MacOSX<form:checkbox path="operatingSystems" value="MacOSX" />
		Windows<form:checkbox path="operatingSystems" value="Windows" />
		Solaris<form:checkbox path="operatingSystems" value="Solaris" />
		<br />
		<br />
		
		<input type="submit" value="Submit" />

	</form:form>

</body>

</html>