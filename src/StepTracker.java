public class StepTracker {
    public int goalStep = 10000;
    MonthData monthData = new MonthData();
    MonthData[] monthToData = new MonthData[12];

    Converter converter = new Converter();

    public void StepTracker() {
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }


    class MonthData {
        int[] days = new int[31];

        public void stepEdit(int step, int day) {
            days[day] = days[day] + step;
            System.out.println(days[day]);
        }
        public void numberOfSteps(int month) {
            Converter converter = new Converter();
            int maxStep = 0;
            int mostStep = 0;
            int averageStep = 0;

            for (int i = 0; i < days.length; i++) {
                if (mostStep < days[i]) {
                mostStep = days[i];
                }
                maxStep = maxStep + days[i];
                System.out.print(i + 1 + " день: " + days[i] + ", ");
            }
            averageStep = maxStep / days.length;

            System.out.println("Общее количество шагов за месяц: " + maxStep);
            System.out.println("Максимальное пройденное количество шагов в месяце: " + mostStep);
            System.out.println("Среднее количество шагов: " + averageStep);
                converter.Converter(maxStep);
                converter.calories(maxStep);
                monthToData[month].series();
        }
        public void series() {
            int saveStep = 0;
            int series = 0;
            for (int i = 0; i < days.length; i++) {
                if (days[i] >= goalStep) {
                    saveStep++;
                    if (series < saveStep)
                        series++;
                }
                else {
                    saveStep = 0;
                }
                }
            System.out.println("Лучшая серия выполнения цели: : " + series );
        }
        public void setGoal(int step){

            goalStep = step;
        }



    }
}