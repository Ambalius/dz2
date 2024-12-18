// Интерфейс Driveable, который объявляет метод go()
package com.example.dop_zadanie2;

// Интерфейс Driveable объявляет метод go(), который должен быть реализован в классе, который будет имплементировать этот интерфейс
public interface Driveable {

    // Метод go() будет описывать действия, которые должны быть выполнены для объекта, который может двигаться.
    // Так как это интерфейс, метод не имеет реализации, его должны реализовать конкретные классы.
    void go();
}
