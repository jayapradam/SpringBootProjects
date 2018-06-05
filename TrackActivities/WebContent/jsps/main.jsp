<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/myStyles.css" />
<title>Welcome To Jaya's Website</title>
<jsp:include page="header.jsp" />
</head>
<body>
	<FORM name="mainForm" action="" title="activityForm">
		<TABLE>
			<TR>
				<td><LABEL class="label1">Yoga:</LABEL></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><INPUT type="checkbox" height="20" size="10" width="50" /></td>
			</TR>
			<TR>
				<td><LABEL class="label1">Activity:</LABEL></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><SELECT size="1" id="activity">
						<OPTION value="--Please select--" selected="selected">--Please
							select--</OPTION>
						<OPTION value="Dhyana">Dhyana</OPTION>
						<OPTION value="Japa">Japa</OPTION>
						<OPTION value="Walking">Walking</OPTION>
				</SELECT></td>
			</TR>
			<TR>
				<td><LABEL class="label1">Date:</LABEL></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><INPUT type="date"  height="12" maxlength="10" /></td>
			</TR>
			<TR>
				<td><LABEL class="label1">Learning:</LABEL></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><TEXTAREA rows="4" cols="30" id="learning" wrap="soft"></TEXTAREA></td>
			</TR>
			<TR>
				<td><LABEL class="label1">Beauty:</LABEL></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><INPUT type="text" size="25" id="beauty" height="10"
					maxlength="25" /></td>
			</TR>
			<TR>
				<td><LABEL class="label1">Health:</LABEL></td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><INPUT size="25" id="health" height="10" maxlength="30" />
				</td>
		</TABLE>
		<div align="center">
			<INPUT id="submit" type="button" name="Save" size="30" value="Save"
				style="background-color: maroon; font-weight: 300; color: white;"></INPUT>
			&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; <INPUT type="button"
				id="cancel" name="Cancel" size="10" value="Cancel"
				style="background-color: maroon; font-weight: 300; color: white;"></INPUT>
		</div>
	</FORM>
	<footer draggable="true">
		<jsp:include page="footer.jsp" />
	</footer>
</body>
</html>