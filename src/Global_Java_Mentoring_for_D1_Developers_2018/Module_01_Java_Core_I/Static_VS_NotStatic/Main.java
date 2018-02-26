package Global_Java_Mentoring_for_D1_Developers_2018.Module_01_Java_Core_I.Static_VS_NotStatic;

public class Main {
    public static void main(String[] args) {
        MyClass myObject1 = new MyClass();
        System.out.println(myObject1.amountOfObjects + " VS " + myObject1.amountOfObjectsStatic);

        MyClass myObject2 = new MyClass();
        System.out.println(myObject2.amountOfObjects + " VS " + myObject2.amountOfObjectsStatic);
    }
}
/**
 * Output:
 * 1 VS 1
 * 1 VS 2
 * Статические методы можно исп. без создания объекта класса! Например: Math.abs(-5);
 * Переопределить статик метод родительского класса не возможно,
 * это будет сокрытие!
 *
 */