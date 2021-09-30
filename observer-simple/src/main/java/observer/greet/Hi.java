package observer.greet;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Hi implements GreetObserver {

    @Override
    public boolean support(Class<? extends GreetObserver> greet) {
        return Hi.class.isAssignableFrom(greet);
    }

    @Override
    public void say() {
        log.info("hi");
    }
}
