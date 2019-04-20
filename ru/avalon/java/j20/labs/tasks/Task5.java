package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
        final int[] array = arrayFactory.getInstance(20);

        ArrayList<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list.toString());

        HashSet<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println(set.toString());

    }
}
