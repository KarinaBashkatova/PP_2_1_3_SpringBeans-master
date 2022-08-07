package app.model;

import org.springframework.stereotype.Component;

/**
 * @author Karina Bashkatova.
 */
@Component ("dogBean")
public class Dog extends Animal {

@Override
public String toString() {
    return "Im a Dog";
}
}

