<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sistema de empleados</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<%@include file="common/navbar.jsp"%>

<div class="container">
    <div class="text-center">
        <h3 class="my-3">Agregar Empleado</h3>
    </div>
    <form action="/employees/add" modelAttribute="employeeForm" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="name" name="name" required>
        </div>
        <div class="mb-3">
            <label for="department" class="form-label">Departamento</label>
            <input type="text" class="form-control" id="department" name="department">
        </div>
        <div class="mb-3">
            <label for="salary" class="form-label">Sueldo</label>
            <input type="number" step="any" class="form-control" id="salary" name="salary">
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-warning btn-sm me-3">Agregar</button>
            <a href="/employees" class="btn btn-danger btn-sm">Regresar</a>
        </div>
    </form>
</div>

<%@include file="common/footer.jsp"%>
</body>
</html>