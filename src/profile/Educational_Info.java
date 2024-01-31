package profile;

public class Educational_Info 
{
	 //Attributes
    public Degree Latest_degree;
    public String Discipline;
    public int Grad_year;
    
    //Constructor
    public Educational_Info(Degree Latest_degree, String Discipline, int Grad_year){
        this.Latest_degree = Latest_degree;
        this.Discipline = Discipline;
        this.Grad_year = Grad_year;
    }
    
  //method Update_edu_info
    public void Update_edu_info(String choice, String Update)
    {
    	if ( choice.toUpperCase().equals("LATEST DEGREE") )
            this.Latest_degree = Degree.valueOf(Update);
         else if ( choice.toUpperCase().equals("DISCIPLINE") )
            this.Discipline = Update;
         else if ( choice.toUpperCase().equals("GRAD YEAR") ) 
            this.Grad_year = Integer.valueOf(Update);
        
    }
    @Override
    public String toString() {
        return "Educational_Info{" + "\nLatest_degree: " + Latest_degree + "\nDiscipline: " + Discipline + "\nGraduation year: " + Grad_year + "}";
    }
}