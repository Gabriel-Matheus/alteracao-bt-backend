public class MVCController {
    @GetMapping("/projeto/{id}")
public String exibirProjeto(@PathVariable Long id, Model model) {
    Projeto projeto = projetoRepository.findById(id).orElse(null);
    if (projeto == null) {
        return "erro";
    }
    
    model.addAttribute("projeto", projeto);
    model.addAttribute("pnLhaList", pnLhaService.buscarPorProjeto(id));
    model.addAttribute("numeroList", numeroService.buscarPorProjeto(id));
    model.addAttribute("revisoesList", revisoesService.buscarPorProjeto(id));
    model.addAttribute("dataList", dataService.buscarPorProjeto(id));
    
    return "projeto";  // Nome do template (projeto.html)
}
}
