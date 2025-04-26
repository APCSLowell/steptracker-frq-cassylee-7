import java.util.ArrayList;
public class StepTracker
{
 private int totalSteps;
 private int totalDays;
 private int actDays;
 private int minSteps;

 public StepTracker (int goals) {
  minSteps = goals;
  totalSteps = 0;
  totalDays = 0;
  actDays = 0;
 }

 public void addDailySteps (int steps) {
  totalSteps += steps;
  totalDays++;
  if (steps >= minSteps) 
   actDays++;
 }

 public int activeDays() {
  return actDays;
 }

 public double averageSteps() {
  if (total == 0)
   return 0.0;
  return (double) totalSteps/totalDays;
 }
} 
