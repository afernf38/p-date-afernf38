public class Menu{
    public static void main(String[] args) {
        System.out.println("Introduce una fecha:");
        int diaa, mees, aano;
        diaa=Teclado.readInteger();
        mees=Teclado.readInteger();
        aano=Teclado.readInteger();
        Date fecha=new Date(diaa, mees, aano);
        int opcion=0;
        System.out.println("Elige que quieres realizar:");
        System.out.println("Comprobaciones:");
        System.out.println("1 - Es el mismo ano");
        System.out.println("2 - Es el mismo mes");
        System.out.println("3 - Es el mismo dia");
        System.out.println("4 - Es la misma fecha");
        System.out.println("5 - Nombre del mes");
        System.out.println("6 - Comprobacion estructura correcta fecha");
        System.out.println("7 - Estacion del año");
        System.out.println("8 - Meses que quedan para finalizar el año");
        System.out.println("9 - Mostrar formato fecha");
        opcion=Teclado.readInteger();
        if(opcion==1)
        {   
            int anocom;
            System.out.println("Introduce el aaño:");
            anocom=Teclado.readInteger();
            boolean comparasionano=fecha.isSameYear(anocom);
            if(comparasionano==true)
            {System.out.println("Son el mismo año");}
            else
            {System.out.println("Años diferentes");}
        }
        else if (opcion==2)
        {
            int mescom;
            System.out.println("Introduce el mes:");
            mescom=Teclado.readInteger();
            boolean comparasionmes=fecha.isSameMonth(mescom);
            if(comparasionmes==true)
            {System.out.println("Son el mismo mes");}
            else
            {System.out.println("Meses diferentes");}
        }
        else if(opcion==3)
        {
            int dia;
            System.out.println("Introduce el dia:");
            dia=Teclado.readInteger();
            boolean comparasiondia=fecha.isSameDay(dia);
            if(comparasiondia==true)
            {System.out.println("Son el mismo dia");}
            else
            {System.out.println("Dias diferentes");}
        }
        else if (opcion==4)
        {
            int dia;
            System.out.println("Introduce el dia:");
            dia=Teclado.readInteger();
            int mescom;
            System.out.println("Introduce el mes:");
            mescom=Teclado.readInteger();
            int anocom;
            System.out.println("Introduce el año:");
            anocom=Teclado.readInteger();
            boolean mismafecha=fecha.isSame(dia, mescom, anocom);
            if(mismafecha==true)
            {System.out.println("Son la misma fecha");}
            else
            {System.out.println("Fechas diferentes");}
        }
        else if (opcion==5)
        {
            String nombremes=fecha.nombreMes();
            System.out.println(nombremes);
        }
        else if (opcion==6)
        {
            boolean diascorrectos=fecha.dayisRight();
            if(diascorrectos==true)
            {System.out.println("Dia correcto!");}
            else
            {System.out.println("Dia incorrecto!");}
        }
        else if (opcion==7)
        {
            String estacion=fecha.seasonofMonth();
            System.out.println(estacion);
        }
        else if (opcion==8)
        {
            int mesesfin=fecha.monthsuntilEnd();
            System.out.println("Quedan "+mesesfin+" para finalizar el año");
        }
        else if (opcion==9)
        {
            String fechaf=fecha.stringDate();
            System.out.println(fechaf);
        }
        
    }
}