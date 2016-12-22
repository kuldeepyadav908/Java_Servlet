<!DOCTYPE html>
<html>
	<body>
		<center>
			<h1>JLC BookStore</h1>
			<h2>Book Search</h2>
			<form action="searchbook.jlc" method="POST">
			<table>
				<tr>
					<td><select name="category">
							<option value="Select">Select</option>
							<option value="JAVA">JAVA</option>
							<option value="Testing">Testing</option>
							<option value=".Net">.Net</option>
							<option value="SAP">SAP</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="SearchBooks"/>
					</td>
				</tr>
			</table>
			</form>
		</center>
	</body>
</html>