public class Date{
    private int dia;
    private int mes;
    private int ano;
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
    public String nombreMes(int mes)
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
    public boolean dayisRight(int dia, int mes){
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
    public String seasonofMonth(int mes, int dia){
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

}