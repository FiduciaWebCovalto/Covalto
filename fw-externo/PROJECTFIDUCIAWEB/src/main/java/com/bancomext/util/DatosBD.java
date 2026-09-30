/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.util;
import java.util.*;

public class DatosBD {
    
    public Vector vtrDatos = new Vector (1,1);
    public void setDataBO (  double dblDato)
    {
            vtrDatos.add (  Double.valueOf(dblDato)  );
    }	
    public void setDataBO (  String strDato)
    {
            vtrDatos.add (  strDato  );
    }
    public void setDataBO ( int intDato)
    {
            vtrDatos.add (  Integer.valueOf(intDato)  );
    }
    public Object getDatoBD ( int intPosicion)
    {
            return vtrDatos.elementAt ( intPosicion );
    }
    public void verDatos ()
    {
         for (int a= 0;  a < vtrDatos.size();  a++)
             System.out.println ("dato " + a + " - " + vtrDatos.elementAt(a) );
    }
    
    public void limpiarDatos ()
    {
       vtrDatos.clear();
    }	
}
