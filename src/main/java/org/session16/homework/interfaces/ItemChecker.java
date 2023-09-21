package org.session16.homework.interfaces;

import java.util.List;

@FunctionalInterface
public interface ItemChecker<T> {

        boolean isItemInList(List<T> itemList, T item);
}
