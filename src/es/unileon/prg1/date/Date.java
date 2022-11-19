package es.unileon.prg1.date;

public class Date{
    private int dia;
    private int mes;
    private int ano;
    //constructor
   public Date(){
    this.dia=1;
    this.mes=1;
    this.ano=2017;
   }
    public Date(Date another){
        this.dia=another.getDay();
        this.mes=another.getMonth();
        this.ano=another.getYear();
    }

    public Date (int dia, int mes, int ano) throws DateException {
		//this.month = month;
		this.setMonth(mes);
		//this.day = day;
		this.setDay(dia);
		//this.year = year;
		this.setYear(ano);
	}
    public void setDay(int dia) throws DateException {
		if ( dia < 1 || dia > this.daysOfMonth() ) {
			throw new DateException("Date error: Day " + dia + " of month " + this.mes + " not valid");			
		}
		this.dia = dia;
	}
	
	public void setMonth (int mes) throws DateException {
		if ( mes < 1 || mes > 12) {
			throw new DateException("Date error: Month " + mes + " not valid");
		}
        if ((mes==2)&&(dia>28))
        {
            throw new DateException("Date error: Day " + dia + " not valid");
        }
        else if ((mes==11)||(mes==3)||(mes==4)||(mes==6)||(mes==9))
        {
            if (dia>30)
            {
                throw new DateException("Date error: Day " + dia + " not valid");
            }
        }
        else
        {
            if (dia>31)
            {
                throw new DateException("Date error: Day " + dia + " not valid");
            }
        }

		this.mes = mes;
	}
	
	public void setYear (int ano) throws DateException {
		this.ano = ano;
        if(ano<=-1)
        {
            throw new DateException("Date error: Year " + ano + " not valid");
        }
	}
    public int daysOfMonth() {
		int numdias;
		
		numdias = 0;
		switch (this.mes) {
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12:
			numdias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numdias = 30;
			break;
		case 2:
			numdias = 28;
			break;			
		}
		
		return numdias;
	}
    int getDay()
    {
        return this.dia;
    }
    int getMonth()
    {
        return this.mes;
    }
    int getYear()
    {
        return this.ano;
    }
    public Date tomorrow () throws DateException
    {   
        Date tomorrow=new Date(dia+1, mes, ano);
        boolean variable=tomorrow.dayisRight();
        if(variable==false)
        {
            tomorrow.setDay(1);
            tomorrow.setMonth(mes+1);
            return tomorrow;
        }
        int dia=tomorrow.getDay();
        int mes=tomorrow.getMonth();
        if((dia==32)&&(mes==12))
        {   
            tomorrow.setDay(1);
            tomorrow.setMonth(1);
            tomorrow.setYear(ano+1);
            return tomorrow;
        }
        return tomorrow;
    }
    //es el mismo año
    public boolean isSameYear(Date aDay){
        boolean mismoano=false;
        if(this.ano==aDay.getYear())
        {
            mismoano=true;
        }
        return mismoano;
    }
    public boolean isSameMonth(Date aDay){
        boolean mismomes=false;
        if(this.mes==aDay.getMonth())
        {
            mismomes=true;
        }
        return mismomes;
    }
    public boolean isSameDay(Date aDay){
        boolean mismodia=false;
        if(this.dia==aDay.getDay())
        {
            mismodia=true;
        }
        return mismodia;
    }
    public boolean isSame(Date aDay){
        boolean mismo=false;
        if ((this.ano==aDay.getYear())&&(this.mes==aDay.getMonth())&&(this.dia==aDay.getDay()))
        {
            mismo=true;
        }
        return mismo;
    }
    //returns the name of the month
    public String getMonthName()
    {
        String nombre="---";
        switch (mes) {
            case 1:
                nombre="January";
                break;
            case 2:
                nombre="February";
                break;
            case 3:
                nombre="March";
                break;
            case 4:
                nombre="April";
                break;
            case 5:
                nombre="May";
                break;
            case 6:
                nombre="June";
                break;
            case 7:
                nombre="July";
                break;
            case 8:
                nombre="August";
                break;
            case 9:
                nombre="September";
                break;
            case 10:
                nombre="October";
                break;
            case 11:
                nombre="November";
                break;
            case 12:
                nombre="December";
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
    public String getSeasonName(){
        String season="";
        switch (mes) {
            case 1:
            case 2:
                season="Winter";
                break;
            case 12:
                if(dia>=21)
                {
                    season="Winter";
                }
                else 
                {
                    season="Autumn";
                }
                break;
            case 3:
                if(dia>=21)
                {
                    season="Spring";
                }
                else 
                {
                    season="Winter";
                }
            case 4:
            case 5:
                season="Spring";
                break;
            case 6:
                if(dia>=21)
                {
                    season="Summer";
                }
                else 
                {
                    season="Spring";
                }
                break;
            case 7:
            case 8:
                season="Summer";
                break;
            case 9:
                if(dia>=21)
                {
                    season="Autumn";
                }
                else 
                {
                    season="Summer";
                }
                break;
            case 10:
            case 11:
                season="Autumn";
                break;
            default:
                break;
        }
        return season;
    }
    //return the months left until the end of the year
    public String getMonthsLeft(){
        String meses="";
        switch (mes) {
            case 1:
                meses="February March April May June July August September October November December ";
                break;
            case 2:
                meses="March April May June July August September October November December ";
                break;
            case 3:
                meses="April May June July August September October November December ";
                break;
            case 4:
                meses="May June July August September October November December ";
                break;
            case 5:
                meses="June July August September October November December ";
                break;
            case 6:
                meses="July August September October November December ";
                break;
            case 7:
                meses="August September October November December ";
                break;
            case 8:
                meses="September October November December ";
                break;
            case 9: 
                meses="October November December ";
                break;
            case 10:
                meses="November December ";
                break;
            case 11:
                meses="December ";
                break;
            default:
                break;
        }
        return meses;
    }
    //returns the string version date
    public String toString()
    {
        String date=String.valueOf(dia+"/"+mes+"/"+ano);
        return date;
    }
    //returns all dates until the end of the month
    public String getDaysLeftOfMonth()
    {
        String date="";
        if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12))
        {   
            for (int i=dia+1; i<=31 ; ++i)
            {
                date=(date+" "+String.valueOf(i+"/"+mes+"/"+ano));
            }
        }
        else if ((mes==4)||(mes==6)||(mes==9)||(mes==1))
        {   
            for (int i=dia+1; i<=30 ; ++i)
            {
                date=(date+" "+String.valueOf(i+"/"+mes+"/"+ano));
            }
        }
        else
        {   
            for(int i=dia+1; i<=28; ++i)
            {
                date=(date+" "+String.valueOf(i+"/"+mes+"/"+ano));
                
            }
        }
        date=(date.substring(0+1)+" ");
        return date;
    }
    //returns the months with the same number of the days
    //as the month of this date
    public String getMonthsSameDays()
    {   
        String meses="";
        switch (mes) {
            case 1:
                meses="January March May July August October December ";
                break;
            case 3:
                meses="January March May July August October December ";
                break;
            case 5:
                meses="January March May July August October December ";
                break;
            case 7:
                meses="January March May July August October December ";
                break;
            case 8:
                meses="January March May July August October December ";
                break;
            case 10:
                meses="January March May July August October December ";
                break;
            case 12:
                meses="January March May July August October December ";
                break;
            case 4:
                meses="April June September November ";
                break;
            case 6:
                meses="April June September November ";
                break;
            case 9:
                meses="April June September November ";
                break;
            case 11:
                meses="April June September November ";
                break;
            case 2:
                meses="February ";
            default:
                break;
        }
        return meses;
    }
    //Count the number of days since the first day of the year
    public int countDays()
    {
        int days=0;
        int mes1=31;
        int mes2=28;
        int mes3=30;
        switch (mes1) {
            case 1:
                days=dia;
                break;
            case 2:
                days=dia+mes1;
                break;
            case 3:
                days=dia+mes2+mes3;
                break;
            case 4:
                days=dia+mes2+(2*mes1);
                break;
            case 5:
                days=dia+mes2+(2*mes1)+mes3;
                break;
            case 6:
                days=dia+mes2+(3*mes1)+mes3;
                break;
            case 7:
                days=dia+mes2+(3*mes1)+(2*mes3);
                break;
            case 8:
                days=dia+mes2+(4*mes1)+(2*mes3);
                break;
            case 9:
                days=dia+mes2+(5*mes1)+(2*mes3);
                break;
            case 10:
                days=dia+mes2+(5*mes1)+(3*mes3);
                break;
            case 11:
                days=dia+mes2+(6*mes1)+(3*mes3);
                break;
            case 12:
                days=dia+mes2+(6*mes1)+(4*mes3);
                break;
            default:
                break;
        }
        return days;
    }
    //Counts the number of attempts needed to generate 
    // a random date equals to a given date (only inside the same year) (while)
    public int numRandomTriesEqualDate()
    {   
        int diaR=(int)(Math.random()*30+1);
        int mesR=(int)(Math.random()*12+1);
        int intentos=0;
        while((dia!=diaR)&&(mes!=mesR))
        {   
            diaR=(int)(Math.random()*30+1);
            mesR=(int)(Math.random()*12+1);
            intentos++;
        }
        intentos--;
        return intentos;
    }
    //Counts the number of attempts needed to generate 
    // a random date equals to a given date (only inside the same year) (d0 - while)
    public int equalRandomdo()
    {   
        int diaR=(int)(Math.random()*30+1);
        int mesR=(int)(Math.random()*12+1);
        int intentos=0;
        do{
            diaR=(int)(Math.random()*30+1);
            mesR=(int)(Math.random()*12+1);
            intentos++;
        }while((dia!=diaR)&&(mes!=mesR));
        return intentos;
    }
}