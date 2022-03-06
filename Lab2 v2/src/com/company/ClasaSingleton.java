package com.company;

public class ClasaSingleton {
//    Clasa singleton este clasa care nu poate fi initializata decat o singura data.
//    Pasul 1: Constructorul de initializare devine privat pentru impiedicarea instantierei clasei
//    Pasul 2: campul static va fi folosit pentru retinerea singurei instante a clasei: ClasaSingleton clasaSingleton
//    Pasul 3: metoda de tip factory: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

    private static String numeClasaSingleton;
    private static ClasaSingleton clasaSingleton;

    private ClasaSingleton()
    {
        numeClasaSingleton = "Numele meu de azi nu-l vei schimba";
    }

    public static ClasaSingleton getClasaSingleton()
    {
        if(clasaSingleton == null)
            clasaSingleton = new ClasaSingleton();
        return clasaSingleton;
    }

    public static void printStats()
    {
        System.out.println("Nume:" + numeClasaSingleton);
    }
}
