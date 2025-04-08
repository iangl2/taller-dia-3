
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        int[][] miArray = new int[3][3];
        int sum=0;
        String[] options = { "JOptionPane", "Scanner", "Buffer" };
    var selection = JOptionPane.showOptionDialog(null, "Seleccione uno:", "Sumar y Sacar Promedio de una Matriz 3X3", 
                                                      0, 3, null, options, options[0]);
        Scanner myObj = new Scanner(System.in);                                          
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
              
                }
            }
         JOptionPane.showMessageDialog(null,"La sumatoria es: "+sum , null,1);
         JOptionPane.showMessageDialog(null,"El promedio fue: "+(sum/9) , null,1);
        System.out.println(miArray);

    }
}