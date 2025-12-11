public static List<Integer> gradingStudents(List<Integer> grades) {
    
        List<Integer> result = new ArrayList<Integer>();
    
        for (Integer grade : grades) {
            if (grade < 38) {
                result.add(grade);
            } else if ( grade % 5 > 2){
               int gradeIntPortion = grade / 5;
               grade = gradeIntPortion * 5 + 5;
               result.add(grade);
            } else {
                result.add(grade);
            }
        }
        return result;
    }
