public class Date{
    public int dia;
    public int mes;
    public int ano;
    public Date(){}
    public Date(int dia, int mes, int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    int Getdia()
    {
        return this.dia;
    }
    int Getmes()
    {
        return this.mes;
    }
    int Getano()
    {
        return this.ano;
    }
    //es el mismo año
    public boolean isSameYear(int ano){
        boolean mismoano=false;
        if(this.ano==ano)
        {
            mismoano=true;
        }
        return mismoano;
    }
    public boolean isSameMonth(int mes){
        boolean mismomes=false;
        if(this.mes==mes)
        {
            mismomes=true;
        }
        return mismomes;
    }
    public boolean isSameDay(int dia){
        boolean mismodia=false;
        if(this.dia==dia)
        {
            mismodia=true;
        }
        return mismodia;
    }
    public boolean isSame(int ano, int mes, int dia){
        boolean mismo=false;
        if ((this.ano==ano)&&(this.mes==mes)&&(this.dia==dia))
        {
            mismo=true;
        }
        return mismo;
    }
    //returns the name of the month
    public String nombreMes()
    {
        String nombre="---";
        switch (mes) {
            case 1:
                nombre="Enero";
                break;
            case 2:
                nombre="Febrero";
                break;
            case 3:
                nombre="Marzo";
                break;
            case 4:
                nombre="Abril";
                break;
            case 5:
                nombre="Mayo";
                break;
            case 6:
                nombre="Junio";
                break;
            case 7:
                nombre="Julio";
                break;
            case 8:
                nombre="Agosto";
                break;
            case 9:
                nombre="Septiembre";
                break;
            case 10:
                nombre="Octubre";
                break;
            case 11:
                nombre="Noviembre";
                break;
            case 12:
                nombre="Diciembre";
                break;
            default:
                break;
        }
        return nombre;
    }

    //checks if the day of the month is right
    public boolean dayisRight(){
        boolean isright=false;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia<=31)
                {
                    isright=true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia<=30)
                {
                    isright=true;
                }
            case 2:
                if (dia<=28)
                {
                    isright=true;
                }
            default:
                break;
        }
        return isright;
    }
    //return season of this month
    public String seasonofMonth(){
        String season="";
        switch (mes) {
            case 1:
            case 2:
                season="Invierno";
                break;
            case 12:
                if(dia>=21)
                {
                    season="Invierno";
                }
                else 
                {
                    season="Otono";
                }
                break;
            case 3:
                if(dia>=21)
                {
                    season="Primavera";
                }
                else 
                {
                    season="Invierno";
                }
            case 4:
            case 5:
                season="Primavera";
                break;
            case 6:
                if(dia>=21)
                {
                    season="Verano";
                }
                else 
                {
                    season="Primavera";
                }
                break;
            case 7:
            case 8:
                season="Verano";
                break;
            case 9:
                if(dia>=21)
                {
                    season="Otono";
                }
                else 
                {
                    season="Verano";
                }
                break;
            case 10:
            case 11:
                season="Otono";
                break;
            default:
                break;
        }
        return season;
    }
    //return the months left until the end of the year
    public int monthsuntilEnd(){
        int meses=0;
        switch (mes) {
            case 1:
                meses=12;
                break;
            case 2:
                meses=11;
                break;
            case 3:
                meses=10;
                break;
            case 4:
                meses=9;
                break;
            case 5:
                meses=8;
                break;
            case 6:
                meses=7;
                break;
            case 7:
                meses=6;
                break;
            case 8:
                meses=5;
                break;
            case 9: 
                meses=4;
                break;
            case 10:
                meses=3;
                break;
            case 11:
                meses=2;
                break;
            case 12:
                meses=1;
                break;
            default:
                break;
        }
        return meses;
    }
    //returns the string version date
    public String stringDate()
    {
        String date=String.valueOf(dia+"//"+mes+"//"+ano);
        return date;
    }
    //returns all dates until the end of the month
//     public String datesuntilendMonth(int dia, int mes)
//     {
//         String date="";
//         if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12))
//         {   
//             for (dia<=31 ; dia++)
//             {
//                 date=String.valueOf(dia+"//"+mes);
//                 return date;
//             }
//         }
//         else if ((mes==4)||(mes==6)||(mes==9)||(mes==1))
//         {   

//             for (dia<=30; dia++)
//             {
//                 date=String.valueOf(dia+"//"+mes);
//                 return date;
//             }
//         }
//         else
//         {
//             for(dia<=28; dia++)
//             {
//                 date=String.valueOf(dia+"//"+mes);
//                 return date;
//             }
//         }
//     }

}