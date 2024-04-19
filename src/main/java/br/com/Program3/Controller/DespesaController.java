package br.com.Program3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DespesaController {

    @RequestMapping("/despesas/nova")
    public String nova(){
        return "CadastroDespesa1";
    }
}
