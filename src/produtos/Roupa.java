/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtos;


public abstract class Roupa {
    
    private static Integer id = 0;
    private String nome;
    private Float preco;
    private String categoria;
    private final String tamanho;
    
    public enum disponibilidade{
        DISPONIVEL,
        INDISPONIVEL;
    }
  
    public Roupa(String nome, Float preco, String categoria, String tamanho){
        id++;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.tamanho= tamanho;
    }

    public static int getId() {
        return id;
    }
    
    public static int setId(int id){
        return Roupa.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTamanho() {
        return tamanho;
    }
    
}
