interface Student
  {
  void showAcademicScore();
  }

interface Sports
  {
  void showSportsScore();
  }


class Result implements Student, Sports 
   {
    private int academicScore = 76;  
    private int sportsScore = 85;    
 
    public void showAcademicScore() 
        {
        System.out.println("Academic Score: " + academicScore);
        }

   
    public void showSportsScore() 
        {
        System.out.println("Sports Score: " + sportsScore);
        }

    
    public void displayResult()
        {
        showAcademicScore();
        showSportsScore();
        }
        }


public class Interface 
    {
    public static void main(String[] args) 
        {
        Result studentResult = new Result();
        studentResult.displayResult();
        }
    }

               