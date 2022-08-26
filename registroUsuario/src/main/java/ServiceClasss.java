import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ServiceClasss {
    public void printMessage(String[] arguments) {
        System.out.println("Inside NonWebService Class. Received below arguments");
        Arrays.stream(arguments).forEach(System.out::println);
    }
}
