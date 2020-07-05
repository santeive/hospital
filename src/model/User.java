package model;

/*
La principal caracteristica de las clases abstractas es que no
necesita implementar todos los métodos de la clase heredada o interfáz
También al crear una clase abstract ya no podremos instanciar el metodo user

Las Clases Abstractas
Son una combinación entre interfaces y herencia donde no implementaremos todos
los métodos ni tampoco crearemos instancias de las clases padre.
*/

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Los metodos abstractos solo quedan declarados y se
    // definen en las clases hijas
    public abstract void ShowDataUser();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
