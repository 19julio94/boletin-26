
package boletin26;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author JP
 */
public class Metodos {
    ArrayList <Integer> lista=new ArrayList();
     public void metodo(){
  
    
    if (lista.size()==6){
        JOptionPane.showMessageDialog(null,"Xa tes 6 numeros imprimeos");
    
    
                }
    
    
    
    }
     ArrayList <Integer> random=new ArrayList();
     public void random(){
         
        int n=49; 
        int k=n; 
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;
        
       
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            
        }
        
        for(int i=0;i<6;i++){
        random.add(resultado[i]);
        }
             
    }
     public void comparar(){
         int x=0;
         for(int i=0;i<6;i++){
             if(lista.get(0)==random.get(i)){
                 x++;
             }
             if(lista.get(1)==random.get(i)){
                 x++;
             }
             if(lista.get(2)==random.get(i)){
                 x++;
             }
             if(lista.get(3)==random.get(i)){
                 x++;
             }
             if(lista.get(4)==random.get(i)){
                 x++;
             }
             if(lista.get(5)==random.get(i)){
                 x++;
             }
             
         }
         if(x==0){
             JOptionPane.showMessageDialog(null, "PERDISTE");
         }
         else
             JOptionPane.showMessageDialog(null, "TIENES "+x+" ACIERTOS");
         
         
     }
         
         
         
     }
     
    

