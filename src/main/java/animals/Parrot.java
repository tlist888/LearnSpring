package animals;

import org.springframework.stereotype.Component;

@Component("parrot-kesha")
public class Parrot {

    private String name = "Кеша";

    public String getName() {
        return name;
    }
}
