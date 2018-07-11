select EmployeeID,ContactID, LoginID,
Title
FROM HumanResources.Employee
WHERE EmployeeID=1 OR EmployeeID=2
FOR XML RAW

SELECT ProductID,Name,Color
FROM Production.Product Product
WHERE ProductID=1 OR ProductID=137
FOR XML RAW,ELEMENTS XSINIL

select EmployeeID,ContactID, LoginID,
Title
FROM HumanResources.Employee
WHERE EmployeeID=1 OR EmployeeID=2
FOR XML AUTO

SELECT ProductID,Name,Color
FROM Production.Product Product
WHERE ProductID=1 OR ProductID=137
FOR XML AUTO,ELEMENTS


Select * from Production.Product



SELECT 1 AS Tag,
Null as Parent,
ProductID AS [Product!1!ProductID],
					Name    AS
[Product!1!ProductName!element],
					Color   AS
[Product!1!ProductColor!elementxsinil]
FROM Production.Product
WHERE ProductID=1 OR ProductID=317
FOR XML EXPLICIT
