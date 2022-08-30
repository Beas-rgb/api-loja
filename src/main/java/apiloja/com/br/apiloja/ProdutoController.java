package apiloja.com.br.apiloja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "produto")
@CrossOrigin("*")
public class ProdutoController{

  @GetMapping(path = "/")
  public @ResponseBody String lista(){
    return "Test do Spring";
  }
}