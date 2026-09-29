/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.negocio;
 
public  class edoResFormulas {
     
     
    private static int sal_num_ctam;
    private static int sal_num_scta;
    private static int sal_num_sscta;
    private static int sal_num_ssscta;
    private static double SAL_NUM_AUX2;
    private static double SAL_NUM_AUX3;
    private static double sal_imp_saldo_act ;
    
    public boolean bInteCobra;
    public boolean bVentas;
    public boolean bComiCobra;
    public boolean bIngresos_por_servicio;
    public boolean bDonativos;    
    public boolean bPrimaXgar;
    public boolean bUdis;
    public boolean bRes_por_valuacion;
    public boolean b_5209;
    public boolean bCambios;
    
    public boolean bIntePagado;
    public boolean bComiPag;
    public boolean bDividendosPag;
    public boolean bEtiqueta_cambios;
    public boolean bEtiqueta_resultados;
    
    public boolean bCambios1;
    public boolean bCosPer;
    public boolean bCosAdmi;
    public boolean bEntregas_a_fideicom;
    public boolean bGastos_administrativo;
    public boolean bHonorarios;
    public boolean bCastigos;
    public boolean bImpDiver;
    public boolean bOtrosIng;
    public boolean bAplicacion;
    public boolean bQuebrantos;
    public boolean bOtros_Gastos;
    public boolean bAplicacion1;
    public boolean bAfectacion;
    
    
     
    public  edoResFormulas(){
    							    bInteCobra = false;
								    bVentas = false;
								    bComiCobra = false;
								    bIngresos_por_servicio = false;
								    bDonativos = false;    
								    bPrimaXgar = false;
								    bUdis = false;
								    bRes_por_valuacion = false;
								    b_5209 = false;
								    bCambios = false;
								    
								    bIntePagado = false;
								    bComiPag = false;
								    bDividendosPag = false;
								    bEtiqueta_cambios = false;
								    bEtiqueta_resultados = false;
								    
								    bCambios1 = false;
								    bCosPer = false;
								    bCosAdmi = false;
								    bEntregas_a_fideicom = false;
								    bGastos_administrativo = false;
								    bHonorarios = false;
								    bCastigos = false;
								    bImpDiver = false;
								    bOtrosIng = false;
								    bAplicacion = false;
								    bQuebrantos = false;
								    bOtros_Gastos = false;
								    bAplicacion1 = false;
								    bAfectacion = false;
    							}
     

   
     public static void setValores (int sal_num_ctam, int sal_num_scta, int sal_num_sscta,int sal_num_ssscta,  double SAL_NUM_AUX2, double SAL_NUM_AUX3, double sal_imp_saldo_act)
						    {
						    	
						    	edoResFormulas.sal_num_ctam = sal_num_ctam ;
							    edoResFormulas.sal_num_scta = sal_num_scta;
							    edoResFormulas.sal_num_sscta = sal_num_sscta;
							    edoResFormulas.sal_num_ssscta = sal_num_ssscta;
							    edoResFormulas.SAL_NUM_AUX2 = SAL_NUM_AUX2;
							    edoResFormulas.SAL_NUM_AUX3 = SAL_NUM_AUX3;
							    edoResFormulas.sal_imp_saldo_act =sal_imp_saldo_act;
						    }    
        
    public  String Importe_Pesos (int SAL_NUM_AUX1)
    	{
        if  (SAL_NUM_AUX1 == 3042 )
            return "(Importe en UDI'S)";
        else 
            return "(Importe en Pesos)";
   		}

/********************************************************************************************************************
INGRESOS
*********************************************************************************************************************/   	 

   //INTERESES COBRADOS     	
   public double InteCobra( )
		{
   		
        if  (sal_num_ctam == 5201 && sal_num_scta == 0 &&  sal_num_sscta ==0 &&  sal_num_ssscta ==0   &&   SAL_NUM_AUX2 ==0 &&  SAL_NUM_AUX3 ==0 )
            {
            bInteCobra=true;	
            return  sal_imp_saldo_act * -1 ; 
        	}
        else 
            return 0;
    	}
    
    //VENTAS    
    public  double ventas(  )
    		{
	        if  (
	        	(sal_num_ctam == 5210 &&  sal_num_scta ==0 &&  sal_num_sscta ==0 &&  sal_num_ssscta ==0) ||
	        	(sal_num_ctam  == 5211 &&  sal_num_scta ==0 &&  sal_num_sscta ==0 && sal_num_ssscta ==0) &&   
	        	 SAL_NUM_AUX2 ==0 &&  SAL_NUM_AUX3 ==0 
	        	 )
	        	{
	        	bVentas=true;	
	            return  sal_imp_saldo_act  * -1;
	        	}
	        else 
	            return 0;
    		}
    
    //COMISIONES COBRADAS
    public double comiCobra( ){
        if (sal_num_ctam  == 5202  &&  sal_num_scta ==0 &&  sal_num_sscta ==0 &&  sal_num_ssscta ==0 &&   SAL_NUM_AUX2 ==0 &&  SAL_NUM_AUX3 ==0)
        	{
        	bComiCobra=true;;
            return   sal_imp_saldo_act  * -1;
        	}
        else 
         return 0;
    }
    
    //INGRESOS POR SERVICIO
    
    public double ingresos_por_servicio ()
    	{
    	if  ( sal_num_ctam  == 5212 && sal_num_scta ==0	&& sal_num_sscta ==0 && sal_num_ssscta ==0 &&  SAL_NUM_AUX2 ==0 && SAL_NUM_AUX3 ==0)
 			{
 			bIngresos_por_servicio=true;
 			return  sal_imp_saldo_act  * -1;
 			}
 	   else 
 	   		return 0;
    	} 
    	
    //DONATIVOS  
    public double donativos (  )
    	{
        if (sal_num_ctam  == 5214 &&  sal_num_scta ==0 &&  sal_num_sscta ==0 &&  sal_num_ssscta ==0  &&   SAL_NUM_AUX2 ==0 &&  SAL_NUM_AUX3==0)
            {
            bDonativos=true;
            return  sal_imp_saldo_act  * -1;
        	}
        else 
            return 0;
    	}
    
    //PRIMAS POR GARANTIAS
    public double primaXgar(  )
    	{
        if (sal_num_ctam  == 5208 &&  sal_num_scta ==0 &&  sal_num_sscta ==0 &&  sal_num_ssscta ==0  && SAL_NUM_AUX2 ==0 &&  SAL_NUM_AUX3 ==0)
        	{
        	bPrimaXgar=true;	
            return  sal_imp_saldo_act* -1;
        	}
        else 
            return 0;
   		}
    
    //INTERESES COBRADOS SOBRE VALORES GUBERNAMENTALES UDI'S
    public double udis ( )
    	{
        if (sal_num_ctam==5226 && sal_num_scta==0 &&  sal_num_sscta==0 &&  sal_num_ssscta==0 && SAL_NUM_AUX2 ==0 && SAL_NUM_AUX3==0)
        	{
        	bUdis=true;	
            return   sal_imp_saldo_act * -1 ;
        	}
        else 
         	return 0;
   		 }
    
    //RESULTADO POR VALUACION
    public double res_por_valuacion ( )
    	{
        if (sal_num_ctam==5139 && sal_num_scta==0 &&  sal_num_sscta==0 &&  sal_num_ssscta==0 && SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
            {
            bRes_por_valuacion=true;
            return sal_imp_saldo_act* 1;
        	}
        else 
            return 0;
   		 }
   
    //CAMBIOS
    public double Cambios( )
    	{
        if (sal_num_ctam==5205 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 && SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bCambios=true;
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    }
    
  //VALORIZACIÓN CUENTAS EN OTRAS MONEDAS
   	public double _5209 ( )
   			{
        if  (sal_num_ctam == 5209 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 && SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	b_5209 = true;	
            return sal_imp_saldo_act  * -1;
        	}
        else 
            return 0;
            }


/********************************************************************************************************************
INGRESOS
*********************************************************************************************************************/   	 


 
	//INTERESES PAGADOS
	 
    public double IntePagado( )
    	{
        if(sal_num_ctam==5102 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bIntePagado=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    	}
    	
    	
    //COMISIONES PAGADAS	
    public double comiPag( )
    	{
        if  (sal_num_ctam==5103 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bComiPag=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    	}
    
    //DIVIDENDOS PAGADOS
    public double dividendosPag ( )
    	{
        if (sal_num_ctam==5120 && sal_num_scta==1 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bDividendosPag=true;	
            return sal_imp_saldo_act ;
        	}
        else 
           return 0;
    	} 
    	
    //CAMBIOS	   
    public double etiqueta_cambios (double sumCambios)
    			{
    				
        if(sumCambios>0)
            {
            bEtiqueta_cambios=true;	
            return  sumCambios;	
	
        	}	
        else  
        	{
			bEtiqueta_cambios=false;	
			return 0;
        	}
    			}
    			
    //RESULTADO POR VALUACION			
    public double etiqueta_resultados(double sumRes_por_valuacion)
    		{
           if(sumRes_por_valuacion<0)
	            {
	            bEtiqueta_resultados=false;	
				return 0;	
	        	}	
	        else  
	        	{
				
				bEtiqueta_resultados=true;	
	            return  sumRes_por_valuacion;
	        	}
    		}
    		
    //		
    public double cambios1( )
    	{
        if (sal_num_ctam==5205 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0  &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
            {
            bCambios1=true;	
            return sal_imp_saldo_act * -1 ;
        	}
        else 
            return 0;
    	}
    
    //COSTO DE PERSONAL
    public  double cosPer( )
    	{
        if ((sal_num_ctam==5105 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) ||
            (sal_num_ctam==5106 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) &&  
             SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
            {
            bCosPer=true;	
            return sal_imp_saldo_act ;
        	}
        else 
            return 0;
    	}
    
    //COSTO DE ADMINISTRACION
    public double cosAdmi ( )
    	{
        if (sal_num_ctam==5111 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        		{
        		bCosAdmi=true;	
                return sal_imp_saldo_act;
            	}
       else 
                return 0;
    	}
    
    //ENTREGAS A FIDEICOMISARIOS O FIDEICOMITENTES
    
    public double  entregas_a_fideicom ( )
    	{
        if(sal_num_ctam==5119 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 && SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bEntregas_a_fideicom=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    	}
    
    //GASTOS ADMINISTRATIVOS UDI'S
    public double gastos_administrativo ( )
    		{
        if  (sal_num_ctam==5132 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0  &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bGastos_administrativo=true;	
            return sal_imp_saldo_act ;
        	}
        else 
            return 0;
    		}
    
    //HONORARIOS
    public double honorarios  ( )
    		{
        if  (sal_num_ctam==5108 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0  &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bHonorarios=true;	
            return sal_imp_saldo_act ;
        	}
        else 
            return 0;
    		}
    
    //CASTIGOS, DEPRECIACIONES Y AMORTIZACIONES
    public double castigos( )
    		{
        if  (
        	(sal_num_ctam==5114 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) ||
            (sal_num_ctam==5115 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) ||
            (sal_num_ctam==5121 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) &&  
             SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0
            )
            {
            bCastigos=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    		}
    
    //IMPUESTOS DIVERSOS
    public double  impDiver  ( )
    	{
        if  (
        	(sal_num_ctam == 5113 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) ||
            (sal_num_ctam == 5141 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) ||
            (sal_num_ctam == 5118 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) &&  
             SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0 
            )
            {
            bImpDiver=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    	}
    	
    
    //OTROS INGRESOS, BENEFICIOS Y RECUPERACIONES
    public double otrosIng ( )
    		{
        if  (
            (sal_num_ctam==5203 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
            (sal_num_ctam==5206 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
            (sal_num_ctam==5207 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
            (sal_num_ctam==5213 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) 
            )
            {
            bOtrosIng=true;	
            return sal_imp_saldo_act * -1;
        	}
        else {
            if (sal_num_ctam == 5133 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
                {
                bOtrosIng=true;		
                return sal_imp_saldo_act * -1;
            	}
            else 
                return 0;
        }
    }
    
    //APLICACION REMANENTES
    public double aplicacion ( )
    	{
    	
        if  (
        	(sal_num_ctam==5134 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) ||
            (sal_num_ctam==5131 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0) &&  
             SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0 
            )
            {
            bAplicacion=true;	
            return sal_imp_saldo_act* -1;
        	}
        else 
            return 0;
    	}
	
	//QUEBRANTOS DIVERSOS
    public double quebrantos  ( )
    		{
        if  (sal_num_ctam==5116 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bQuebrantos=true;
            return sal_imp_saldo_act ;
            }
        else 
            return 0;
    		}
	
	//OTROS GASTOS DE OPERACION
    public double otros_Gastos ( )
    		{
	        if  (
	            (sal_num_ctam == 5104 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5109 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5110 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5117 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5126 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5127 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5128 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5129 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
	            (sal_num_ctam == 5130 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
	            )
	            {
	            bOtros_Gastos=true;	
	            return sal_imp_saldo_act; 
	        	}
	        else 
	            return 0;
    		}
    		
    //APLICACION A PAROVISION DE REMANENTE
    public double aplicacion1 ( )
    	{
        if  (
        	(sal_num_ctam==5131 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0) ||
            (sal_num_ctam==5134 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
            )
            {
            bAplicacion1=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    	}   
    
    //AFECTACION PARA LA CONSTITUCION DE PROVISIONES
    public double afectacion ( ) 
    		{
        if  (sal_num_ctam == 5125 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 &&  SAL_NUM_AUX2==0 && SAL_NUM_AUX3==0)
        	{
        	bAfectacion=true;	
            return sal_imp_saldo_act;
        	}
        else 
            return 0;
    		}
}
