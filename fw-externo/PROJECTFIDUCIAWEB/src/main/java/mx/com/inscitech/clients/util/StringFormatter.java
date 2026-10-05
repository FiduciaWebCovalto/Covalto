/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class StringFormatter 
{

  public String formatMoney(String sNumber) 
  {
     BigDecimal payment = new BigDecimal(sNumber);
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); 
      double doublePayment = payment.doubleValue();
      return n.format(doublePayment);
  }

 
  public static void main(String[] args)
  {
    StringFormatter stringFormatter = new StringFormatter();
  }
}