package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Random;

@SpringBootApplication
@RestController
public class Application {

  static class Self {
    public String href;
  }

  static class Links {
    public Self self;
  }

  static class PlayerState {
    public Integer x;
    public Integer y;
    public String direction;
    public Boolean wasHit;
    public Integer score;
    
    public Coordinate getCoordinate(){
      return new Coordinate(x,y);
    }
  }

  static class Arena {
    public List<Integer> dims;
    public Map<String, PlayerState> state;
  }

  static class ArenaUpdate {
    public Links _links;
    public Arena arena;
  }
  
  static class Coordinate{
    Integer x,y;
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.initDirectFieldAccess();
  }

  @GetMapping("/")
  public String index() {
    return "Let the battle begin!";
  }
  
  Coordinate lastCo;
  String lastAction;
  
  @PostMapping("/**")
  public String index(@RequestBody ArenaUpdate arenaUpdate) {
    
    PlayerState my State = areaUdate.arena,state.get(arenaUpdate._links.self.href);
    Map<Coordinate, PlayerState> map = buildMap(arenaUpdate);
    
    System.out.println(arenaUpdate);
    String[] commands = new String[]{"F", "R", "L", "T"};
    int i = new Random().nextInt(4);
    return commands[i];
  }



  if (someoneINfrontOfMe(mystate,map)){
  lastCo = mystate.getCoordinate();
  lastAction = "T";
  return "T";
}
  
  
  
  
}

