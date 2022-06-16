package comGestaoExemplo.GestaoBibliotecaUNIT.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Obra {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String editora;
    private int ano;
    private String idioma;
    private String autor;
    
    public Obra(String name, String editora, int ano, String idioma, String autor) {
        this.name = name;
        this.editora = editora;
        this.ano = ano;
        this.idioma = idioma;
        this.autor = autor;
    }

    public Obra() {
        
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
