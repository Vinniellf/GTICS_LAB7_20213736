package com.example.tarea.Controllers;

import com.example.tarea.Entities.Movieprojection;
import com.example.tarea.Repositories.BaseRepository;
import com.example.tarea.Repositories.MovieproRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/gerente")
public class GerenteController {

    final BaseRepository baseRepository;
    private final MovieproRepository movieproRepository;

    public GerenteController(BaseRepository baseRepository, MovieproRepository movieproRepository) {
        this.baseRepository = baseRepository;
        this.movieproRepository = movieproRepository;
    }



    @GetMapping("/proyecciones")
    public String sub2(Model model) {
        List<Movieprojection> proyecciones = movieproRepository.findAll();
        model.addAttribute("proyecciones", proyecciones);
        return "Gerente/proyecciones";
    }

    /*GetMapping("/sub2")
    public String sub2(@RequestParam("tipo") Long  tipo,
                        @RequestParam("color") Long  color,
                        @RequestParam("ocasion") Long  ocasion, Model model){
        //SUMAR LISTAS
        List<Flores> floresLis1 = floresRepository.findAll();
        List<Flores> floresLis2 = floresRepository.findAll();
        List<Flores> listaSumada = new ArrayList<>(floresLis1);

        model.addAttribute("cosas", listaSumada);
        return "plantilla";
     */

    /*@GetMapping("/editar")
    public String editarBase(Model model,
                                  @RequestParam("idEmployee") Integer id) {
        List<Job> listaJobs = employeesJobRepository.findAll();
        model.addAttribute("listaJobs", listaJobs);
        Optional<Employee> optionalEmployee = employeesRepository.findById(id);

        if(optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            model.addAttribute("employee", employee);
            return "catalogo";
        }else{
            return "redirect:/tarea/listar";
        }
    }*/

    /*@PostMapping("/guardar")
    public String guardar (Employee employee) {
        employeesRepository.save(employee);
        return "redirect:/tarea/listar";
    }*/

    /*@GetMapping("/borrar")
    public String borrarEmpleado(Model model, @RequestParam("idEmployee") int id, RedirectAttributes redirectAttributes) {
        try {
            employeesRepository.deleteById(id);
            redirectAttributes.addFlashAttribute("mensaje", "Se borró el empleado");
            redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("mensaje", "No se pudo borrar el empleado");
            redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
        }
        return "redirect:/employee/listar";
    }*/

}
