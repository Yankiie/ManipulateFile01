package Controller;

import java.io.IOException;

public interface IController {
    public void readFile(String path, String nome) throws IOException;
}