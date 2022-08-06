import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    У каждого класса есть:
    1. Название пакета
    2. Название класса
    3. Поля
    4. Методы (в том числе конструкторы)
    5. Аннотации
     */

    /*
    class Class{
        String name;
        String packageName;
        List <Attribute> attributes;
        List <Method> methods;
    }
     */

    /*
    Рефлексия: классы можно рассматривать как объекты класса Class и работать с ними как
    с обычними объектами

    В классе Class используются классы:
    1. Method
    2. Field
    3. Annotation

    Declared в названии = игнорирование инкапсуляции, получение доступа к private объектам (полям, методам)
    Declared method используются в Spring: @Autowired
     */

    /*
    Получить доступ к объекту класса Class:
    Class c = MyClass.class;
    Class c = obj.getClass() obj = экземпляр класса MyClass
    Class c = Class.forName("ru.alishev.MyClass")
     */

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //Class personClass = Person.class;

        /*Method [] personClassMethods = personClass.getMethods();
        for (Method method: personClassMethods){
            System.out.println(method.getName() + " "
                    + method.getReturnType() + " "
                    + Arrays.toString(method.getParameterTypes())
                    + "/n");
        }*/


        /*Field [] fields = personClass.getDeclaredFields();
        for (Field field: fields){
            System.out.println(field.getName() + " "
                + field.getType());
        }*/

        /*
        C помощью Java Reflection Api можно:
        1. Создавать новые объекты конкретного класса
        2. Получать методы по сигнатуре
        3. Получать конструктор по сигнатуре
        4. Вызывать методы
         */

        /*Annotation [] annotations = personClass.getAnnotations();
        for (Annotation annotation: annotations){
            if (annotation instanceof Author){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }*/

        Scanner scanner = new Scanner(System.in);
        Class classObject1 = Class.forName(scanner.next()); //ClassName1
        Class classObject2 = Class.forName(scanner.next()); //ClassName2
        String methodName = scanner.next(); //MethodName
        Method method = classObject1.getMethod(methodName, classObject2);
        Object object1 = classObject1.newInstance();
        Object object2 = classObject2.getConstructor(String.class).newInstance("String value");
        method.invoke(object1,object2);
        System.out.println(object1);






    }





}
