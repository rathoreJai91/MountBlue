import java.util.*;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i=0;i<grades.size();i++){
            int currGrade=grades.get(i);
            if(currGrade>=38 && currGrade%5>2){    
                currGrade+=(5-currGrade%5);
                grades.set(i, currGrade);
            }
        }
        return grades;
    }
}
