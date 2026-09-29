/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.lib;
import java.lang.*;
import java.io.*;
import com.bancomext.negocio.FiduciaBD;
public class SDemo {
	public static FiduciaBD BD=new FiduciaBD();
    public static String Sequence;
    public static String Receipt;
    public static int ReceiptLen;
    public static String ErrorMessage;
    public static String Data;
    
    public native int AuthenticatePKCS7 (String IP,
                                         int Port,
                                         String Folio,
                                         int FolioLen,
                                         String Serial,
                                         int SerialLen,
                                         String PKCS7,
                                         int PKCS7Len,
                                         String ExternContent,
                                         int ExternContentLen,
                                         char GetReceipt);
                                             

    public native int AuthenticateReceipt (String CerSrv,
                                           int CerSrvLen,
                                           String Receipt,
                                           int ReceiptLen);

    public native int GetSerialStatus (String IP,
                                       int Port,
                                       String Folio,
                                       int FolioLen,
                                       String Serial,
                                       int SerialLen,
                                       String GetReceipt);
                               
     
    static {
         System.load (BD.getDatosParametros(108).replace('/',File.separatorChar ));
            }
    
}

