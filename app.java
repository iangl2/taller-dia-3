
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class app {
 

    public static void main(String[] args) {
        int sum=0;
        String[] options = { "JOptionPane", "Scanner", "Buffer" };
        var selection = JOptionPane.showOptionDialog(null, "Seleccione uno:", "Sumar y Sacar Promedio de una Matriz 3X3", 
        0, 3, null, options, options[0]);
        Scanner myObj = new Scanner(System.in);                                          
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int y;
        while (true) {
            
            try {
                if(selection==0){
                    
                    x= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ancho de la matriz"));
                    y= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura de la matriz"));
                    
                }
                else if (selection==1) {
                    System.out.println("Introduzca el ancho de la matriz");
                    x=  myObj.nextInt();
                    System.out.println("Introduzca la altura de la matriz");
                    y=  myObj.nextInt();
                } else {
                    System.out.println("Introduzca el ancho de la matriz");
                    x=  Integer.parseInt(bufer.readLine());
                    System.out.println("Introduzca la altura de la matriz");
                    y=  Integer.parseInt(bufer.readLine());
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e, null, 0);
                
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e, null, 0);
                
            }
        }


        int[][] miArray = new int[y][x];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                try {
                    if(selection==0){
                        
                        miArray[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el elemento en la posición ("+(j+1)+","+(i+1)+")"));
                    }
                    else if (selection==1) {
                        System.out.println("Introduzca el elemento en la posición ("+(j+1)+","+(i+1)+")");
                        miArray[i][j]=  myObj.nextInt();
                    } else {
                        System.out.println("Introduzca el elemento en la posición ("+(j+1)+","+(i+1)+")");
                        miArray[i][j]=  Integer.parseInt(bufer.readLine());
                    }
                    sum+=miArray[i][j];
                }
                catch (NumberFormatException e) {
                   JOptionPane.showMessageDialog(null, e, null, 0);
                   j--;
                } catch (IOException e) {
                    
                    JOptionPane.showMessageDialog(null, e, null, 0);

                    j--;

                }
              
                }
            }
            String finalMessageString="";
               for (int i = 0; i < y; i++) {
                   finalMessageString+="[";
                   for (int j = 0; j < x; j++) {
                       finalMessageString+= miArray[i][j];
                       if (j<x-1) {
                           finalMessageString+=",";
                       }
                   }
                   finalMessageString+="]\n";
   
               }
         JOptionPane.showMessageDialog(null,"La matriz es la siguiente:\n"+finalMessageString , null,1);

         JOptionPane.showMessageDialog(null,"La sumatoria es: "+sum , null,1);
         float promedio=(sum/(x*y));
         JOptionPane.showMessageDialog(null,"El promedio fue: "+promedio , null,1);
            
    }

}
