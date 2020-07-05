import model.Doctor;
import model.Patient;
import model.User;

import java.text.ParseException;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        //Se llama como si fuera esta clase
        //Variables estáticas que el scope sea mas allá de la clase
        // Los métodos estaticos se pueden llamar sin instanciar la clase: Cómo show
        showMenu();
    }
}
