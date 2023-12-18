package org.session16lambda.homework.interfaces;

import java.util.List;

@FunctionalInterface
public interface ItemChecker<T> {

        boolean isItemInList(List<T> itemList, T item);
}
