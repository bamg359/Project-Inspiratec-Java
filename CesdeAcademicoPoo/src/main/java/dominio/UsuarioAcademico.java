package dominio;

public class UsuarioAcademico {

    protected String city;
    protected int userId;
    protected String userName;
    protected String lastName;
    protected String email;
    protected String phone;
    protected int password;


    public UsuarioAcademico(){

    }

    public UsuarioAcademico(int userId, String userName, String lastName, String email, String phone, int password) {
        this.city = "Medellin";
        this.userId = userId;
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }



    public void createAcademicUser(){
        userId = 1;
    }




}
