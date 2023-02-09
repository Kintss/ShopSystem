/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemas;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lojaderoupa.Admin;

/**
 *
 * @author igorq
 */
public abstract class Sistema implements Serializable{
    
    public static void saveTabela(javax.swing.JTable tabela, String diretorio){
             
        try{
            FileWriter fw = new FileWriter(diretorio);
                  
            for (int i = 0; i < tabela.getRowCount(); i++) {
                for (int j = 0; j < tabela.getColumnCount(); j++) {
                    fw.write(tabela.getValueAt(i, j).toString() + ";");
                }
                
                fw.write("\n");
            }               
            fw.close();
         
        }catch(IOException ex){    
            
        }
    }
    
    public static void loadTabela(javax.swing.JTable tabela, String diretorio){
        
        try{
            DefaultTableModel tabelaProduto = (DefaultTableModel) tabela.getModel();
            if (tabelaProduto.getRowCount()>= 0){
                tabelaProduto.setRowCount(0);
            }

            BufferedReader br = new BufferedReader(new FileReader(diretorio));
            
            String linha = br.readLine();
            while(linha != null){
                Object[] obj = linha.split(";");
                tabelaProduto.addRow(obj);
                linha = br.readLine();
            }
            br.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }           
  
    public static void clearArquivo() throws IOException{
        
        FileWriter fw = new FileWriter("src\\sistemas\\dados\\Data.csv");
        fw.write("");
        fw.flush();
    }
    
    public static int verificaLogin(javax.swing.JTextField loginUsuario, javax.swing.JPasswordField loginSenha){
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("src\\sistemas\\dados\\Usuario.csv"));
            
            String linha = br.readLine();

            while(linha != null){
                String[] coluna = linha.split(";");
                
                String usuarioDado = coluna[0];
                String senhaDado = coluna[1];
                
                
                if (usuarioDado.equals(loginUsuario.getText()) && senhaDado.equals(loginSenha.getText())) {                  
                    if (loginUsuario.getText().equals("admin") && loginSenha.getText().equals("admin")) {
                        return 1;
                    }else{
                        return 2;
                    }
                }
                linha = br.readLine();
            }
            br.close();
            
   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;        
    }           
     
    public static boolean verificaCadastro(int usuarioOuSenha, String novoCadastro){

        try{
            BufferedReader br = new BufferedReader(new FileReader("src\\sistemas\\dados\\Usuario.csv"));
            
            String linha = br.readLine();
            String cadastroDado;
            while(linha != null){
                String[] coluna = linha.split(";");
                
                // 0 = usuario  1 = senha
                if(usuarioOuSenha == 0){
                    cadastroDado = coluna[0];
                    if(cadastroDado.equals(novoCadastro)){
                    return true;
                    }  
                }
                else if(usuarioOuSenha == 1){
                    cadastroDado = coluna[1];
                    if(cadastroDado.equals(novoCadastro)){
                    return true;
                    }
                }
                linha = br.readLine();
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static void cadastraUsuario(String novoLogin,String novaSenha){
            
        try{
            FileWriter fw = new FileWriter("src\\sistemas\\dados\\Usuario.csv", true);

            fw.write(novoLogin + ";" + novaSenha + "\n");
            fw.flush();
            fw.close();
          
        }catch(IOException ex){
            
        }
    }    

    public static void preencheTabelaLoja(javax.swing.JTable tabela){
        try{
            DefaultTableModel tabelaProduto = (DefaultTableModel) tabela.getModel();
            if (tabelaProduto.getRowCount()> 0){
                tabelaProduto.setRowCount(0);
            }
            
            BufferedReader br = new BufferedReader(new FileReader("src\\sistemas\\dados\\Data.csv"));
            
            String linha = br.readLine();
            while(linha != null){
                String[] coluna = linha.split(";");
                
                String[]colunaFiltrada= {coluna[0],coluna[1], coluna[2], coluna[3], coluna[4]};
                tabelaProduto.addRow(colunaFiltrada);
                linha = br.readLine();
            }
            br.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public static void geraTabelaEntregas(ArrayList<String> ids, String diretorio,  Endereco endereco){
             
        try{
            FileWriter fw = new FileWriter(diretorio);      

            for(String id: ids){
                fw.write(id + ";" + endereco.getCidade() + ";" + endereco.getRua() + ";" + endereco.getBairro() + ";");
                
                fw.write("\n");
            }
               
            fw.close();
          
        }catch(IOException ex){
            
        }
    } 

}    