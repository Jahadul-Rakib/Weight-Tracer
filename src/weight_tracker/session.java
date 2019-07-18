
package weight_tracker;


public class session {
    
    public static String UserEmail;
    public static Double value;
    public static Double caloriburnPerMin;
    public static Double Currentweight;
    public static String UserDate;
    public static String AfterExerciseWeight;
    public static double averageWeight;
    public static double execiseminsum;
    public static Double AvgWeightChange;

    public static Double getAvgWeightChange() {
        return AvgWeightChange;
    }

    public static void setAvgWeightChange(Double AvgWeightChange) {
        session.AvgWeightChange = AvgWeightChange;
    }

    public static double getExeciseminsum() {
        return execiseminsum;
    }

    public static void setExeciseminsum(double execiseminsum) {
        session.execiseminsum = execiseminsum;
    }

    public static double getAverageWeight() {
        return averageWeight;
    }

    public static void setAverageWeight(double averageWeight) {
        session.averageWeight = averageWeight;
    }

    public static String getAfterExerciseWeight() {
        return AfterExerciseWeight;
    }

    public static void setAfterExerciseWeight(String AfterExerciseWeight) {
        session.AfterExerciseWeight = AfterExerciseWeight;
    }

    public static String getUserDate() {
        return UserDate;
    }

    public static void setUserDate(String UserDate) {
        session.UserDate = UserDate;
    }

    

    public static Double getCurrentweight() {
        return Currentweight;
    }

    public static void setCurrentweight(Double Currentweight) {
        session.Currentweight = Currentweight;
    }

    public static Double getCaloriburnPerMin() {
        return caloriburnPerMin;
    }

    public static void setCaloriburnPerMin(Double caloriburnPerMin) {
        session.caloriburnPerMin = caloriburnPerMin;
    }

    public static Double getTotal() {
        return total;
    }

    public static void setTotal(Double total) {
        session.total = total;
    }
    public static Double total;

    public static Double getValue() {
        return value;
    }

    public static void setValue(Double value) {
        session.value = value;
    }

    public static String getUserEmail() {
        return UserEmail;
    }

    public static void setUserEmail(String UserEmail) {
        session.UserEmail = UserEmail;
    }
    
    
}
