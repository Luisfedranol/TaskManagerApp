package _ListaTareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> listar() {
        return tareaService.obtenerTodasLasTareas();
    }

    @PostMapping
    public Tarea guardar(@RequestBody Tarea tarea) {
        return tareaService.guardarTarea(tarea);
    }
}
