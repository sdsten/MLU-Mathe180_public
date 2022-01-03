import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class Main {

    // *********************************************************
    // Bitte während des Tests nichts an dieser Datei verändern!
    // Sie müssen nur die Datei Schrittzaehler.java bearbeiten!
    // *********************************************************

    public static void main(String[] args) {

        System.out.println("Rufe Konstruktor auf mit Parameter 2000...");
        Object instance = instantiate(Schrittzaehler.class, new Class[] { int.class }, new Object[] { 2000 });
        System.out.println(instance);

        if (instance != null) {
            System.out.println("Rufe Methode schritteBisZumTagesziel auf...");
            Object res = testOp("schritteBisZumTagesziel", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);
            
            System.out.println("Rufe Methode laufen auf mit Parameter 180...");
            res = testOp("laufen", instance, new Class[]{int.class}, new Object[]{ 180 });
            System.out.println(instance);

            System.out.println("Rufe Methode schritteBisZumTagesziel auf...");
            res = testOp("schritteBisZumTagesziel", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);
            
            System.out.println("Rufe Methode tageszielErreicht auf...");
            res = testOp("tageszielErreicht", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);

            System.out.println("Rufe Methode schwimmen auf mit Parameter 20...");
            res = testOp("schwimmen", instance, new Class[]{int.class}, new Object[]{ 20 });
            System.out.println(instance);
            
            System.out.println("Rufe Methode schritteBisZumTagesziel auf...");
            res = testOp("schritteBisZumTagesziel", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);
            
            System.out.println("Rufe Methode tageszielErreicht auf...");
            res = testOp("tageszielErreicht", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);
            
            System.out.println("Rufe Methode laufen auf mit Parameter 900...");
            res = testOp("laufen", instance, new Class[]{int.class}, new Object[]{ 900 });
            System.out.println(instance);

            System.out.println("Rufe Methode schritteBisZumTagesziel auf...");
            res = testOp("schritteBisZumTagesziel", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);
            
            System.out.println("Rufe Methode tageszielErreicht auf...");
            res = testOp("tageszielErreicht", instance, new Class[]{}, new Object[]{});
            System.out.println("Rückgabewert: " + res);
        }
    }

    public static Object instantiate(Class clazz, Class[] types, Object[] args) {
        try {
            return clazz.getDeclaredConstructor(types).newInstance(args);
        } catch (InstantiationException | InvocationTargetException e) {
            System.err.println(e.getCause());
        } catch (IllegalAccessException e) {
            System.err.println("Konstruktor mit falscher Sichtbarkeit deklariert!");
        } catch (NoSuchMethodException e) {
            System.err.println("Konstruktor noch nicht korrekt deklariert!");
        }
        return null;
    }

    public static Object testOp(String op, Object instance, Class[] types, Object[] args) {
        try {
            Method m = instance.getClass().getDeclaredMethod(op, types);
            return m.invoke(instance, args);
        } catch (NoSuchMethodException e) {
            System.err.println("Methode "+op+" noch nicht korrekt deklariert!");
        } catch (IllegalAccessException e) {
            System.err.println("Methode "+op+" mit falscher Sichtbarkeit deklariert!");
        } catch (InvocationTargetException e) {
            System.err.println(e.getCause());
        }
        return null;
    }
}