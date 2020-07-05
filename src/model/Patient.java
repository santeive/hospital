package model;

public class Patient extends User{
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {
        //Cómo los atributos name e email ya no forman parte de la clase Patient, se deben pasar a
        // super por que pertenecen a la clase padre.
        super(name, email);
    }

    //La implementación de los metodos abrstractos es obligatoria
    // Y la implementación es totalmente personalizada
    @Override
    public void ShowDataUser() {
        System.out.println("Aqui vamos a definir otro medoto para paciente");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
