package animals;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name = "Барсик";

    public String getName() {
        return name;
    }
}
