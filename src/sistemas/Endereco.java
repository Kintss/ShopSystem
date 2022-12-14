/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author igorq
 */
public class Endereco {
    
    private String cidade;
    private String rua;
    private String bairro;

    
    public Endereco(String cidade, String rua, String bairro){
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public void arquivaEndereco(){                 
        try{
            File arquivo = new File("src\\sistemas\\dados\\Endereco.csv");
            FileWriter fw = new FileWriter(arquivo, true);

            fw.write(this.cidade + ";" + this.rua + ";" + this.bairro + "\n");
            fw.flush();
            fw.close();
          
        }catch(IOException ex){
            
        }
    }    
}


