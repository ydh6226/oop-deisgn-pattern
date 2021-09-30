package observer.greet;

import lombok.extern.slf4j.Slf4j;

/**
 * GreetObserver를 구현은 했으나 구독을 하지 않았음.
 */
@Slf4j
public class Bonjour implements GreetObserver {

    @Override
    public boolean support(Class<? extends GreetObserver> greet) {
        return Bonjour.class.isAssignableFrom(greet);
    }

    @Override
    public void say() {
        log.info("bonjour");
    }
}
