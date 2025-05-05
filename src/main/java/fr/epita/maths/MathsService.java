package fr.epita.maths;

public class MathsService {

    public static Integer factorial(Integer number) {
        if (number <0) {
            throw new IllegalArgumentException("Negative Input");
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number-1);
    }
}
