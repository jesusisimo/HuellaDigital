/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package validaciones;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author jesus
 */
public class Validaciones {


//validacion de digito----------------------------------------------------------------------
public boolean EsDigito(char c){

boolean res=false;
if ( c>= '0'&& c<='9' ){
res= true;
}
return res;
}
//---validacion de solo letras-------------------------------------------------------------------
public boolean SoloLetras(String cad) {
boolean res=true;
int n=cad.length();
int j;
char c;
if(NoVacio(cad)==true){
for ( j=0;j<n && res== true;j++){
c=cad.charAt(j);
if (EsDigito(c)== true )
res=false;
}
}
return res;
}
//---validacion qu el campo no este vacio-------------------------------------------------------------------
public boolean NoVacio(String cad) {
boolean res=true;
int n=cad.length();
if (n>= 1 ){
res=false;
}
return res;
}

//--------------------------------------------------------------------------------



}
