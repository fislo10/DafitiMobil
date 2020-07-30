package com.tcs.trainingxi.dafitimovil.models;

public class Credenciales {
    private String usuario;
    private String password;

    public Credenciales(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Credenciales{" +
                "usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
