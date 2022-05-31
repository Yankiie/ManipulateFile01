package View;

import java.io.IOException;

import Controller.Controller;
import Controller.IController;

public class Main {

    public static void main(String[] args) {
        IController controller = new Controller();
        String path = "C:\\TEMP\\Aula";
        try {
            controller.readFile(path, "generic_food.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}