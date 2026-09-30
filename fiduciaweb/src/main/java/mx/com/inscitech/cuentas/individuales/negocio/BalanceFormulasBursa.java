package mx.com.inscitech.cuentas.individuales.negocio;

public class BalanceFormulasBursa {


    private static int sal_num_ctam;
    private static int sal_num_scta;
    private static int sal_num_sscta;
    private static int sal_num_ssscta;
    private static int sal_num_sssscta;
    private static int sal_num_ssssscta;
    private static double sal_num_aux1;
    private static double sal_num_aux2;
    private static double sal_num_aux3;
    private static double sal_imp_saldo_act;


    public boolean bFCajayBco=false; //CAJA Y BANCOS(@FCAJAYBCO) tabla:saldosmsa
    public boolean bValoresPorRecibir=false; //VALORES POR RECIBIR EN OPERACIONES DE PRÉSTAMO DENTRO DEL ACTIVO Y DE PASO
    public boolean bOtrasDispon=false; //OTRAS DISPONIB(@OTRAS DISPON)
    public boolean bTitulos=false; //TITULOS PARA NEGOCIAR(@TITULOS)
    public boolean bFAccion=false; //ACCION(@FACCION)
    public boolean bValoresNoCotizados=false; //VALORES NO COTIZADOS(@VALORES NO COTIZADOS)
    public boolean bValGub=false; //VALORES GUBER(@VAL_GUB)
    public boolean bDescuentos=false; //DESCUENTOS(@DESCUENTOS)
    public boolean bPrestaquiro=false; //PRESTAMOS QUIROGRAFARIOS(@PRESTAQUIRO)
    public boolean bPrestgara=false; //PRESTAMOS CON GARANTIA(@PRESTGARA)
    public boolean bCartera=false; //CARTERA DE CREDTIDOS(@CARTERA)
    public boolean bPresHabi=false; //PRESTAMOS DE HABILITACION(@PRESHABI)
    public boolean bGarantiPag=false; //GARANTIAS PAGADAS POR RECUPERARSE(@GARANTIPAG)				
    public boolean bPrestRef=false; //PRESTAMOS REFACCIONARIOS(@PREST_REF)
    public boolean bCreditosAfec=false; //CREDITOS AFECTOS EN GARANTIA(@CREDITOS_AFEC)
    public boolean bPresCongaran=false; //PRESTAMOS CON GARANTIA INMOBILIARIA(@PRES_CONGARAN)
    public boolean bCarteraVencida=false; //CARTERA VENCIDA(@CARTERA VENCIDA)
    public boolean bEstimacion=false; //ESTIMACION PREVENTIVA(@ESTIMACION)
    public boolean bClientesYDoc=false; //CLIENTES Y DOCUMENTOS POR COBRAR(@CLIENTES Y DOC)		
    public boolean bDeudoresDiversos=false; //DEUDORES DIVERSOS(@DEUDORES DIVERSOS)
    public boolean bInvenInmovil=false; //INVENTARIOS INMOBILIARIOS(@INVEN_INMOVIL)
    public boolean bOtrasInversiones=false; //OTRAS INVERSIONES(@OTRAS INVERISONES)
    public boolean bDerechos=false; //@DERECHOS
    public boolean bInmuebles=false; //INMUEBLES, MOVILIARIO Y EQUIPO(@INMUEBLES)
    public boolean bMaquinaria=false; //MAQUINARIA E IMPLEMENTOS AGRICOLAS(@MAQUINARIA)
    public boolean bInventDistri=false; //INVENTARISO PARA DISTRIBUCION(@INVENT_DISTRI)
    public boolean bInventIndust=false; //INVENTARIOS INDUSTRIALES(@INVENT_INDUST)
    public boolean bInventDeLaIndus=false; //INVENTARIOS DE LA INDUSTRIA DE LA CONSTRUCCION(@INVENT_DE LA INDUS)
    public boolean bInversionesParaLaConstrucc=false; //INVERSIONES PARA LA CONSTRUCCION(@INVERSIONES PARA LA CONSTRUC)
    public boolean bBienesAdjudicatos=false; //BIENES ADJUDICADOS(@BIENES ADJUDICADOS)
    public boolean bCargosDiferidos=false; //CARGOS DIFERIODS E INTANGIBLES(@CARGOS DIFERIDOS)
    public boolean bDocumentosyCuentas=false; //DOCUMENTOS Y CUENTAS POR PAGAR(@DOCUMENTOS Y CUENTAS)
    public boolean bAcreedPorCertif=false; //ACREEDORES POR CERTIFICADOS(@ACREED_POR CERTIF)
    public boolean bAcreedDiversos=false; //ACREEDORES DIVERSOS(@ACREED_DIVERSOS)
    public boolean bAcreePorIntereses=false; //ACREEDORES POR INTERESES UDIS(@ACREE_POR INTERESES)
    public boolean bFinanBan=false; //FINANCIAMIENTOS BANCARIOS(@FINAN_BAN)
    public boolean bPrestamosDeGobierno=false; //PRESTAMOS DE GOBIERNO FEDERAL (@PRESTAMOS DE GOBIERNO)
    public boolean bOtrasObliga=false; //OTRAS OBLIGACIONES(@OTRAS OBLIGA)
    public boolean bOtrosFinan=false; //OTROS FINANCIAMIENTOS(@OTROS FINAN)
    public boolean bCertfDeParti=false; //CERTIFICADOS POR PARTICIPACION (@CERTIF_DE PARTI)
    public boolean bFinanciBancarios=false; //FINANCIAMIENTOS BANCARIOS LARGO(@FINANCI_BANCARIOS)
    public boolean bReservasyProvisiones=false; //RESERVAS Y PROVISIONES PARA  OBLIG.(@RESERVAS Y PROVISIONES)
    public boolean bProvisionParaCobertura=false; //PROVISION PARA COBERTURA DE RIESGOS(@PROVISON PARA COBERTURA)
    public boolean bProvisionDiferencial=false; //PROVISION PARA COBERTURA DEL DIFERENCIAL(@PROVISION DIFERENCIAL)
    public boolean bCreditosDiferidos=false; //CREDITOS DEFERIDOS (@CREDITOS DIFERIDOS)
    public boolean bPatrimonio=false; //PATRIMONIOS(@PATRIMONIO)
    public boolean bPatrimEtiqueta=false; //@PATRIM_ETIQUETA	
    public boolean bPatrimonioNoAportado=false; //PATRIMONIO NO APORTADO(@PATRIMONIO NO APORTADO)
    public boolean bPatNoAporEtiqu=false; //@PATNOAPOR_ETIQU
    public boolean bEntregasPatrimoniales=false; //ENTREGAS PATRIMONIALES(@ENTREGAS PATRIMONIALES)
    public boolean bEntregasEtiq=false; //@ENTREGAS_ETIQ
    public boolean bRemanenteLiquido=false; //REMANENTE LIQUIDO DE EJERCIOS ANERIORES(@REMANENTE LIQUIDO)
    public boolean bRemanEtiqu=false; //@REMAN_ETIQU
    public boolean bDeficienteLiquido=false; //DEFICIENTE LIQUIDO DE EJERCICIOS ANTERIORES(@DEFICIENTE LIQUIDO)
    public boolean bDefEtiq=false; //@DEF_ETIQ
    public boolean bRevaluacionDeActivos=false; //REVALUACION DE ACTIVOS(@REVALUACION DE ACTIVOS)
    public boolean bResultadosDelEjercicio=false; //RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DEL EJERCICIO)
    public boolean bCreditosYDocumentos=false; //CREDITOS Y DOCUEMNTOS DESCONTADOS(@CREDITOS Y DOCUMENTOS)
    public boolean bDeudoresPorAval=false; //DEUDORES POR AVAL(@DEUDORES POR AVAL)
    public boolean bOtrasObligacionesCont=false; //OTRAS OBLIGACIONES CONTINGENTES(@OTRAS OBLIGACINES CONT)
    public boolean bValoresYBienes=false; //VALORES Y BIENES EN DEPOSITO(@VALORES Y BIENES)
    public boolean bCuentasDeudoras=false; //CUENTAS DEUDORAS DE REGISTRO(@CUENTAS DEUDORAS)
    public boolean bDividendosPag=false; //@DividendosPag
    public boolean bIntegracionDeCartera=false; //@INTEGRACION DE CARTERA

    public boolean bCertificadosETF=false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
    public boolean bCertificadosAutorizadosETF=false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
    public boolean bCertificadosCirculacionETF=false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
    public boolean bCertificadosTesoreriaETF=false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)

    public BalanceFormulasBursa() {
        bValoresPorRecibir = false; //VALORES POR RECIBIR EN OPERACIONES DE PRÉSTAMO DENTRO DEL ACTIVO Y DE PASO	
        bFCajayBco = false; //CAJA Y BANCOS(@FCAJAYBCO) tabla:saldosmsa
        bOtrasDispon = false; //OTRAS DISPONIB(@OTRAS DISPON)
        bTitulos = false; //TITULOS PARA NEGOCIAR(@TITULOS)
        bFAccion = false; //ACCION(@FACCION)
        bValoresNoCotizados = false; //VALORES NO COTIZADOS(@VALORES NO COTIZADOS)
        bValGub = false; //VALORES GUBER(@VAL_GUB)
        bDescuentos = false; //DESCUENTOS(@DESCUENTOS)
        bPrestaquiro = false; //PRESTAMOS QUIROGRAFARIOS(@PRESTAQUIRO)
        bPrestgara = false; //PRESTAMOS CON GARANTIA(@PRESTGARA)
        bCartera = false; //CARTERA DE CREDTIDOS(@CARTERA)
        bPresHabi = false; //PRESTAMOS DE HABILITACION(@PRESHABI)
        bGarantiPag = false; //GARANTIAS PAGADAS POR RECUPERARSE(@GARANTIPAG)				
        bPrestRef = false; //PRESTAMOS REFACCIONARIOS(@PREST_REF)
        bCreditosAfec = false; //CREDITOS AFECTOS EN GARANTIA(@CREDITOS_AFEC)
        bPresCongaran = false; //PRESTAMOS CON GARANTIA INMOBILIARIA(@PRES_CONGARAN)
        bCarteraVencida = false; //CARTERA VENCIDA(@CARTERA VENCIDA)
        bEstimacion = false; //ESTIMACION PREVENTIVA(@ESTIMACION)
        bClientesYDoc = false; //CLIENTES Y DOCUMENTOS POR COBRAR(@CLIENTES Y DOC)		
        bDeudoresDiversos = false; //DEUDORES DIVERSOS(@DEUDORES DIVERSOS)
        bInvenInmovil = false; //INVENTARIOS INMOBILIARIOS(@INVEN_INMOVIL)
        bOtrasInversiones = false; //OTRAS INVERSIONES(@OTRAS INVERISONES)
        bDerechos = false; //@DERECHOS
        bInmuebles = false; //INMUEBLES, MOVILIARIO Y EQUIPO(@INMUEBLES)
        bMaquinaria = false; //MAQUINARIA E IMPLEMENTOS AGRICOLAS(@MAQUINARIA)
        bInventDistri = false; //INVENTARISO PARA DISTRIBUCION(@INVENT_DISTRI)
        bInventIndust = false; //INVENTARIOS INDUSTRIALES(@INVENT_INDUST)
        bInventDeLaIndus = false; //INVENTARIOS DE LA INDUSTRIA DE LA CONSTRUCCION(@INVENT_DE LA INDUS)
        bInversionesParaLaConstrucc = false; //INVERSIONES PARA LA CONSTRUCCION(@INVERSIONES PARA LA CONSTRUC)
        bBienesAdjudicatos = false; //BIENES ADJUDICADOS(@BIENES ADJUDICADOS)
        bCargosDiferidos = false; //CARGOS DIFERIODS E INTANGIBLES(@CARGOS DIFERIDOS)
        bDocumentosyCuentas = false; //DOCUMENTOS Y CUENTAS POR PAGAR(@DOCUMENTOS Y CUENTAS)
        bAcreedPorCertif = false; //ACREEDORES POR CERTIFICADOS(@ACREED_POR CERTIF)
        bAcreedDiversos = false; //ACREEDORES DIVERSOS(@ACREED_DIVERSOS)
        bAcreePorIntereses = false; //ACREEDORES POR INTERESES UDIS(@ACREE_POR INTERESES)
        bFinanBan = false; //FINANCIAMIENTOS BANCARIOS(@FINAN_BAN)
        bPrestamosDeGobierno = false; //PRESTAMOS DE GOBIERNO FEDERAL (@PRESTAMOS DE GOBIERNO)
        bOtrasObliga = false; //OTRAS OBLIGACIONES(@OTRAS OBLIGA)
        bOtrosFinan = false; //OTROS FINANCIAMIENTOS(@OTROS FINAN)
        bCertfDeParti = false; //CERTIFICADOS POR PARTICIPACION (@CERTIF_DE PARTI)
        bFinanciBancarios = false; //FINANCIAMIENTOS BANCARIOS LARGO(@FINANCI_BANCARIOS)
        bReservasyProvisiones = false; //RESERVAS Y PROVISIONES PARA  OBLIG.(@RESERVAS Y PROVISIONES)
        bProvisionParaCobertura = false; //PROVISION PARA COBERTURA DE RIESGOS(@PROVISON PARA COBERTURA)
        bProvisionDiferencial = false; //PROVISION PARA COBERTURA DEL DIFERENCIAL(@PROVISION DIFERENCIAL)
        bCreditosDiferidos = false; //CREDITOS DEFERIDOS (@CREDITOS DIFERIDOS)
        bPatrimonio = false; //PATRIMONIOS(@PATRIMONIO)
        bPatrimEtiqueta = false; //@PATRIM_ETIQUETA	
        bPatrimonioNoAportado = false; //PATRIMONIO NO APORTADO(@PATRIMONIO NO APORTADO)
        bPatNoAporEtiqu = false; //@PATNOAPOR_ETIQU
        bEntregasPatrimoniales = false; //ENTREGAS PATRIMONIALES(@ENTREGAS PATRIMONIALES)
        bEntregasEtiq = false; //@ENTREGAS_ETIQ
        bRemanenteLiquido = false; //REMANENTE LIQUIDO DE EJERCIOS ANERIORES(@REMANENTE LIQUIDO)
        bRemanEtiqu = false; //@REMAN_ETIQU
        bDeficienteLiquido = false; //DEFICIENTE LIQUIDO DE EJERCICIOS ANTERIORES(@DEFICIENTE LIQUIDO)
        bDefEtiq = false; //@DEF_ETIQ
        bRevaluacionDeActivos = false; //REVALUACION DE ACTIVOS(@REVALUACION DE ACTIVOS)
        bResultadosDelEjercicio = false; //RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DEL EJERCICIO)
        bCreditosYDocumentos = false; //CREDITOS Y DOCUEMNTOS DESCONTADOS(@CREDITOS Y DOCUMENTOS)
        bDeudoresPorAval = false; //DEUDORES POR AVAL(@DEUDORES POR AVAL)
        bOtrasObligacionesCont = false; //OTRAS OBLIGACIONES CONTINGENTES(@OTRAS OBLIGACINES CONT)
        bValoresYBienes = false; //VALORES Y BIENES EN DEPOSITO(@VALORES Y BIENES)
        bCuentasDeudoras = false; //CUENTAS DEUDORAS DE REGISTRO(@CUENTAS DEUDORAS)
        bDividendosPag = false; //@DividendosPag
        bIntegracionDeCartera = false; //@INTEGRACION DE CARTERA	

        bCertificadosETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
        bCertificadosAutorizadosETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
        bCertificadosCirculacionETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
        bCertificadosTesoreriaETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)

    }

    //conf parametros
    public static void setValores(int sal_num_ctam, int sal_num_scta, int sal_num_sscta, int sal_num_sssscta, int sal_num_ssscta, int sal_num_ssssscta, double sal_num_aux1,
                                  double sal_num_aux2, double sal_num_aux3, double sal_imp_saldo_act) {

        BalanceFormulasBursa.sal_num_ctam = sal_num_ctam;
        BalanceFormulasBursa.sal_num_scta = sal_num_scta;
        BalanceFormulasBursa.sal_num_sscta = sal_num_sscta;
        BalanceFormulasBursa.sal_num_ssscta = sal_num_ssscta;
        BalanceFormulasBursa.sal_num_sssscta = sal_num_sssscta;
        BalanceFormulasBursa.sal_num_ssssscta = sal_num_ssssscta;
        BalanceFormulasBursa.sal_num_aux1 = sal_num_aux1;
        BalanceFormulasBursa.sal_num_aux2 = sal_num_aux2;
        BalanceFormulasBursa.sal_num_aux3 = sal_num_aux3;
        BalanceFormulasBursa.sal_imp_saldo_act = sal_imp_saldo_act;
    }


    //@PASIVO supress
    public double pasivo(double sumDocumentosyCuentas, double sumAcreedPorCertif, double sumAcreedDiversos, double sumAcreePorIntereses, double sumFinanBan,
                         double sumPrestamosDeGobierno, double sumOtrasObliga, double sumOtrosFinan, double sumCertfDeParti, double sumFinanciBancarios,
                         double sumReservasyProvisiones, double sumProvisionParaCobertura, double sumProvisionDiferencial, double sumCreditosDiferidos, double sumPatrimonio) {
        return (sumDocumentosyCuentas + //Sum ({@DOCUMENTOS Y CUENTAS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumAcreedPorCertif + //Sum ({@ACREED_POR CERTIF}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumAcreedDiversos + //Sum ({@ACREED_DIVERSOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumAcreePorIntereses + //Sum ({@ACREE_POR INTERESES}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumFinanBan + //Sum ({@FINAN_BAN}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPrestamosDeGobierno + //Sum ({@PRESTAMOS DE GOBIERNO}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumOtrasObliga + //Sum ({@OTRAS OBLIGA}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumOtrosFinan + //Sum ({@OTROS FINAN}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumCertfDeParti + //Sum ({@CERTIF_DE PARTI}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumFinanciBancarios + //Sum ({@FINANCI_BANCARIOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumReservasyProvisiones + //Sum ({@RESERVAS Y PROVISIONES}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumProvisionParaCobertura + //Sum ({@PROVISON PARA COBERTURA}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumProvisionDiferencial + //Sum ({@PROVISION DIFERENCIAL}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumCreditosDiferidos + //Sum ({@CREDITOS DIFERIDOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPatrimonio); //Sum ({@PATRIMONIO}, {SALDOSMSA.SAL_NUM_AUX1})						

    }


    //@PATRIMON

    public double patrimon(double sumPatrimonioNoAportado, double sumEntregasPatrimoniales, double sumRemanenteLiquido, double sumDeficienteLiquido, double sumRevaluacionDeActivos,
                           double sumResultadosDelEjercicio) {
        return (sumPatrimonioNoAportado + //Sum ({@PATRIMONIO NO APORTADO}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumEntregasPatrimoniales + //Sum ({@ENTREGAS PATRIMONIALES}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumRemanenteLiquido + //Sum ({@REMANENTE LIQUIDO}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumDeficienteLiquido + //Sum ({@DEFICIENTE LIQUIDO}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumRevaluacionDeActivos + //Sum ({@REVALUACION DE ACTIVOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumResultadosDelEjercicio); //Sum ({@RESULTADOS DEL EJERCICIO}, {SALDOSMSA.SAL_NUM_AUX1})
    }


    //@total activo
    public double totalActivo(double sumFCajayBco, double sumOtrasDispon, double sumTitulos, double sumFAccion, double sumValoresNoCotizados, double sumValGub,
                              double sumDescuentos, double sumPrestaquiro, double sumPrestgara, double sumCartera, double sumPresHabi, double sumGarantiPag, double sumPrestRef,
                              double sumCreditosAfec, double sumPresCongaran, double sumCarteraVencida, double sumEstimacion, double sumClientesYDoc, double sumDeudoresDiversos,
                              double sumInvenInmovil, double sumOtrasInversiones, double sumDerechos, double sumInmuebles, double sumMaquinaria, double sumInventDistri,
                              double sumInventIndust, double sumInventDeLaIndus, double sumInversionesParaLaConstrucc, double sumCargosDiferidos, double sumBienesAdjudicatos,
                              double sumValoresPorRecibir) {

        return (sumFCajayBco + //Sum ({@FCAJAYBCO}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumOtrasDispon + //Sum ({@OTRAS DISPON}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumTitulos + //Sum ({@TITULOS }, {SALDOSMSA.SAL_NUM_AUX1})+
                sumFAccion + //Sum ({@FACCION}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumValoresNoCotizados + //Sum ({@VALORES NO COTIZADOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumValGub + //Sum ({@VAL_GUB}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumDescuentos + //Sum ({@DESCUENTOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPrestaquiro + //Sum ({@PRESTAQUIRO}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPrestgara + //Sum ({@PRESTGARA}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumCartera + //Sum ({@CARTERA}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPresHabi + //Sum ({@PRESHABI}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumGarantiPag + //Sum ({@GARANTIPAG}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPrestRef + //Sum ({@PREST_REF}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumCreditosAfec + //Sum ({@CREDITOS_AFEC}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumPresCongaran + //Sum ({@PRES_CONGARAN}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumCarteraVencida + // Sum ({@CARTERA VENCIDA}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumEstimacion + //Sum ({@ESTIMACION}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumClientesYDoc + //Sum ({@CLIENTES Y DOC}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumDeudoresDiversos + //({@DEUDORES DIVERSOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumInvenInmovil + //Sum ({@INVEN_INMOVIL}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumOtrasInversiones + //Sum ({@OTRAS INVERISONES}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumDerechos + //Sum ({@DERECHOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumInmuebles + //Sum ({@INMUEBLES}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumMaquinaria + //Sum ({@MAQUINARIA}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumInventDistri + //Sum ({@INVENT_DISTRI}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumInventIndust + //Sum ({@INVENT_INDUST}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumInventDeLaIndus + //Sum ({@INVENT_DE LA INDUS}, {SALDOSMSA.SAL_NUM_AUX1})  +
                sumInversionesParaLaConstrucc + //Sum ({@INVERSIONES PARA LA CONSTRUC}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumCargosDiferidos + //Sum ({@CARGOS DIFERIDOS}, {SALDOSMSA.SAL_NUM_AUX1})+
                sumBienesAdjudicatos + //Sum ({@BIENES ADJUDICADOS}, {SALDOSMSA.SAL_NUM_AUX1})
                sumValoresPorRecibir); // Sum of @VALORES POR RECIBIR


    }

    //@etipatri
    public double etiPatri(double sumEntregasPatrimoniales, double sumPatrimonioNoAportado, double sumPatrimonio) {

        //sumEntregasPatrimoniales = Sum ({@ENTREGAS PATRIMONIALES}, {SALDOSMSA.SAL_NUM_AUX1})
        //sumPatrimonioNoAportado Sum ({@PATRIMONIO NO APORTADO}, {SALDOSMSA.SAL_NUM_AUX1})
        //sumPatrimonio Sum ({@PATRIMONIO}, {SALDOSMSA.SAL_NUM_AUX1})


        if (sumEntregasPatrimoniales == 0 || sumPatrimonioNoAportado == 0)
            return 0;
        else
            return sumPatrimonio;

    }

    //subtotal2	
    public double subTotal2(double sumEntregasPatrimoniales, double sumPatrimonio) {

        //sumEntregasPatrimoniales = Sum ({@ENTREGAS PATRIMONIALES}, {SALDOSMSA.SAL_NUM_AUX1})
        //sumPatrimonio Sum ({@PATRIMONIO}, {SALDOSMSA.SAL_NUM_AUX1})
        return (sumPatrimonio + sumEntregasPatrimoniales) * (-1);
    }
    //subtotal1	
    public double subTotal1(double sumEntregasPatrimoniales, double sumPatrimonioNoAportado, double sumPatrimonio) {
        double sumSubTotal2 = (sumPatrimonio + sumEntregasPatrimoniales) * (-1);
        //sumEntregasPatrimoniales = Sum ({@ENTREGAS PATRIMONIALES}, {SALDOSMSA.SAL_NUM_AUX1})
        //sumPatrimonio Sum ({@PATRIMONIO}, {SALDOSMSA.SAL_NUM_AUX1})
        if (sumSubTotal2 != 0)
            return 0;
        else
            return sumPatrimonio + sumPatrimonioNoAportado;

    }


    //CAJA Y BANCOS(@FCAJAYBCO) tabla:saldosmsa
    public double fCajayBco() {


        if ((sal_num_ctam == 1101 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1103 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1108 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bFCajayBco = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }


    //VALORES POR RECIBIR EN OPERACIONES DE PRÉSTAMO DENTRO DEL ACTIVO Y DE PASO
    public double valoresPorRecibir() {

        if ((sal_num_ctam == 1208 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1209 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bValoresPorRecibir = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }


    //OTRAS DISPONIB(@OTRAS DISPON)
    public double otrasDispon() {

        if ((sal_num_ctam == 1104 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1105 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1106 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bOtrasDispon = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }

    //ACCION(@FACCION)
    public double fAccion() {
        if ((sal_num_ctam == 1203 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1206 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bFAccion = true;
            return sal_imp_saldo_act;
        } else{
            bFAccion = false;            
            return 0;
        }
        
    }

    //TITULOS PARA NEGOCIAR(@TITULOS)

    public double titulos() {

        if ((sal_num_ctam == 1201 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1205 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1206 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1202 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||		 
            (sal_num_ctam == 1225 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bTitulos = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }



    //VALORES NO COTIZADOS(@VALORES NO COTIZADOS)

    public double valoresNoCotizados() {

        if ((sal_num_ctam == 1204 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1207 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1226 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bValoresNoCotizados = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }

    //VALORES GUBER(@VAL_GUB)

    public double valGub() {

        if (sal_num_ctam == 1210 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bValGub = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }


    //DESCUENTOS(@DESCUENTOS)

    public double descuentos() {

        if (sal_num_ctam == 1301 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bDescuentos = true;
            return sal_imp_saldo_act;
        } else {
            if (sal_num_ctam == 2401 && sal_num_scta == 1 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                sal_num_aux3 == 0) {
                bDescuentos = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }

    }

    //PRESTAMOS QUIROGRAFARIOS(@PRESTAQUIRO)

    public double prestaquiro() {
        if ((sal_num_ctam == 1302 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1303 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1304 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1305 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1312 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 2 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 3 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 4 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 5 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 12 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 30 && sal_num_sscta == 2 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 30 && sal_num_sscta == 3 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 30 && sal_num_sscta == 4 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 30 && sal_num_sscta == 5 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 30 && sal_num_sscta == 12 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bPrestaquiro = true;
            return sal_imp_saldo_act;
        } else {

            if ((sal_num_ctam == 2401 && sal_num_scta == 2 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 2401 && sal_num_scta == 3 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 2401 && sal_num_scta == 4 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 2401 && sal_num_scta == 5 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 2401 && sal_num_scta == 12 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bPrestaquiro = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }

    }

    //PRESTAMOS CON GARANTIA(@PRESTGARA)

    public double prestgara() {

        if ((sal_num_ctam == 1306 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 6 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bPrestgara = true;
            return sal_imp_saldo_act;
        } else {
            if (sal_num_ctam == 2401 && sal_num_scta == 6 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                sal_num_aux3 == 0) {
                bPrestgara = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }
    }


    //CARTERA DE CREDTIDOS(@CARTERA)

    public double cartera() {

        if ((sal_num_ctam == 1313 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 13 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bCartera = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }

    //PRESTAMOS DE HABILITACION(@PRESHABI)

    public double presHabi() {

        if ((sal_num_ctam == 1307 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 7 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bPresHabi = true;
            return sal_imp_saldo_act;
        } else if (sal_num_ctam == 2401 && sal_num_scta == 7 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                   sal_num_aux3 == 0) {
            bPresHabi = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;
    }


    //GARANTIAS PAGADAS POR RECUPERARSE(@GARANTIPAG)


    public double garantiPag() {

        if (sal_num_ctam == 1317 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bGarantiPag = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }


    //PRESTAMOS REFACCIONARIOS(@PREST_REF)

    public double prestRef() {

        if ((sal_num_ctam == 1308 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 8 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bPrestRef = true;
            return sal_imp_saldo_act;
        } else {
            if (sal_num_ctam == 2401 && sal_num_scta == 8 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                sal_num_aux3 == 0) {
                bPrestRef = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }
    }


    //CREDITOS AFECTOS EN GARANTIA(@CREDITOS_AFEC)

    public double creditosAfec() {
        if (sal_num_ctam == 1310 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bCreditosAfec = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }

    //PRESTAMOS CON GARANTIA INMOBILIARIA(@PRES_CONGARAN)


    public double presCongaran() {
        if ((sal_num_ctam == 1309 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1311 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 9 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1319 && sal_num_scta == 11 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bPresCongaran = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 2401 && sal_num_scta == 9 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 2401 && sal_num_scta == 11 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bPresCongaran = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }
    }

    //CARTERA VENCIDA(@CARTERA VENCIDA)

    public double carteraVencida() {
        if ((sal_num_ctam == 1314 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1316 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1320 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bCarteraVencida = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }

    //ESTIMACION PREVENTIVA(@ESTIMACION)

    public double estimacion() {
        if (sal_num_ctam == 2305 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bEstimacion = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }

    //CLIENTES Y DOCUMENTOS POR COBRAR(@CLIENTES Y DOC)

    public double clientesYDoc() {
        if ((sal_num_ctam == 1401 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1402 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1403 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bClientesYDoc = true;
            return sal_imp_saldo_act;
        } else {

            if ((sal_num_ctam == 3115 && sal_num_scta == 1 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3115 && sal_num_scta == 2 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3115 && sal_num_scta == 3 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3115 && sal_num_scta == 90 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bClientesYDoc = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }
    }


    //DEUDORES DIVERSOS(@DEUDORES DIVERSOS)

    public double deudoresDiversos() {
        if ((sal_num_ctam == 1503 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1504 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1505 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1506 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1507 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1508 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1509 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1510 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1512 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1606 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bDeudoresDiversos = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 3101 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3115 && sal_num_scta == 4 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bDeudoresDiversos = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }
    }


    //INVENTARIOS INMOBILIARIOS(@INVEN_INMOVIL)


    public double invenInmovil() {
        if (sal_num_ctam == 1650 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bInvenInmovil = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }

    //OTRAS INVERSIONES(@OTRAS INVERISONES)

    public double otrasInversiones() {
        if (sal_num_ctam == 1661 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bOtrasInversiones = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }


    //@DERECHOS

    public double derechos() {
        if ((sal_num_ctam == 1660 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0) ||
            (sal_num_ctam == 1662 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0)) {
            bDerechos = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }


    //INMUEBLES, MOVILIARIO Y EQUIPO(@INMUEBLES)

    public double inmuebles() {
        if ((sal_num_ctam == 1801 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1802 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1804 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1805 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bInmuebles = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 3102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3103 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bInmuebles = true;
                return (sal_imp_saldo_act * 1);
            } else
                return 0;
        }
    }


    //MAQUINARIA E IMPLEMENTOS AGRICOLAS(@MAQUINARIA)

    public double maquinaria() {

        if ((sal_num_ctam == 1803 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1806 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bMaquinaria = true;
            return sal_imp_saldo_act;
        } else {
            if (sal_num_ctam == 3104 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                sal_num_aux3 == 0) {
                bMaquinaria = true;
                return (sal_imp_saldo_act * -1);
            } else
                return 0;
        }
    }

    //INVENTARISO PARA DISTRIBUCION(@INVENT_DISTRI)

    public double inventDistri() {
        if ((sal_num_ctam == 1607 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1608 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1609 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bInventDistri = true;
            return sal_imp_saldo_act;
        } else {
            if (sal_num_ctam == 3116 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                sal_num_aux3 == 0) {
                bInventDistri = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }
    }

    //INVENTARIOS INDUSTRIALES(@INVENT_INDUST)

    public double inventIndust() {
        if ((sal_num_ctam == 1610 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1611 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1612 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1613 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1614 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1615 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bInventIndust = true;
            return sal_imp_saldo_act;
        } else {

            if ((sal_num_ctam == 3116 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3116 && sal_num_scta == 2 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3116 && sal_num_scta == 3 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3116 && sal_num_scta == 4 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3116 && sal_num_scta == 5 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3116 && sal_num_scta == 6 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bInventIndust = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }

    }

    //INVENTARIOS DE LA INDUSTRIA DE LA CONSTRUCCION(@INVENT_DE LA INDUS)

    public double inventDeLaIndus() {

        if ((sal_num_ctam == 1640 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1641 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bInventDeLaIndus = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 3116 && sal_num_scta == 7 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3116 && sal_num_scta == 8 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bInventDeLaIndus = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;

        }

    }


    //INVERSIONES PARA LA CONSTRUCCION(@INVERSIONES PARA LA CONSTRUC)

    public double inversionesParaLaConstrucc() {
        if ((sal_num_ctam == 1702 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1703 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1704 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1705 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1706 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1707 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1708 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bInversionesParaLaConstrucc = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 3117 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3118 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bInversionesParaLaConstrucc = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }

    }


    //BIENES ADJUDICADOS(@BIENES ADJUDICADOS)

    public double bienesAdjudicatos() {

        if ((sal_num_ctam == 1601 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1602 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1603 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bBienesAdjudicatos = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 3105 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3106 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bBienesAdjudicatos = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }

    }

    //CARGOS DIFERIODS E INTANGIBLES(@CARGOS DIFERIDOS)

    public double cargosDiferidos() {

        if ((sal_num_ctam == 1605 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1901 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1902 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1903 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1904 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 1905 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bCargosDiferidos = true;
            return sal_imp_saldo_act;
        } else {
            if ((sal_num_ctam == 3107 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3108 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3109 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 3110 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bCargosDiferidos = true;
                return (sal_imp_saldo_act * (-1));
            } else
                return 0;
        }

    }


    //DOCUMENTOS Y CUENTAS POR PAGAR(@DOCUMENTOS Y CUENTAS)

    public double documentosyCuentas() {

        if ((sal_num_ctam == 2101 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bDocumentosyCuentas = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //ACREEDORES POR CERTIFICADOS(@ACREED_POR CERTIF)

    public double acreedPorCertif() {

        if (sal_num_ctam == 2103 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bAcreedPorCertif = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //ACREEDORES DIVERSOS(@ACREED_DIVERSOS)

    public double acreedDiversos() {

        if ((sal_num_ctam == 2104 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2105 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2106 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2107 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2111 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2112 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2117 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bAcreedDiversos = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;
    }

    //ACREEDORES POR INTERESES UDIS(@ACREE_POR INTERESES)

    public double acreePorIntereses() {
        if (sal_num_ctam == 2109 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bAcreePorIntereses = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;
    }


    //FINANCIAMIENTOS BANCARIOS(@FINAN_BAN)

    public double finanBan() {

        if ((sal_num_ctam == 2113 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2114 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bFinanBan = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;
    }

    //PRESTAMOS DE GOBIERNO FEDERAL (@PRESTAMOS DE GOBIERNO)


    public double prestamosDeGobierno() {

        if (sal_num_ctam == 2121 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bPrestamosDeGobierno = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //OTRAS OBLIGACIONES(@OTRAS OBLIGA)

    public double otrasObliga() {

        if (sal_num_ctam == 2110 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bOtrasObliga = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //OTROS FINANCIAMIENTOS(@OTROS FINAN)

    public double otrosFinan() {

        if (sal_num_ctam == 2204 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bOtrosFinan = true;
            return sal_imp_saldo_act * 1;
        } else
            return 0;

    }


    //CERTIFICADOS POR PARTICIPACION (@CERTIF_DE PARTI)


    public double certfDeParti() {

        if (sal_num_ctam == 2203 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bCertfDeParti = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //FINANCIAMIENTOS BANCARIOS LARGO(@FINANCI_BANCARIOS)


    public double financiBancarios() {

        if ((sal_num_ctam == 2201 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2202 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bFinanciBancarios = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;
    }


    //RESERVAS Y PROVISIONES PARA  OBLIG.(@RESERVAS Y PROVISIONES)


    public double reservasyProvisiones() {

        if ((sal_num_ctam == 2301 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2302 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2303 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2304 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2312 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bReservasyProvisiones = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;
    }


    //PROVISION PARA COBERTURA DE RIESGOS(@PROVISON PARA COBERTURA)


    public double provisionParaCobertura() {

        if (sal_num_ctam == 2310 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bProvisionParaCobertura = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }

    //PROVISION PARA COBERTURA DEL DIFERENCIAL(@PROVISION DIFERENCIAL)


    public double provisionDiferencial() {

        if (sal_num_ctam == 2311 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bProvisionDiferencial = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }

    //CREDITOS DEFERIDOS (@CREDITOS DIFERIDOS)

    public double creditosDiferidos() {
        if ((sal_num_ctam == 2402 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2403 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2404 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2405 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2406 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 2407 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bCreditosDiferidos = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //PATRIMONIOS(@PATRIMONIO)


    public double patrimonio() {
        if (sal_num_ctam == 4201 && sal_num_scta == 3 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bPatrimonio = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;

    }


    //@PATRIM_ETIQUETA


    public double patrimEtiqueta() {

        if (sal_num_ctam == 4201 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0) {
            bPatrimEtiqueta = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;

    }


    //PATRIMONIO NO APORTADO(@PATRIMONIO NO APORTADO)


    public double patrimonioNoAportado() {
        if (sal_num_ctam == 4101 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bPatrimonioNoAportado = true;
            return (sal_imp_saldo_act * (1));
        } else
            return 0;
    }


    //@PATNOAPOR_ETIQU


    public double patNoAporEtiqu() {
        if (sal_num_ctam == 4101 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0) {
            bPatNoAporEtiqu = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;

    }

    //ENTREGAS PATRIMONIALES(@ENTREGAS PATRIMONIALES)


    public double entregasPatrimoniales() {
        if (sal_num_ctam == 4102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bEntregasPatrimoniales = true;
            return sal_imp_saldo_act * 1;
        } else
            return 0;
    }


    //@ENTREGAS_ETIQ


    public double entregasEtiq() {

        if (sal_num_ctam == 4102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0) {
            bEntregasEtiq = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;

    }

    //REMANENTE LIQUIDO DE EJERCIOS ANERIORES(@REMANENTE LIQUIDO)


    public double remanenteLiquido() {

        if (sal_num_ctam == 4202 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bRemanenteLiquido = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }


    //@REMAN_ETIQU


    public double remanEtiqu() {
        if (sal_num_ctam == 4202 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bRemanEtiqu = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;
    }


    //DEFICIENTE LIQUIDO DE EJERCICIOS ANTERIORES(@DEFICIENTE LIQUIDO)


    public double deficienteLiquido() {

        if (sal_num_ctam == 4201 && sal_num_scta == 1 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bDeficienteLiquido = true;
            return sal_imp_saldo_act * 1;
        } else
            return 0;

    }

    //@DEF_ETIQ


    public double defEtiq() {

        if (sal_num_ctam == 4103 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bDefEtiq = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;

    }


    //REVALUACION DE ACTIVOS(@REVALUACION DE ACTIVOS)


    public double revaluacionDeActivos() {

        if (sal_num_ctam == 4203 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bRevaluacionDeActivos = true;
            return sal_imp_saldo_act * 1;
        } else
            return 0;

    }


    //RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DEL EJERCICIO)


    public double resultadosDelEjercicio() {

        if ((sal_num_ctam == 5201 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5202 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5203 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5205 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5206 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5207 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5208 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5209 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5210 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5211 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5212 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5213 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5214 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 5226 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)||
                (sal_num_ctam == 5301 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
            bResultadosDelEjercicio = true;
            return (Math.abs(sal_imp_saldo_act) * -1);
        } else {

            if ((sal_num_ctam == 5102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5103 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5104 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5105 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5106 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5108 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5109 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5110 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5111 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5113 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5114 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5115 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5116 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5117 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5118 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5119 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5120 && sal_num_scta == 1 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5121 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5126 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5125 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5127 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5128 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5129 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5130 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5131 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5132 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5133 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5134 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5139 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0) ||
                (sal_num_ctam == 5141 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)||
                (sal_num_ctam == 5140 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                 sal_num_aux3 == 0)) {
                bResultadosDelEjercicio = true;
                return Math.abs(sal_imp_saldo_act) * 1;
            } else
                return 0;
        }
    }


    //CREDITOS Y DOCUEMNTOS DESCONTADOS(@CREDITOS Y DOCUMENTOS)


    public double creditosYDocumentos() {

        if (sal_num_ctam == 6101 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bCreditosYDocumentos = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;

    }


    //DEUDORES POR AVAL(@DEUDORES POR AVAL)


    public double deudoresPorAval() {
        if (sal_num_ctam == 6102 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bDeudoresPorAval = true;
            return (sal_imp_saldo_act * (-1));
        } else
            return 0;
    }


    //OTRAS OBLIGACIONES CONTINGENTES(@OTRAS OBLIGACINES CONT)


    public double otrasObligacionesCont() {
        if ((sal_num_ctam == 6103 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6104 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6105 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6106 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6108 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)) {
            bOtrasObligacionesCont = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }

    //VALORES Y BIENES EN DEPOSITO(@VALORES Y BIENES)


    public double valoresYBienes() {
        if ((sal_num_ctam == 6201 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0 && sal_num_sssscta == 0 &&
             sal_num_ssssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
            (sal_num_ctam == 6202 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0 && sal_num_sssscta == 0 &&
             sal_num_ssssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
            (sal_num_ctam == 6203 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0 && sal_num_sssscta == 0 &&
             sal_num_ssssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
            (sal_num_ctam == 6207 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0 && sal_num_sssscta == 0 &&
             sal_num_ssssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
            (sal_num_ctam == 6208 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0 && sal_num_sssscta == 0 &&
             sal_num_ssssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
            (sal_num_ctam == 6209 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0 && sal_num_sssscta == 0 &&
             sal_num_ssssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0)) {
            bValoresYBienes = true;
            return sal_imp_saldo_act * 1;
        } else
            return 0;
    }

    //CUENTAS DEUDORAS DE REGISTRO(@CUENTAS DEUDORAS)

    public double cuentasDeudoras() {
        if ((sal_num_ctam == 6301 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6302 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6303 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6304 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6305 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6306 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6307 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6308 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0) ||
            (sal_num_ctam == 6309 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
             sal_num_aux3 == 0)
            /* ||
		   (sal_num_ctam==6312 && sal_num_scta==0 && sal_num_sscta==0 && sal_num_ssscta==0 && sal_num_sssscta==0 && sal_num_ssssscta==0 && sal_num_aux2==0 && sal_num_aux3==0)
		    */ || (sal_num_ctam == 6313 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                           sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6316 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6317 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6318 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6372 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6373 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6378 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6390 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6393 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0) ||
                          (sal_num_ctam == 6395 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 &&
                           sal_num_aux2 == 0 && sal_num_aux3 == 0)) {
            bCuentasDeudoras = true;
            return sal_imp_saldo_act * 1;
        } else
            return 0;

    }

    //@DividendosPag


    public double dividendosPag() {
        if (sal_num_ctam == 5120 && sal_num_scta == 1 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_aux2 == 0 && sal_num_aux3 == 0) {
            bDividendosPag = true;
            return sal_imp_saldo_act;
        } else
            return 0;
    }


    //@INTEGRACION DE CARTERA


    public double integracionDeCartera() {

        if (sal_num_ctam == 6376 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bIntegracionDeCartera = true;
            return sal_imp_saldo_act;
        } else
            return 0;

    }

    //limpia banderas
    public void limpiaBanderas() {
        bFCajayBco = false; //CAJA Y BANCOS(@FCAJAYBCO) tabla:saldosmsa
        bOtrasDispon = false; //OTRAS DISPONIB(@OTRAS DISPON)
        bTitulos = false; //TITULOS PARA NEGOCIAR(@TITULOS)
        bFAccion = false; //ACCION(@FACCION)
        bValoresNoCotizados = false; //VALORES NO COTIZADOS(@VALORES NO COTIZADOS)
        bValGub = false; //VALORES GUBER(@VAL_GUB)
        bDescuentos = false; //DESCUENTOS(@DESCUENTOS)
        bPrestaquiro = false; //PRESTAMOS QUIROGRAFARIOS(@PRESTAQUIRO)
        bPrestgara = false; //PRESTAMOS CON GARANTIA(@PRESTGARA)
        bCartera = false; //CARTERA DE CREDTIDOS(@CARTERA)
        bPresHabi = false; //PRESTAMOS DE HABILITACION(@PRESHABI)
        bGarantiPag = false; //GARANTIAS PAGADAS POR RECUPERARSE(@GARANTIPAG)				
        bPrestRef = false; //PRESTAMOS REFACCIONARIOS(@PREST_REF)
        bCreditosAfec = false; //CREDITOS AFECTOS EN GARANTIA(@CREDITOS_AFEC)
        bPresCongaran = false; //PRESTAMOS CON GARANTIA INMOBILIARIA(@PRES_CONGARAN)
        bCarteraVencida = false; //CARTERA VENCIDA(@CARTERA VENCIDA)
        bEstimacion = false; //ESTIMACION PREVENTIVA(@ESTIMACION)
        bClientesYDoc = false; //CLIENTES Y DOCUMENTOS POR COBRAR(@CLIENTES Y DOC)		
        bDeudoresDiversos = false; //DEUDORES DIVERSOS(@DEUDORES DIVERSOS)
        bInvenInmovil = false; //INVENTARIOS INMOBILIARIOS(@INVEN_INMOVIL)
        bOtrasInversiones = false; //OTRAS INVERSIONES(@OTRAS INVERISONES)
        bDerechos = false; //@DERECHOS
        bInmuebles = false; //INMUEBLES, MOVILIARIO Y EQUIPO(@INMUEBLES)
        bMaquinaria = false; //MAQUINARIA E IMPLEMENTOS AGRICOLAS(@MAQUINARIA)
        bInventDistri = false; //INVENTARISO PARA DISTRIBUCION(@INVENT_DISTRI)
        bInventIndust = false; //INVENTARIOS INDUSTRIALES(@INVENT_INDUST)
        bInventDeLaIndus = false; //INVENTARIOS DE LA INDUSTRIA DE LA CONSTRUCCION(@INVENT_DE LA INDUS)
        bInversionesParaLaConstrucc = false; //INVERSIONES PARA LA CONSTRUCCION(@INVERSIONES PARA LA CONSTRUC)
        bBienesAdjudicatos = false; //BIENES ADJUDICADOS(@BIENES ADJUDICADOS)
        bCargosDiferidos = false; //CARGOS DIFERIODS E INTANGIBLES(@CARGOS DIFERIDOS)
        bDocumentosyCuentas = false; //DOCUMENTOS Y CUENTAS POR PAGAR(@DOCUMENTOS Y CUENTAS)
        bAcreedPorCertif = false; //ACREEDORES POR CERTIFICADOS(@ACREED_POR CERTIF)
        bAcreedDiversos = false; //ACREEDORES DIVERSOS(@ACREED_DIVERSOS)
        bAcreePorIntereses = false; //ACREEDORES POR INTERESES UDIS(@ACREE_POR INTERESES)
        bFinanBan = false; //FINANCIAMIENTOS BANCARIOS(@FINAN_BAN)
        bPrestamosDeGobierno = false; //PRESTAMOS DE GOBIERNO FEDERAL (@PRESTAMOS DE GOBIERNO)
        bOtrasObliga = false; //OTRAS OBLIGACIONES(@OTRAS OBLIGA)
        bOtrosFinan = false; //OTROS FINANCIAMIENTOS(@OTROS FINAN)
        bCertfDeParti = false; //CERTIFICADOS POR PARTICIPACION (@CERTIF_DE PARTI)
        bFinanciBancarios = false; //FINANCIAMIENTOS BANCARIOS LARGO(@FINANCI_BANCARIOS)
        bReservasyProvisiones = false; //RESERVAS Y PROVISIONES PARA  OBLIG.(@RESERVAS Y PROVISIONES)
        bProvisionParaCobertura = false; //PROVISION PARA COBERTURA DE RIESGOS(@PROVISON PARA COBERTURA)
        bProvisionDiferencial = false; //PROVISION PARA COBERTURA DEL DIFERENCIAL(@PROVISION DIFERENCIAL)
        bCreditosDiferidos = false; //CREDITOS DEFERIDOS (@CREDITOS DIFERIDOS)
        bPatrimonio = false; //PATRIMONIOS(@PATRIMONIO)
        bPatrimEtiqueta = false; //@PATRIM_ETIQUETA	
        bPatrimonioNoAportado = false; //PATRIMONIO NO APORTADO(@PATRIMONIO NO APORTADO)
        bPatNoAporEtiqu = false; //@PATNOAPOR_ETIQU
        bEntregasPatrimoniales = false; //ENTREGAS PATRIMONIALES(@ENTREGAS PATRIMONIALES)
        bEntregasEtiq = false; //@ENTREGAS_ETIQ
        bRemanenteLiquido = false; //REMANENTE LIQUIDO DE EJERCIOS ANERIORES(@REMANENTE LIQUIDO)
        bRemanEtiqu = false; //@REMAN_ETIQU
        bDeficienteLiquido = false; //DEFICIENTE LIQUIDO DE EJERCICIOS ANTERIORES(@DEFICIENTE LIQUIDO)
        bDefEtiq = false; //@DEF_ETIQ
        bRevaluacionDeActivos = false; //REVALUACION DE ACTIVOS(@REVALUACION DE ACTIVOS)
        bResultadosDelEjercicio = false; //RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DEL EJERCICIO)
        bCreditosYDocumentos = false; //CREDITOS Y DOCUEMNTOS DESCONTADOS(@CREDITOS Y DOCUMENTOS)
        bDeudoresPorAval = false; //DEUDORES POR AVAL(@DEUDORES POR AVAL)
        bOtrasObligacionesCont = false; //OTRAS OBLIGACIONES CONTINGENTES(@OTRAS OBLIGACINES CONT)
        bValoresYBienes = false; //VALORES Y BIENES EN DEPOSITO(@VALORES Y BIENES)
        bCuentasDeudoras = false; //CUENTAS DEUDORAS DE REGISTRO(@CUENTAS DEUDORAS)
        bDividendosPag = false; //@DividendosPag
        bIntegracionDeCartera = false; //@INTEGRACION DE CARTERA	

        bCertificadosETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
        bCertificadosAutorizadosETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
        bCertificadosCirculacionETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
        bCertificadosTesoreriaETF = false; //CUENTAS CERTIFICADOS ETF'S(@ 6312)
    }

    ////CUENTAS CERTIFICADOS ETF'S(@ 6312)

    public double certificadosETF() {
        if (sal_num_ctam == 6312 && sal_num_scta == 0 && sal_num_sscta == 0 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
            sal_num_aux3 == 0) {
            bCertificadosETF = true;

            bCertificadosAutorizadosETF = true;
            bCertificadosCirculacionETF = false;
            bCertificadosTesoreriaETF = false;

            return sal_imp_saldo_act * 1;
        } else if (sal_num_ctam == 6312 && sal_num_scta == 1 && sal_num_sscta == 1 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                   sal_num_aux3 == 0) {
            bCertificadosETF = true;

            bCertificadosAutorizadosETF = false;
            bCertificadosCirculacionETF = true;
            bCertificadosTesoreriaETF = false;

            return sal_imp_saldo_act * 1;
        } else if (sal_num_ctam == 6312 && sal_num_scta == 1 && sal_num_sscta == 2 && sal_num_ssscta == 0 && sal_num_sssscta == 0 && sal_num_ssssscta == 0 && sal_num_aux2 == 0 &&
                   sal_num_aux3 == 0) {
            bCertificadosETF = true;

            bCertificadosAutorizadosETF = false;
            bCertificadosCirculacionETF = false;
            bCertificadosTesoreriaETF = true;

            return sal_imp_saldo_act * 1;
        } else {
            bCertificadosETF = false;
            bCertificadosAutorizadosETF = false;
            bCertificadosCirculacionETF = false;
            bCertificadosTesoreriaETF = false;

            return 0;
        }
    }

}//fin clase