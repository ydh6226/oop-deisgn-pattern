package observer.greet;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class GreetObservable {

    private final List<GreetObserver> greetObservers = new ArrayList<>();

    public void say() {
        greetObservers.forEach(GreetObserver::say);
    }

    public void say(Class<? extends GreetObserver> target) {
        greetObservers.stream()
                .filter(g -> g.support(target))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("greets 리스트에 등록이 되지 않았습니다."))
                .say();
    }

    public GreetObservable subscribe(GreetObserver greetObserver) {
        greetObservers.add(greetObserver);
        return this;
    }
}
