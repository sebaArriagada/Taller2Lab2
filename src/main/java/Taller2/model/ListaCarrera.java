package Taller2.model;

public enum ListaCarrera {
    ICII("ICI-I"),
    ICIB("ICI-B"),
    ICIM("ICI-M"),
    ENFERMERIA("Enfermeria");

    private String listaCarrera;

    private ListaCarrera(String listaCarrera){
        this.listaCarrera = listaCarrera;
    }
    public String getListaCarrera(){
        return listaCarrera;
    }

}
