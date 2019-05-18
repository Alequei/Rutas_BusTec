package com.example.proyectouber;

public class Items {
    int bacground;
    String perfil;
    int perfilimagen;
    int nbFollowes;

    public Items() {
    }

    public Items(int bacground, String perfil, int perfilimagen, int nbFollowes) {
        this.bacground = bacground;
        this.perfil = perfil;
        this.perfilimagen = perfilimagen;
        this.nbFollowes = nbFollowes;
    }

    public int getBacground() {
        return bacground;
    }

    public String getPerfil() {
        return perfil;
    }

    public int getPerfilimagen() {
        return perfilimagen;
    }

    public int getNbFollowes() {
        return nbFollowes;
    }

    public void setBacground(int bacground) {
        this.bacground = bacground;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setPerfilimagen(int perfilimagen) {
        this.perfilimagen = perfilimagen;
    }

    public void setNbFollowes(int nbFollowes) {
        this.nbFollowes = nbFollowes;
    }
}
