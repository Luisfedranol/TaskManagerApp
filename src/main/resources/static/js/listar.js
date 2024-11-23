document.addEventListener("DOMContentLoaded", function() {
    fetch("/api/tareas")
    .then(response => response.json())
    .then(data => {
        const tableBody = document.getElementById("tareasTableBody");
        data.forEach(tarea => {
            const row = `<tr><td>${tarea.nombre}</td><td>${tarea.descripcion}</td><td>${tarea.fechaInicio}</td></tr>`;
            tableBody.insertAdjacentHTML('beforeend', row);
        });
    });
});
