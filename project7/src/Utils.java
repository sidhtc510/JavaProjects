public class Utils {

    int[] arr;     // Поля класса
    int count;
    int[] sub;

    public Utils(int[] arr) {   // Конструктор, в который принимаем массив
        this.arr = arr;   // Присваиваем массиву, переданный массив
    }
   // Создаем метод, который возвращает и принимает массив типа int
    public int[] sort(int[] arr){
        int temp;       // Создаем временную переменную для хранения числа при его перемещении
        for (int i = 0; i < arr.length; i++) {    // Создаю два цикла для перебора всего массива в каждом из них
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){  // Сравниваем каждый элемент со всеми элементами и меняем их местами, если достигнуто условие
                    temp = arr[i];   // Записываем во временную переменную перемещаемое значение
                    arr[i] = arr[j];  // Записываем в позицию перемещаемого значения новое значение
                    arr[j] = temp;  // Записываем в позицию перемещенного значения запомненную переменную
                }
            }
        }
        return arr;   // Возвращаем отсортированный массив
    }

    public void arrayOut(){                 // Вывожу массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ") ;   // Вывод в строку
        }
        System.out.print("\n"); // Переход на новую строку
    }

    public void defineLength(){
        count = 0;                            // Обнуляю переменную
        for (int i = 0; i < arr.length ; i++) {          // Цикл, который определяет какие
            if(arr[i] % 3 == 0 && arr[i] != 0){                           // Проверяем кратно ли число 3
                System.out.println("Элемент кратный 3: " + arr[ i]);
                count++;                                              // Увеличиваем счетчик
                System.out.println("Счетчик, определяющий размер подмассива: " + count);
            }
        }

        sub = new int[count]; // Выделяем память для массива
    }

    public void fillArray(){
        count = 0;                               // Обнуляю счетчик
        for (int i = 0; i < arr.length; i++) {            // Проходим массив и добавляем числа кратные 3 в подмассив
            if(arr[i] % 3 == 0 && arr[i] != 0){                           // Проверяем кратно ли число 3 и равно ли оно нуля
                sub[count] = arr[i];                                 // Добавляем элемент
                System.out.println("Добавленный элемент: " + sub[count]);
                count++;                      // Увеличиваем индекс
            }
        }
    }

    public  double average(){
        double av = 0;          // Переменная, суммирующая элементы массива
        for (int i = 0; i < sub.length; i++) {
            av += sub[i];                    // Суммируем элементы
        }
        return av/ sub.length;        // Возвращаю среднее арифметическое - сумму элементов делю на их количество
    }

    // Аксессоры(геттеры и сеттеры) - методы для доступа к переменным

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getSub() {
        return sub;
    }

    public void setSub(int[] sub) {
        this.sub = sub;
    }
}