package ex02;

/**
 * Builder Pattern
 */
public class TimeRange {
    private int min;
    private int max;
    private TimeRange(){

    }
    public static TimeRange of(int min, int max){
        return (new TimeRange()).min(min).max(max);
    }

    private TimeRange min(int min){
        this.min = min;
        return this;
    }
    private TimeRange max(int max){
        this.max = max;
        return this;
    }

    public boolean contains(int age) {
        if(this.min <= age && age <= this.max){
            return true;
        }
        return false;
    }
}
