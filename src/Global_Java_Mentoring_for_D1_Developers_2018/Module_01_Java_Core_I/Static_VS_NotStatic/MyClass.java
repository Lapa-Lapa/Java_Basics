package Global_Java_Mentoring_for_D1_Developers_2018.Module_01_Java_Core_I.Static_VS_NotStatic;

public class MyClass {

    public int amountOfObjects;
    public static int amountOfObjectsStatic;//Глобальная переменная
    public String name;
    public boolean isCreated;

    public MyClass() {
        amountOfObjects++;
        amountOfObjectsStatic++;
        this.isCreated=true;//this. работает только с НЕ статик переменными
    }
}