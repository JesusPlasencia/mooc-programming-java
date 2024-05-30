package mooc.logic;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        // Working
        IntStream.range(0, times).forEach(i -> {
            System.out.println("Application logic is working");
            ui.update();
        });
        // Working
//        for (int i = 0; i < times; i++) {
//            System.out.println("Application logic is working");
//            ui.update();
//        }
    }

}
