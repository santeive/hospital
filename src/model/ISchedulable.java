package model;

import java.util.Date;

//En el caso de las interfaces es obligatoria su implementacion en las clases hijas
//La herencia puede ser multiple entre interfaces
//En esta interfaz solo declaramos el método
//Con private y default se puede definir el comportamiento de los metodos heredados por la interfaz
public interface ISchedulable {
    void schedule(Date date, String time);
}
