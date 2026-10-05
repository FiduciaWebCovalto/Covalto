package mx.com.inscitech.fiducia.business;

import java.lang.Double;
import java.lang.Integer;
import java.lang.String;

import java.util.Vector;

public class nDatos {

    public Vector vtrStrDato1;
    public Vector vtrStrDato2;
    public Vector vtrStrDato3;
    public Vector vtrStrDato4;
    public Vector vtrStrDato5;
    public Vector vtrStrDato6;
    public Vector vtrStrDato7;
    public Vector vtrStrDato8;
    public Vector vtrStrDato9;
    public Vector vtrStrDato10;
    public Vector vtrStrDato11;
    public Vector vtrStrDato12;
    public Vector vtrStrDato13;
    public Vector vtrStrDato14;
    public Vector vtrStrDato15;
    public Vector vtrStrDato16;
    public Vector vtrStrDato17;
    public Vector vtrStrDato18;

    public Vector vtrIntDato1;
    public Vector vtrIntDato2;
    public Vector vtrIntDato3;
    public Vector vtrIntDato4;
    public Vector vtrIntDato5;
    public Vector vtrIntDato6;
    public Vector vtrIntDato7;
    public Vector vtrIntDato8;
    public Vector vtrIntDato9;
    public Vector vtrIntDato10;
    public Vector vtrIntDato11;
    public Vector vtrIntDato12;
    public Vector vtrIntDato13;
    public Vector vtrIntDato14;
    public Vector vtrIntDato15;
    public Vector vtrIntDato16;
    public Vector vtrIntDato17;
    public Vector vtrIntDato18;

    public Vector vtrDoubleDato1;
    public Vector vtrDoubleDato2;
    public Vector vtrDoubleDato3;
    public Vector vtrDoubleDato4;
    public Vector vtrDoubleDato5;
    public Vector vtrDoubleDato6;
    public Vector vtrDoubleDato7;
    public Vector vtrDoubleDato8;
    public Vector vtrDoubleDato9;
    public Vector vtrDoubleDato10;
    public Vector vtrDoubleDato11;
    public Vector vtrDoubleDato12;
    public Vector vtrDoubleDato13;
    public Vector vtrDoubleDato14;
    public Vector vtrDoubleDato15;
    public Vector vtrDoubleDato16;
    public Vector vtrDoubleDato17;
    public Vector vtrDoubleDato18;
    public Vector vtrDoubleDato19;

    public int intContador;
    public boolean blnDatos;
    private int index;

    nDatos() {
        vtrStrDato1 = new Vector(1, 1);
        vtrStrDato2 = new Vector(1, 1);
        vtrStrDato3 = new Vector(1, 1);
        vtrStrDato4 = new Vector(1, 1);
        vtrStrDato5 = new Vector(1, 1);
        vtrStrDato6 = new Vector(1, 1);
        vtrStrDato7 = new Vector(1, 1);
        vtrStrDato8 = new Vector(1, 1);
        vtrStrDato9 = new Vector(1, 1);
        vtrStrDato10 = new Vector(1, 1);
        vtrStrDato11 = new Vector(1, 1);
        vtrStrDato12 = new Vector(1, 1);
        vtrStrDato13 = new Vector(1, 1);
        vtrStrDato14 = new Vector(1, 1);
        vtrStrDato15 = new Vector(1, 1);
        vtrStrDato16 = new Vector(1, 1);
        vtrStrDato17 = new Vector(1, 1);
        vtrStrDato18 = new Vector(1, 1);

        vtrIntDato1 = new Vector(1, 1);
        vtrIntDato2 = new Vector(1, 1);
        vtrIntDato3 = new Vector(1, 1);
        vtrIntDato4 = new Vector(1, 1);
        vtrIntDato5 = new Vector(1, 1);
        vtrIntDato6 = new Vector(1, 1);
        vtrIntDato7 = new Vector(1, 1);
        vtrIntDato8 = new Vector(1, 1);
        vtrIntDato9 = new Vector(1, 1);
        vtrIntDato10 = new Vector(1, 1);
        vtrIntDato11 = new Vector(1, 1);
        vtrIntDato12 = new Vector(1, 1);
        vtrIntDato13 = new Vector(1, 1);
        vtrIntDato14 = new Vector(1, 1);
        vtrIntDato15 = new Vector(1, 1);
        vtrIntDato16 = new Vector(1, 1);
        vtrIntDato17 = new Vector(1, 1);
        vtrIntDato18 = new Vector(1, 1);

        vtrDoubleDato1 = new Vector(1, 1);
        vtrDoubleDato2 = new Vector(1, 1);
        vtrDoubleDato3 = new Vector(1, 1);
        vtrDoubleDato4 = new Vector(1, 1);
        vtrDoubleDato5 = new Vector(1, 1);
        vtrDoubleDato6 = new Vector(1, 1);
        vtrDoubleDato7 = new Vector(1, 1);
        vtrDoubleDato8 = new Vector(1, 1);
        vtrDoubleDato9 = new Vector(1, 1);
        vtrDoubleDato10 = new Vector(1, 1);
        vtrDoubleDato11 = new Vector(1, 1);
        vtrDoubleDato12 = new Vector(1, 1);
        vtrDoubleDato13 = new Vector(1, 1);
        vtrDoubleDato14 = new Vector(1, 1);
        vtrDoubleDato15 = new Vector(1, 1);
        vtrDoubleDato16 = new Vector(1, 1);
        vtrDoubleDato17 = new Vector(1, 1);
        vtrDoubleDato18 = new Vector(1, 1);
        vtrDoubleDato19 = new Vector(1, 1);

        intContador = 0;
        blnDatos = false;

        index = 0;

    }

    public boolean hasData() {
        return blnDatos;
    }

    public int getSize() {
        return intContador;
    }

    public void setIndex(int indice) {
        index = indice;
    }


    public void setVtrStrDato1(String strDato) {
        vtrStrDato1.add(strDato);
    }

    public void setVtrStrDato2(String strDato) {
        vtrStrDato2.add(strDato);
    }

    public void setVtrStrDato3(String strDato) {
        vtrStrDato3.add(strDato);
    }

    public void setVtrStrDato4(String strDato) {
        vtrStrDato4.add(strDato);
    }

    public void setVtrStrDato5(String strDato) {
        vtrStrDato5.add(strDato);
    }

    public void setVtrStrDato6(String strDato) {
        vtrStrDato6.add(strDato);
    }

    public void setVtrStrDato7(String strDato) {
        vtrStrDato7.add(strDato);
    }

    public void setVtrStrDato8(String strDato) {
        vtrStrDato8.add(strDato);
    }

    public void setVtrStrDato9(String strDato) {
        vtrStrDato9.add(strDato);
    }

    public void setVtrStrDato10(String strDato) {
        vtrStrDato10.add(strDato);
    }

    public void setVtrStrDato11(String strDato) {
        vtrStrDato11.add(strDato);
    }

    public void setVtrStrDato12(String strDato) {
        vtrStrDato12.add(strDato);
    }

    public void setVtrStrDato13(String strDato) {
        vtrStrDato13.add(strDato);
    }


    public void setVtrStrDato14(String strDato) {
        vtrStrDato14.add(strDato);
    }

    public void setVtrStrDato15(String strDato) {
        vtrStrDato15.add(strDato);
    }


    public void setVtrStrDato16(String strDato) {
        vtrStrDato16.add(strDato);
    }

    public void setVtrStrDato17(String strDato) {
        vtrStrDato17.add(strDato);
    }

    public void setVtrStrDato18(String strDato) {
        vtrStrDato18.add(strDato);
    }


    public void setVtrDoubleDato1(double dblDato) {
        vtrDoubleDato1.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato2(double dblDato) {
        vtrDoubleDato2.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato3(double dblDato) {
        vtrDoubleDato3.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato4(double dblDato) {
        vtrDoubleDato4.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato5(double dblDato) {
        vtrDoubleDato5.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato6(double dblDato) {
        vtrDoubleDato6.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato7(double dblDato) {
        vtrDoubleDato7.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato8(double dblDato) {
        vtrDoubleDato8.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato9(double dblDato) {
        vtrDoubleDato9.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato10(double dblDato) {
        vtrDoubleDato10.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato11(double dblDato) {
        vtrDoubleDato11.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato12(double dblDato) {
        vtrDoubleDato12.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato13(double dblDato) {
        vtrDoubleDato13.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato14(double dblDato) {
        vtrDoubleDato14.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato15(double dblDato) {
        vtrDoubleDato15.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato16(double dblDato) {
        vtrDoubleDato16.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato17(double dblDato) {
        vtrDoubleDato17.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato18(double dblDato) {
        vtrDoubleDato18.add(Double.valueOf(dblDato));
    }

    public void setVtrDoubleDato19(double dblDato) {
        vtrDoubleDato19.add(Double.valueOf(dblDato));
    }

    public void setVtrIntDato1(int intDato) {
        vtrIntDato1.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato2(int intDato) {
        vtrIntDato2.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato3(int intDato) {
        vtrIntDato3.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato4(int intDato) {
        vtrIntDato4.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato5(int intDato) {
        vtrIntDato5.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato6(int intDato) {
        vtrIntDato6.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato7(int intDato) {
        vtrIntDato7.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato8(int intDato) {
        vtrIntDato8.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato9(int intDato) {
        vtrIntDato9.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato10(int intDato) {
        vtrIntDato10.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato11(int intDato) {
        vtrIntDato11.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato12(int intDato) {
        vtrIntDato12.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato13(int intDato) {
        vtrIntDato13.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato14(int intDato) {
        vtrIntDato14.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato15(int intDato) {
        vtrIntDato15.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato16(int intDato) {
        vtrIntDato16.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato17(int intDato) {
        vtrIntDato17.add(Integer.valueOf(intDato));
    }

    public void setVtrIntDato18(int intDato) {
        vtrIntDato18.add(Integer.valueOf(intDato));
    }

    //
    public String getVtrStrDato1() {
        if ((String) vtrStrDato1.elementAt(index) == null)
            return "";
        return (String) vtrStrDato1.elementAt(index);
    }

    public String getVtrStrDato2() {
        if ((String) vtrStrDato2.elementAt(index) == null)
            return "";
        return (String) vtrStrDato2.elementAt(index);
    }

    public String getVtrStrDato3() {
        if ((String) vtrStrDato3.elementAt(index) == null)
            return "";
        return (String) vtrStrDato3.elementAt(index);
    }

    public String getVtrStrDato4() {
        if ((String) vtrStrDato4.elementAt(index) == null)
            return "";
        return (String) vtrStrDato4.elementAt(index);
    }

    public String getVtrStrDato5() {
        if ((String) vtrStrDato5.elementAt(index) == null)
            return "";
        return (String) vtrStrDato5.elementAt(index);
    }

    public String getVtrStrDato6() {
        if ((String) vtrStrDato6.elementAt(index) == null)
            return "";
        return (String) vtrStrDato6.elementAt(index);
    }

    public String getVtrStrDato7() {
        if ((String) vtrStrDato7.elementAt(index) == null)
            return "";
        return (String) vtrStrDato7.elementAt(index);
    }

    public String getVtrStrDato8() {
        if ((String) vtrStrDato8.elementAt(index) == null)
            return "";
        return (String) vtrStrDato8.elementAt(index);
    }

    public String getVtrStrDato9() {
        if ((String) vtrStrDato9.elementAt(index) == null)
            return "";
        return (String) vtrStrDato9.elementAt(index);
    }

    public String getVtrStrDato10() {
        if ((String) vtrStrDato10.elementAt(index) == null)
            return "";
        return (String) vtrStrDato10.elementAt(index);
    }

    public String getVtrStrDato11() {
        if ((String) vtrStrDato11.elementAt(index) == null)
            return "";
        return (String) vtrStrDato11.elementAt(index);
    }

    public String getVtrStrDato12() {
        if ((String) vtrStrDato12.elementAt(index) == null)
            return "";
        return (String) vtrStrDato12.elementAt(index);
    }

    public String getVtrStrDato13() {
        if ((String) vtrStrDato13.elementAt(index) == null)
            return "";
        return (String) vtrStrDato13.elementAt(index);
    }

    public String getVtrStrDato14() {
        if ((String) vtrStrDato14.elementAt(index) == null)
            return "";
        return (String) vtrStrDato14.elementAt(index);
    }

    public String getVtrStrDato15() {
        if ((String) vtrStrDato15.elementAt(index) == null)
            return "";
        return (String) vtrStrDato15.elementAt(index);
    }

    public String getVtrStrDato16() {
        if ((String) vtrStrDato16.elementAt(index) == null)
            return "";
        return (String) vtrStrDato16.elementAt(index);
    }

    public String getVtrStrDato17() {
        if ((String) vtrStrDato17.elementAt(index) == null)
            return "";
        return (String) vtrStrDato17.elementAt(index);
    }

    public String getVtrStrDato18() {
        if ((String) vtrStrDato18.elementAt(index) == null)
            return "";
        return (String) vtrStrDato18.elementAt(index);
    }


    public double getVtrDoubleDato1() {
        return ((Double) vtrDoubleDato1.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato2() {
        return ((Double) vtrDoubleDato2.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato3() {
        return ((Double) vtrDoubleDato3.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato4() {
        return ((Double) vtrDoubleDato4.elementAt(index)).doubleValue();
    }


    public double getVtrDoubleDato5() {
        return ((Double) vtrDoubleDato5.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato6() {
        return ((Double) vtrDoubleDato6.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato7() {
        return ((Double) vtrDoubleDato7.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato8() {
        return ((Double) vtrDoubleDato8.elementAt(index)).doubleValue();
    }


    public double getVtrDoubleDato9() {
        return ((Double) vtrDoubleDato9.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato10() {
        return ((Double) vtrDoubleDato10.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato11() {
        return ((Double) vtrDoubleDato11.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato12() {
        return ((Double) vtrDoubleDato12.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato13() {
        return ((Double) vtrDoubleDato13.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato14() {
        return ((Double) vtrDoubleDato14.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato15() {
        return ((Double) vtrDoubleDato15.elementAt(index)).doubleValue();
    }


    public double getVtrDoubleDato16() {
        return ((Double) vtrDoubleDato16.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato17() {
        return ((Double) vtrDoubleDato17.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato18() {
        return ((Double) vtrDoubleDato18.elementAt(index)).doubleValue();
    }

    public double getVtrDoubleDato19() {
        return ((Double) vtrDoubleDato19.elementAt(index)).doubleValue();
    }


    public int getVtrIntDato1() {
        return ((Integer) vtrIntDato1.elementAt(index)).intValue();
    }

    public int getVtrIntDato2() {
        return ((Integer) vtrIntDato2.elementAt(index)).intValue();
    }

    public int getVtrIntDato3() {
        return ((Integer) vtrIntDato3.elementAt(index)).intValue();
    }

    public int getVtrIntDato4() {
        return ((Integer) vtrIntDato4.elementAt(index)).intValue();
    }

    public int getVtrIntDato5() {
        return ((Integer) vtrIntDato5.elementAt(index)).intValue();
    }

    public int getVtrIntDato6() {
        return ((Integer) vtrIntDato6.elementAt(index)).intValue();
    }

    public int getVtrIntDato7() {
        return ((Integer) vtrIntDato7.elementAt(index)).intValue();
    }

    public int getVtrIntDato8() {
        return ((Integer) vtrIntDato8.elementAt(index)).intValue();
    }

    public int getVtrIntDato9() {
        return ((Integer) vtrIntDato9.elementAt(index)).intValue();
    }

    public int getVtrIntDato10() {
        return ((Integer) vtrIntDato10.elementAt(index)).intValue();
    }

    public int getVtrIntDato11() {
        return ((Integer) vtrIntDato11.elementAt(index)).intValue();
    }

    public int getVtrIntDato12() {
        return ((Integer) vtrIntDato12.elementAt(index)).intValue();
    }

    public int getVtrIntDato13() {
        return ((Integer) vtrIntDato13.elementAt(index)).intValue();
    }

    public int getVtrIntDato14() {
        return ((Integer) vtrIntDato14.elementAt(index)).intValue();
    }

    public int getVtrIntDato15() {
        return ((Integer) vtrIntDato15.elementAt(index)).intValue();
    }

    public int getVtrIntDato16() {
        return ((Integer) vtrIntDato16.elementAt(index)).intValue();
    }

    public int getVtrIntDato17() {
        return ((Integer) vtrIntDato17.elementAt(index)).intValue();
    }

    public int getVtrIntDato18() {
        return ((Integer) vtrIntDato18.elementAt(index)).intValue();
    }
    //

    public void removerValores() {
        vtrStrDato1.clear();
        vtrStrDato2.clear();
        vtrStrDato3.clear();
        vtrStrDato4.clear();
        vtrStrDato5.clear();
        vtrStrDato6.clear();
        vtrStrDato7.clear();
        vtrStrDato8.clear();
        vtrStrDato9.clear();
        vtrStrDato10.clear();
        vtrStrDato11.clear();
        vtrStrDato12.clear();
        vtrStrDato13.clear();
        vtrStrDato14.clear();
        vtrStrDato15.clear();
        vtrStrDato16.clear();
        vtrStrDato17.clear();

        vtrIntDato1.clear();
        vtrIntDato2.clear();
        vtrIntDato3.clear();
        vtrIntDato4.clear();
        vtrIntDato5.clear();
        vtrIntDato6.clear();
        vtrIntDato7.clear();
        vtrIntDato8.clear();
        vtrIntDato9.clear();
        vtrIntDato10.clear();
        vtrIntDato11.clear();
        vtrIntDato12.clear();
        vtrIntDato13.clear();
        vtrIntDato14.clear();
        vtrIntDato15.clear();
        vtrIntDato16.clear();
        vtrIntDato17.clear();
        vtrIntDato18.clear();

        vtrDoubleDato1.clear();
        vtrDoubleDato2.clear();
        vtrDoubleDato3.clear();
        vtrDoubleDato4.clear();
        vtrDoubleDato5.clear();
        vtrDoubleDato6.clear();
        vtrDoubleDato7.clear();
        vtrDoubleDato8.clear();
        vtrDoubleDato9.clear();
        vtrDoubleDato10.clear();
        vtrDoubleDato11.clear();
        vtrDoubleDato12.clear();
        vtrDoubleDato13.clear();
        vtrDoubleDato14.clear();
        vtrDoubleDato15.clear();
        vtrDoubleDato16.clear();
        vtrDoubleDato17.clear();
        vtrDoubleDato18.clear();
        vtrDoubleDato19.clear();
        intContador = 0;
        setIndex(0);
    }

}

