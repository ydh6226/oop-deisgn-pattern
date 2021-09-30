package observer;

import lombok.RequiredArgsConstructor;
import observer.greet.GreetObservable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final GreetObservable greetObservable;

    @GetMapping("/")
    public void home() {
        greetObservable.say();
    }
}
