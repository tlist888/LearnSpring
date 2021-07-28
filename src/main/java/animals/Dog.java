package animals;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name = "Полкан";

    public String getName() {
        return name;
    }
}
