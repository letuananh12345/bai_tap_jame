package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @RequestMapping("/home") //controller 1
    public String home(){
      return "Home";//tên của ( .jsp)
  }
  @RequestMapping("/toan") //controler 2
  public String toan(){
      return "Toan";//tên của ( .jsp)
  }
}
