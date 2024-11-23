document.getElementById("tareaForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const tarea = {
        nombre: document.getElementById("nombre").value,
        descripcion: document.getElementById("descripcion").value,
        fechaInicio: document.getElementById("fechaInicio").value
    };
    fetch("/api/tareas", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(tarea)
    })
    .then(response => response.json())
    .then(data => {
        alert("Tarea guardada con éxito");
        window.location.href = "listar.html";
    });
});
