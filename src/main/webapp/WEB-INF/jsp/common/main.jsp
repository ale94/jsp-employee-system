<div class="container">
    <div class="text-center">
        <h3 class="my-3">Sistema de empleados</h3>
    </div>
    <div class="container">
        <table class="table table-striped table-hover table-bordered align-middle">
            <thead class="table-dark text-center">
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Nombre</th>
                <th scope="col">Departamento</th>
                <th scope="col">Sueldo</th>
                <th scope="col">Accion</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <th scope="row">${employee.id}</th>
                    <td>${employee.name}</td>
                    <td>${employee.department}</td>
                    <td>
                        <fmt:setLocale value="en_US"/>
                        <fmt:formatNumber type="currency" value="${employee.salary}"/>
                    </td>
                    <td class="text-center">
                        <c:set var = "urlEdit">
                            <c:url value = "/edit">
                                <c:param name="id" value="${employee.id}"/>
                            </c:url>
                        </c:set>
                        <a href="${urlEdit}" class="btn btn-warning btn-sm me-3">Editar</a>

                        <c:set var = "urlDelete">
                            <c:url value = "/delete">
                                <c:param name="id" value="${employee.id}"/>
                            </c:url>
                        </c:set>
                        <a href="${urlDelete}" class="btn btn-danger btn-sm me-3">Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>