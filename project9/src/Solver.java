public class Solver {



    public double linearEquation(double x, double a){
        return a/x;
    }

    public double findDiscriminant(double a, double b, double c){
        return Math.pow(b, 2) - 4*a*c;          // b*b - 4*a*c; Альтернативный вариант
    }

    public boolean isRoots(double discriminant){    //  Проверяем есть ли корни
        if(discriminant < 0){ // Если дискриминант меньше нуля корней нет
            return false;
        }
        else {             // Иначе корни есть
            return true;
        }
    }

    public boolean isTwoRoots(double discriminant){  // Проверяем сколько корней
        if(discriminant == 0){     // Дискриминант равен нулю - один корень
            return false;
        }
        else {
            return true;      // Иначе два
        }
    }

    public double singleRoot(double a, double b, double discriminant){
        return (-b + Math.sqrt(discriminant))/(2*a); // Нахожу один корень
    }

    public double[] doubleRoot(double a, double b, double discriminant){
        double[] arr = new double[2];                   // Находим два корня
        arr[0] = singleRoot(a, b, discriminant);
        arr[1] = (-b - Math.sqrt(discriminant))/(2*a);

        return arr;
    }

}
