package net.guides.springboot2.crud.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalcDays {

    public static int numeroDiasEntreDosFechas(Date fecha1) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date actual = new Date();
        Date fechaInicial=dateFormat.parse(fecha1.toString());
        Date fechaFinal=dateFormat.parse(actual.toString());

        int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
        return (int) TimeUnit.DAYS.convert(dias, TimeUnit.MILLISECONDS);
    }

    /**
     * Método estático que añade o resta periodos de tiempo a una fecha dada
     * @param fecha, fecha inicial
     * @param campo tipo de periodo (pe. Calendar.HOUR)
     * @param valor cantidad de tiempo a añadir o restar
     * @return fecha modificada con el valor y campo especificados
     */
    public static Date variarFecha(Date fecha, int campo, int valor){
        if (valor==0) return fecha;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(campo, valor);
        return calendar.getTime();
    }

    /**
     * Método estático que devuelve el número de días que tiene el mes de una fecha
     * @param fecha
     * @return número de días del mes correspondiente
     */
    public static int numeroDiasMes(Date fecha){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
